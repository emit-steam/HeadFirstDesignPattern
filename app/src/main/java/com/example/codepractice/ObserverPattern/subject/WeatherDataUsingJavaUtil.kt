package com.example.codepractice.ObserverPattern.subject

import java.util.*

class WeatherDataUsingJavaUtil: Observable() {
    var temperature: Float = 0.0f
        private set
    var humidity: Float = 0.0f
        private set
    var pressure: Float = 0.0f
        private set

    private fun measurementsChanged() {
        setChanged() // 상태가 바뀌었음을 알림
        notifyObservers() // notifyObservers()를 호출할때 객체르 ㄹ보내지 않음, 여기서는 풀 모델을 사용하고 있다는 뜻
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}