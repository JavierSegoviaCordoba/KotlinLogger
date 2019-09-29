package com.javiersc.kotlinloggerjvm

import kotlinx.serialization.ImplicitReflectionSerializer
import kotlinx.serialization.UnstableDefault
import kotlinx.serialization.json.Json
import kotlinx.serialization.stringify


fun colorPrint(
    className: String?,
    message: String,
    level: String,
    backgroundColor: String,
    foregroundColor: String
) {
    println(
        """$backgroundColor$foregroundColor ┌$hashSymbols
 │ $level | file ${stackTrace?.fileName}
 ├$hashSymbols
 │ line ${stackTrace?.lineNumber} | class $className | fun ${stackTrace?.methodName}()
 ├$hashSymbols
 │ $message
 └$hashSymbols$RESET""".trimIndent()
    )
}

fun colorPrintJsonString(
    className: String?,
    jsonLines: List<String>,
    level: String,
    backgroundColor: String = RESET,
    foregroundColor: String = RESET
) {
    println(
        """$backgroundColor$foregroundColor ┌$hashSymbols
 │ $level | file ${stackTrace?.fileName}
 ├$hashSymbols
 │ line ${stackTrace?.lineNumber} | class $className | fun ${stackTrace?.methodName}()
 ├$hashSymbols
""".trimIndent()
    )
    jsonLines.forEach { println(it) }
    println(" └$hashSymbols$RESET")
}

fun colorPrintSerializable(
    className: String?,
    jsonLines: List<String>,
    level: String,
    backgroundColor: String = RESET,
    foregroundColor: String = RESET
) {
    println(
        """$backgroundColor$foregroundColor ┌$hashSymbols
 │ $level | file ${stackTrace?.fileName}
 ├$hashSymbols
 │ line ${stackTrace?.lineNumber} | class $className | fun ${stackTrace?.methodName}()
 ├$hashSymbols
""".trimIndent()
    )
    jsonLines.forEach { println(it) }
    println(" └$hashSymbols$RESET")
}

@UseExperimental(ImplicitReflectionSerializer::class)
@UnstableDefault
fun jsonPrettyPrint(json: String): List<String> {
    val jsonParsed: String = Json.indented.stringify(Json.indented.parseJson(json))
    val jsonParsedLines: MutableList<String> = jsonParsed.lines().toMutableList()
    jsonParsedLines.forEachIndexed { index: Int, line: String ->
        jsonParsedLines[index] = " │ $line"
    }
    return jsonParsedLines
}

@UseExperimental(ImplicitReflectionSerializer::class)
@UnstableDefault
inline fun <reified T : Any> jsonPrettyPrint(serializable: T): List<String> {
    val jsonParsed: String = Json.indented.stringify(serializable)
    val jsonParsedLines: MutableList<String> = jsonParsed.lines().toMutableList()
    jsonParsedLines.forEachIndexed { index: Int, line: String ->
        jsonParsedLines[index] = " │ $line"
    }
    return jsonParsedLines
}

internal const val hashSymbols = "─────────────────────────────────────────────────────────────" +
        "────────────────────────────────────────────────────────────────────────────────────────" +
        "────────────────────────────────────────────────────────────────────────────────────────"

internal val stackTrace: StackTraceElement?
    get() = with(Throwable().stackTrace) {
        return this.firstOrNull { stackTraceElement ->
            (stackTraceElement.fileName != "Utils.kt") and
                    (stackTraceElement.fileName != "KotlinLoggerBackground.kt") and
                    (stackTraceElement.fileName != "KotlinLogger.kt")
        }
    }