package com.example.codepractice.DecoratorPattern.CondimentMenu

import com.example.codepractice.DecoratorPattern.CoffeeMenu.Beverage

// Mocha는 커피가 아닌 추가메뉴(데코레이터)이기 때문에 CondimentDecorator를 상속받는다.
class Mocha(private val beverage: Beverage): CondimentDecorator {

    override fun description(): String {
        return beverage.description() + ", 모카"
    }

    override fun cost(): Double {
        return beverage.cost() + .20
    }
}