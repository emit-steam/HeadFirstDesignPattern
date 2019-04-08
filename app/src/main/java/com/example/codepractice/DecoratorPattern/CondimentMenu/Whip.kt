package com.example.codepractice.DecoratorPattern.CondimentMenu

import com.example.codepractice.DecoratorPattern.CoffeeMenu.Beverage

class Whip(private val beverage: Beverage): CondimentDecorator {

    override fun description(): String {
        return beverage.description() + ", 휘핑크림"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}