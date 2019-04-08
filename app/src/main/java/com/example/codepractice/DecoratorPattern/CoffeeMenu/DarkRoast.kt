package com.example.codepractice.DecoratorPattern.CoffeeMenu

class DarkRoast: Beverage {
    override fun description(): String {
        return "다크 로스트"
    }

    override fun cost(): Double {
        return .99
    }
}