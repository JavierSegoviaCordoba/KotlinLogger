package com.javiersc.kotlinloggerjvm

fun logA(message: String) = colorPrint(message, ALL, RESET, RESET)

fun jsonA(json: String) = colorPrintJson(json, ALL, RESET, RESET)

inline fun <reified T : Any> jsonA(json: T) = colorPrintJson(json, ALL, RESET, RESET)

fun logD(message: String) = colorPrint(message, DEBUG, RESET, GREEN)

fun jsonD(json: String) = colorPrintJson(json, DEBUG, RESET, GREEN)

inline fun <reified T : Any> jsonD(json: T) = colorPrintJson(json, DEBUG, RESET, GREEN)

fun logI(message: String) = colorPrint(message, INFO, RESET, BLUE)

fun jsonI(json: String) = colorPrintJson(json, INFO, RESET, BLUE)

inline fun <reified T : Any> jsonI(json: T) = colorPrintJson(json, INFO, RESET, BLUE)

fun logW(message: String) = colorPrint(message, WARNING, RESET, YELLOW)

fun jsonW(json: String) = colorPrintJson(json, WARNING, RESET, YELLOW)

inline fun <reified T : Any> jsonW(json: T) = colorPrintJson(json, WARNING, RESET, YELLOW)

fun logE(message: String) = colorPrint(message, ERROR, RESET, BRIGHT_RED)

fun jsonE(json: String) = colorPrintJson(json, ERROR, RESET, BRIGHT_RED)

inline fun <reified T : Any> jsonE(json: T) = colorPrintJson(json, ERROR, RESET, BRIGHT_RED)

fun logF(message: String) = colorPrint(message, FATAL, RESET, RED)

fun jsonF(json: String) = colorPrintJson(json, FATAL, RESET, RED)

inline fun <reified T : Any> jsonF(json: T) = colorPrintJson(json, FATAL, RESET, RED)

fun logO(message: String) = colorPrint(message, OFF, RESET, PURPLE)

fun jsonO(json: String) = colorPrintJson(json, OFF, RESET, PURPLE)

inline fun <reified T : Any> jsonO(json: T) = colorPrintJson(json, OFF, RESET, PURPLE)

fun logT(message: String) = colorPrint(message, TRACE, RESET, CYAN)

fun jsonT(json: String) = colorPrintJson(json, TRACE, RESET, CYAN)

inline fun <reified T : Any> jsonT(json: T) = colorPrintJson(json, TRACE, RESET, CYAN)
