package com.example.codepractice.StrategyPattern.duck

import com.example.codepractice.StrategyPattern.fly.FlyNoWay
import com.example.codepractice.StrategyPattern.quack.Quack
import com.orhanobut.logger.Logger

class ModelDuck: Duck() {
    init {
        flyBehavior = FlyNoWay()
        quackBehavior = Quack()
    }
    override fun display() {
        Logger.d("저는 모형오리 입니다.")
    }
}