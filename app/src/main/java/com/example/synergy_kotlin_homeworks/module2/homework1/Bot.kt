package com.example.synergy_kotlin_homeworks.module2.homework1

class Bot (val name: String, val skill: String) {

    fun greeting(){
        println("Привет! Я бот-$name и я умею $skill")
    }
}