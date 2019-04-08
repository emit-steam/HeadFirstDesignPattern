package com.example.codepractice.DecoratorPattern.CoffeeMenu

class HouseBlend: Beverage {
    override fun description(): String {
        return "하우스 블렌드 커피"
    }

    override fun cost(): Double {
        return .89
    }
}