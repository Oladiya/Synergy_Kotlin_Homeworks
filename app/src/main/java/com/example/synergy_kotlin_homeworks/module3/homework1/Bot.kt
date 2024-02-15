package com.example.synergy_kotlin_homeworks.module3.homework1

class Bot(val name: String, val skill: String) {

    fun greeting() {
        println("Привет! Я бот-$name и я умею $skill")
    }
}