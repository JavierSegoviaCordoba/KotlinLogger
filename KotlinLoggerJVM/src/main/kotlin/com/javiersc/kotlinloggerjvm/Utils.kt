package com.javiersc.kotlinloggerjvm

import kotlinx.serialization.json.Json
import kotlinx.serialization.stringify


@PublishedApi
internal fun colorPrint(
    message: String,
    level: String,
    backgroundColor: String = RESET,
    foregroundColor: String = RESET
) = templatePrint(level, backgroundColor, foregroundColor) { println("│ $message") }

@PublishedApi
internal inline fun <reified T : Any> colorPrintJson(
    json: T,
    level: String,
    backgroundColor: String = RESET,
    foregroundColor: String = RESET
) = templatePrint(level, backgroundColor, foregroundColor) { jsonPrettyPrint(json) }

@PublishedApi
internal inline fun templatePrint(
    level: String,
    backgroundColor: String = RESET,
    foregroundColor: String = RESET,
    printer: () -> Unit
) {
    print("$backgroundColor$foregroundColor")
    println(
        """ 
            ┌$hashSymbols
            │ $level.$fileLink │ $fileN │ $classN │ $methodN │ $lineN
            ├$hashSymbols
        """.trimIndent()
    )
    printer.invoke()
    println("└$hashSymbols$RESET")
}

@PublishedApi
internal inline fun <reified T : Any> jsonPrettyPrint(json: T) {
    val jsonParsed: String =
        if (json !is String) Json.indented.stringify(json)
        else Json.indented.stringify(Json.indented.parseJson(json))
    jsonParsed.lines().forEach { line: String -> println("│ $line") }
}

@PublishedApi
internal const val hashSymbols = "───────────────────────────────────────────────────────────────" +
        "────────────────────────────────────────────────────────────────────────────────────────" +
        "────────────────────────────────────────────────────────────────────────────────────────" +
        "───────────────────────────────────────────────────────────────────────────────────────."

@PublishedApi
internal val stackTrace: StackTraceElement?
    get() = with(Throwable().stackTrace) {
        return this.firstOrNull { stackTraceElement ->
            (stackTraceElement.fileName != "Utils.kt") and
                    (stackTraceElement.fileName != "KotlinLoggerBackground.kt") and
                    (stackTraceElement.fileName != "KotlinLogger.kt")
        }
    }

@PublishedApi
internal val fileN
    get() = "file ${stackTrace?.fileName ?: "Unknown"}"
@PublishedApi
internal val classN
    get() = "class ${stackTrace?.className ?: "Unknown"}"
@PublishedApi
internal val methodN
    get() = "fun ${stackTrace?.methodName ?: "Unknown"}()"
@PublishedApi
internal val lineN
    get() = "line ${stackTrace?.lineNumber ?: "Unknown"}"
@PublishedApi
internal val fileLink
    get() = "(${stackTrace?.fileName}:${stackTrace?.lineNumber})"
