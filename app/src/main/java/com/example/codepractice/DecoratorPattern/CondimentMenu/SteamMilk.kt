package com.example.codepractice.DecoratorPattern.CondimentMenu

import com.example.codepractice.DecoratorPattern.CoffeeMenu.Beverage

class SteamMilk(private val beverage: Beverage): CondimentDecorator {

    override fun description(): String {
        return beverage.description() + ", 스팀 밀크"
    }

    override fun cost(): Double {
        return beverage.cost() + .10
    }
}