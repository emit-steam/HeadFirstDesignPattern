package com.example.codepractice.DecoratorPattern.CondimentMenu

import com.example.codepractice.DecoratorPattern.CoffeeMenu.Beverage

class Soy(private val beverage: Beverage): CondimentDecorator {

    override fun description(): String {
        return beverage.description() + ", 두유"
    }

    override fun cost(): Double {
        return beverage.cost() + .15
    }
}