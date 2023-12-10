package com.example.synergy_kotlin_homeworks

import java.math.RoundingMode

fun main() {

    val allHomeworks: Array<Double> = arrayOf(
        2.1,
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
    }
}

fun module2(homeworkNumber: Int) {
    when (homeworkNumber) {
        1 -> module2_Homework1()
    }
}

fun module2_Homework1() {

    var x = 1

    while (x <= 3) println("$x в квадрате равно ${x * x++}")

}