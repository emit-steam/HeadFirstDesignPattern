package com.example.codepractice.ObserverPattern.observer

import com.example.codepractice.ObserverPattern.subject.Subject
import com.orhanobut.logger.Logger

class CurrentConditionsDisplay(_weatherData: Subject) : Observer,
    DisplayElement {
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var weatherData: Subject = _weatherData

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        Logger.d("using Custom Current conditions : " + temperature + "F degrees and " + humidity + "% humidity.")
    }
}