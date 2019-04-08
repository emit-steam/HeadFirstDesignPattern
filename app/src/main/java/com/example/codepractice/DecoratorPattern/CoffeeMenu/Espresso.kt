package com.example.codepractice.DecoratorPattern.CoffeeMenu

class Espresso : Beverage {
    override fun description(): String {
        return "에스프레소"
    }

    override fun cost(): Double {
        return 1.99
    }
}