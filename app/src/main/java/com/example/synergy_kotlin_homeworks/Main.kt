package com.example.synergy_kotlin_homeworks

import com.example.synergy_kotlin_homeworks.module3.homework1.Bot
import com.example.synergy_kotlin_homeworks.module3.homework5.SuperBot
import java.math.RoundingMode
import com.example.synergy_kotlin_homeworks.module3.homework2.Bot as Bot2
import com.example.synergy_kotlin_homeworks.module3.homework6.SuperBot as SuperBot2

fun main() {

    val allHomeworks: Array<Double> = arrayOf(
        2.1, 2.2, 2.3, 2.4, 2.5,
        3.1, 3.2, 3.3, 3.4, 3.5, 3.6,
    )

    var lastModuleNumber: Int? = null
    allHomeworks.forEach {
        val moduleNumber = getModuleNumber(it)
        val homeworkNumber = getHomeworkNumber(it)

        if ((lastModuleNumber == null) or (moduleNumber != lastModuleNumber)) {
            println("Модуль $moduleNumber\n")
        }
        println("Домашняя работа $homeworkNumber")

        print("Вывод:\n")
        callModule(moduleNumber, homeworkNumber)
        println()

        lastModuleNumber = moduleNumber
    }
}

fun getModuleNumber(double: Double): Int {
    return double.toBigDecimal().setScale(1, RoundingMode.FLOOR).toInt()
}

fun getHomeworkNumber(double: Double): Int {
    return (double * 10 % 10).toInt()
}

fun callModule(moduleNumber: Int, homeworkNumber: Int) {
    when (moduleNumber) {
        2 -> module2(homeworkNumber)
        3 -> module3(homeworkNumber)
    }
}

fun module2(homeworkNumber: Int) {
    when (homeworkNumber) {
        1 -> module2_homework1()
        2 -> module2_homework2()
        3 -> module2_homework3()
        4 -> module2_homework4()
        5 -> module2_homework5()
    }
}

fun module3(homeworkNumber: Int) {
    when (homeworkNumber) {
        1 -> module3_homework1()
        2 -> module3_homework2()
        3 -> module3_homework3()
        4 -> module3_homework4()
        5 -> module3_homework5()
        6 -> module3_homework6()
    }
}

fun module2_homework1() {

    var x = 1

    while (x <= 3) println("$x в квадрате равно ${x * x++}")

}

fun module2_homework2() {

    for (n in 1..7) println("Значение переменной \"n\" равно $n")

}

fun module2_homework3() {

    var x = 1

    while (x <= 6) println("Значение переменной \"x\" равно ${x++}")

}

fun module2_homework4() {

    var y = 5

    while (y >= 2) println("Значение переменной \"y\" равно ${y--}")

}

fun module2_homework5() {

    var x = 1

    while (x <= 3) println("$x в квадрате равно ${x * x++}")

}

fun module3_homework1() {

    val first = Bot("поддрежка", "говорить приободряющие фразы")
    val second = Bot("убийца", "убивать кожаных мешков словами")

    first.greeting()
    second.greeting()

}

fun module3_homework2() {

    val first = Bot2("поддрежка", "говорить приободряющие фразы")
    val second = Bot2("убийца", "убивать кожаных мешков словами")
    val new = Bot2("выдумщик", "придумывать оригинальные домашние задания")

    first.greeting()
    second.greeting()
    new.greeting()

}

fun module3_homework3() {

    println("Функция first() возвращает: ${first()}")

}

fun first(): Int {
    return 10 * 6
}

fun module3_homework4() {

    val names = arrayOf("Jim", "Sam", "Martin")

    for (name in names) {
        print("$name \t")
    }
    println()
}

fun module3_homework5() {

    val bot = SuperBot("интелегент", "грамотно строить предложения")

    println("параметр word: " + bot.word)
    println("параметр company: " + bot.company)

    bot.greeting()

}

fun module3_homework6() {

    val bot = SuperBot2("интелегент", "грамотно строить предложения")

    println("параметр word: " + bot.word)
    println("параметр company: " + bot.company)

    bot.greeting()

}