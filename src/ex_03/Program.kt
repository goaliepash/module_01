package ex_03

/*
    Задание 3: Преобразование

    Преобразуйте  var five: Char = '5' в String, Byte, Short, Int, Double, FLoat и Long
 */

fun main() {
    var five: Char = '5'

    println(five.toString() is String)  // true
    println(five.toByte() is Byte)  // true
    println(five.toShort() is Short)    // true
    println(five.toInt() is Int)    // true
    println(five.toDouble() is Double)  // true
    println(five.toFloat() is Float)    // true
    println(five.toLong() is Long)  // true
}