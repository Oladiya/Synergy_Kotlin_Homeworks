package com.example.synergy_kotlin_homeworks.module3.homework5

open class Bot(val name: String, val skill: String) {

    open val word = "бот"

    open fun greeting() {
        println("Привет! Я $word-$name и я умею $skill")
    }
}