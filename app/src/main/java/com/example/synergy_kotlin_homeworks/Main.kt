package com.example.synergy_kotlin_homeworks


import com.example.synergy_kotlin_homeworks.module3.homework6.SuperBot

fun main() {

    val bot = SuperBot("интелегент", "грамотно строить предложения")

    println("параметр word: " + bot.word)
    println("параметр company: " + bot.company)

    bot.greeting()

}