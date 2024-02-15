package com.example.synergy_kotlin_homeworks

import com.example.synergy_kotlin_homeworks.module3.homework1.Bot

fun main() {

    val first = Bot("поддрежка", "говорить приободряющие фразы")
    val second = Bot("убийца", "убивать кожаных мешков словами")

    first.greeting()
    second.greeting()

}