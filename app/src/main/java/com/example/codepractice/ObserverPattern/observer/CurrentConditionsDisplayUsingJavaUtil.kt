package com.example.codepractice.ObserverPattern.observer

import com.example.codepractice.ObserverPattern.subject.WeatherDataUsingJavaUtil
import com.orhanobut.logger.Logger
import java.util.*
import java.util.Observer

class CurrentConditionsDisplayUsingJavaUtil(_observable: Observable) : Observer, DisplayElement {
    private var observable = _observable
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        observable.addObserver(this)
    }


    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherDataUsingJavaUtil) {
            this.temperature = o.temperature
            this.humidity = o.humidity
            display()
        }
    }

    override fun display() {
        Logger.d("using JAVA Util Current conditions : " + temperature + "F degrees and " + humidity + "% humidity.")
    }
}