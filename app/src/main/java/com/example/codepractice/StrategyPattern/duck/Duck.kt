package com.example.codepractice.StrategyPattern.duck

import com.example.codepractice.StrategyPattern.fly.FlyBehavior
import com.example.codepractice.StrategyPattern.quack.QuackBehavior
import com.orhanobut.logger.Logger

abstract class Duck {
    /* Duck을 상속하는 모든 곳에서 flyBehavior, QuackBehavior를 생성하라 */
    lateinit var flyBehavior: FlyBehavior
    lateinit var quackBehavior: QuackBehavior

    abstract fun display()

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun swim() {
        Logger.d("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.")
    }
}