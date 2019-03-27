package com.example.codepractice.StrategyPattern.duck

import com.example.codepractice.StrategyPattern.fly.FlyWithWings
import com.example.codepractice.StrategyPattern.quack.Quack
import com.orhanobut.logger.Logger

class MallardDuck: Duck() {
    init {
        quackBehavior = Quack()
        flyBehavior = FlyWithWings()
    }
    override fun display() {
        Logger.d("저는 물오리입니다.")
    }
}