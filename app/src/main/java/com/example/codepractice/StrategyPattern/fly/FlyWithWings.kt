package com.example.codepractice.StrategyPattern.fly

import com.orhanobut.logger.Logger
import timber.log.Timber

class FlyWithWings: FlyBehavior {
    override fun fly() {
        Logger.d("날고있어요!")
    }
}