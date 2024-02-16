package com.example.synergy_kotlin_homeworks.module3.homework5

class SuperBot(name: String, skill: String) : Bot(name, skill) {

    override val word = "супер-бот"
    var company = "OpenAI"

    override fun greeting() {
        println("Привет! Я $word-$name и я умею $skill. Меня разработала компания $company.")
    }
}