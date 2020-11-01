package ex_06

/*
    Задание 6: Сравнение

    Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”. Проверьте больше ли "a"
    чем "b" и получите результат в виде переменой типа boolean.
 */

fun main() {
    print("Введите a: ")
    val userA: String? = readLine()
    print("Введите b: ")
    val userB: String? = readLine()

    val a: Double = userA!!.toDouble()
    val b: Double = userB!!.toDouble()

    if (a > b) {
        println("$a больше $b")
    } else {
        println("$a не больше, чем $b")
    }
}