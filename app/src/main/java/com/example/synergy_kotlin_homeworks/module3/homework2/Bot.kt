package com.example.synergy_kotlin_homeworks.module3.homework2

class Bot(val name: String, val skill: String) {

    fun greeting() {
        println("Привет! Я бот-$name и я умею $skill")
    }
}