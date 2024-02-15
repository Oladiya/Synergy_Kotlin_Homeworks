package com.example.synergy_kotlin_homeworks

import com.example.synergy_kotlin_homeworks.module3.homework2.Bot

fun main() {

    val first = Bot("поддрежка", "говорить приободряющие фразы")
    val second = Bot("убийца", "убивать кожаных мешков словами")
    val new = Bot("выдумщик", "придумывать оригинальные домашние задания")

    first.greeting()
    second.greeting()
    new.greeting()

}
