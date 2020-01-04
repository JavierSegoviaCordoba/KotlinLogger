package com.javiersc.kotlinloggerjvm

fun logAA(message: String) = colorPrint(message, ALL, BG_BLACK, WHITE)

fun jsonAA(json: String) = colorPrintJson(json, ALL, BG_BLACK, WHITE)

inline fun <reified T : Any> jsonAA(json: T) = colorPrintJson(json, ALL, BG_BLACK, WHITE)

fun logDD(message: String) = colorPrint(message, DEBUG, BG_GREEN, BLACK)

fun jsonDD(json: String) = colorPrintJson(json, DEBUG, BG_GREEN, BLACK)

inline fun <reified T : Any> jsonDD(json: T) = colorPrintJson(json, DEBUG, BG_GREEN, BLACK)

fun logII(message: String) = colorPrint(message, INFO, BG_BLUE, BLACK)

fun jsonII(json: String) = colorPrintJson(json, INFO, BG_BLUE, BLACK)

inline fun <reified T : Any> jsonII(json: T) = colorPrintJson(json, INFO, BG_BLUE, BLACK)

fun logWW(message: String) = colorPrint(message, WARNING, BG_YELLOW, BLACK)

fun jsonWW(json: String) = colorPrintJson(json, WARNING, BG_YELLOW, BLACK)

inline fun <reified T : Any> jsonWW(json: T) = colorPrintJson(json, WARNING, BG_YELLOW, BLACK)

fun logEE(message: String) = colorPrint(message, ERROR, BG_RED, BRIGHT_RED)

fun jsonEE(json: String) = colorPrintJson(json, ERROR, BG_RED, BRIGHT_RED)

inline fun <reified T : Any> jsonEE(json: T) = colorPrintJson(json, ERROR, BG_RED, BRIGHT_RED)

fun logFF(message: String) = colorPrint(message, FATAL, BG_RED, BLACK)

fun jsonFF(json: String) = colorPrintJson(json, FATAL, BG_RED, BLACK)

inline fun <reified T : Any> jsonFF(json: T) = colorPrintJson(json, FATAL, BG_RED, BLACK)

fun logOO(message: String) = colorPrint(message, OFF, BG_PURPLE, BLACK)

fun jsonOO(json: String) = colorPrintJson(json, OFF, BG_PURPLE, BLACK)

inline fun <reified T : Any> jsonOO(json: T) = colorPrintJson(json, OFF, BG_PURPLE, BLACK)

fun logTT(message: String) = colorPrint(message, TRACE, BG_CYAN, BLACK)

fun jsonTT(json: String) = colorPrintJson(json, TRACE, BG_CYAN, BLACK)

inline fun <reified T : Any> jsonTT(json: T) = colorPrintJson(json, TRACE, BG_CYAN, BLACK)
