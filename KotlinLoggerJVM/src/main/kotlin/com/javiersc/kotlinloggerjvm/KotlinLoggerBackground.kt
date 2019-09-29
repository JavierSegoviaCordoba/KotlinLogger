package com.javiersc.kotlinloggerjvm

fun Any.logAA(message: String) =
    colorPrint(this::class.simpleName, message, ALL, BG_BLACK, WHITE)

fun Any.jsonAA(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), ALL, BG_BLACK, WHITE)

inline fun <reified T : Any> Any.jsonAA(serializable: T) =
    colorPrintSerializable(this::class.simpleName, jsonPrettyPrint(serializable), ALL, BG_BLACK, WHITE)

fun Any.logDD(message: String) =
    colorPrint(this::class.simpleName, message, DEBUG, BG_GREEN, BLACK)

fun Any.jsonDD(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), DEBUG, BG_GREEN, BLACK)

inline fun <reified T : Any> Any.jsonDD(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        DEBUG,
        BG_GREEN,
        BLACK
    )

fun Any.logII(message: String) =
    colorPrint(this::class.simpleName, message, INFO, BG_BLUE, BLACK)

fun Any.jsonII(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), INFO, BG_BLUE, BLACK)

inline fun <reified T : Any> Any.jsonII(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        INFO,
        BG_BLUE,
        BLACK
    )

fun Any.logWW(message: String) =
    colorPrint(this::class.simpleName, message, WARNING, BG_YELLOW, BLACK)

fun Any.jsonWW(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), WARNING, BG_YELLOW, BLACK)

inline fun <reified T : Any> Any.jsonWW(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        WARNING,
        BG_YELLOW,
        BLACK
    )

fun Any.logEE(message: String) =
    colorPrint(this::class.simpleName, message, ERROR, BG_RED, BRIGHT_RED)

fun Any.jsonEE(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), ERROR, BG_RED, BRIGHT_RED)

inline fun <reified T : Any> Any.jsonEE(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        ERROR,
        BG_RED,
        BRIGHT_RED
    )

fun Any.logFF(message: String) =
    colorPrint(this::class.simpleName, message, FATAL, BG_RED, BLACK)

fun Any.jsonFF(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), FATAL, BG_RED, BLACK)

inline fun <reified T : Any> Any.jsonFF(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        FATAL,
        BG_RED,
        BLACK
    )

fun Any.logOO(message: String) =
    colorPrint(this::class.simpleName, message, OFF, BG_CYAN, BLACK)

fun Any.jsonOO(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), OFF, BG_CYAN, BLACK)

inline fun <reified T : Any> Any.jsonOO(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        OFF,
        BG_CYAN,
        BLACK
    )

fun Any.logTT(message: String) =
    colorPrint(this::class.simpleName, message, TRACE, BG_PURPLE, BLACK)

fun Any.jsonTT(json: String) =
    colorPrintJsonString(this::class.simpleName, jsonPrettyPrint(json), TRACE, BG_PURPLE, BLACK)

inline fun <reified T : Any> Any.jsonTT(serializable: T) =
    colorPrintSerializable(
        this::class.simpleName,
        jsonPrettyPrint(serializable),
        TRACE,
        BG_PURPLE,
        BLACK
    )
