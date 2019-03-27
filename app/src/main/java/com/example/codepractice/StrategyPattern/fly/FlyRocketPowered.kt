package com.example.codepractice.StrategyPattern.fly

import com.orhanobut.logger.Logger

class FlyRocketPowered: FlyBehavior {
    override fun fly() {
        Logger.d("로켓 추진으로 날아갑니다.")
    }
}