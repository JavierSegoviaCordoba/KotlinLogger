package com.javiersc.kotlinloggerjvm

fun Any.logA(message: String) = colorPrint(this::class.simpleName, message, ALL, RESET, RESET)

fun Any.jsonA(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), ALL, RESET, RESET)

inline fun <reified T : Any> Any.jsonA(serializable: T) =
    colorPrintSerializable(this::class.simpleName, jsonPrettyPrint(serializable), ALL, RESET, RESET)

fun Any.logD(message: String) = colorPrint(this::class.simpleName, message, DEBUG, RESET, GREEN)

fun Any.jsonD(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), DEBUG, RESET, GREEN)

inline fun <reified T : Any> Any.jsonD(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        DEBUG,
        RESET,
        GREEN
    )

fun Any.logI(message: String) = colorPrint(this::class.simpleName, message, INFO, RESET, BLUE)

fun Any.jsonI(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), INFO, RESET, BLUE)

inline fun <reified T : Any> Any.jsonI(serializable: T) =
    colorPrintSerializable(this::class.simpleName, jsonPrettyPrint(serializable), INFO, RESET, BLUE)

fun Any.logW(message: String) = colorPrint(this::class.simpleName, message, WARNING, RESET, YELLOW)

fun Any.jsonW(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), WARNING, RESET, YELLOW)

inline fun <reified T : Any> Any.jsonW(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        WARNING,
        RESET,
        YELLOW
    )

fun Any.logE(message: String) =
    colorPrint(this::class.simpleName, message, ERROR, RESET, BRIGHT_RED)

fun Any.jsonE(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), ERROR, RESET, BRIGHT_RED)

inline fun <reified T : Any> Any.jsonE(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        ERROR,
        RESET,
        BRIGHT_RED
    )

fun Any.logF(message: String) = colorPrint(this::class.simpleName, message, FATAL, RESET, RED)

fun Any.jsonF(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), FATAL, RESET, RED)

inline fun <reified T : Any> Any.jsonF(serializable: T) =
    colorPrintSerializable(this::class.simpleName, jsonPrettyPrint(serializable), FATAL, RESET, RED)

fun Any.logO(message: String) = colorPrint(this::class.simpleName, message, OFF, RESET, CYAN)

fun Any.jsonO(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), OFF, RESET, CYAN)

inline fun <reified T : Any> Any.jsonO(serializable: T) =
    colorPrintSerializable(this::class.simpleName, jsonPrettyPrint(serializable), OFF, RESET, CYAN)

fun Any.logT(message: String) = colorPrint(this::class.simpleName, message, TRACE, RESET, PURPLE)

fun Any.jsonT(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), TRACE, RESET, PURPLE)

inline fun <reified T : Any> Any.jsonT(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        TRACE,
        RESET,
        PURPLE
    )
