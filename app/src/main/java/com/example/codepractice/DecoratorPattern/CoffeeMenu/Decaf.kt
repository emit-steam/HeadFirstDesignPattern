package com.example.codepractice.DecoratorPattern.CoffeeMenu

class Decaf: Beverage {
    override fun description(): String {
        return "디카페인"
    }

    override fun cost(): Double {
        return 1.05
    }
}