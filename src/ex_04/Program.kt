package ex_04

/*
    Задание 4: Приветствие пользователя
    Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода
    имени.
*/

fun main() {
    print("Напишите своё имя: ")
    val userText: String? = readLine()
    val userName: String = userText.toString()
    println("Здравствуйте, $userName!")
}