package com.example.codepractice.StrategyPattern.fly

import com.orhanobut.logger.Logger

class FlyNoWay: FlyBehavior {
    override fun fly() {
        Logger.d("나는 못날아요")
    }
}