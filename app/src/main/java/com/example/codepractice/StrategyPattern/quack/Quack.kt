package com.example.codepractice.StrategyPattern.quack

import com.orhanobut.logger.Logger
import timber.log.Timber

class Quack: QuackBehavior {
    override fun quack() {
        Logger.d("꽥")
    }
}