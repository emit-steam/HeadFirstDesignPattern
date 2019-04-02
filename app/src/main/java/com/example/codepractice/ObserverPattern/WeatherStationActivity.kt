package com.example.codepractice.ObserverPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.codepractice.ObserverPattern.observer.CurrentConditionsDisplay
import com.example.codepractice.ObserverPattern.observer.CurrentConditionsDisplayUsingJavaUtil
import com.example.codepractice.ObserverPattern.subject.WeatherData
import com.example.codepractice.ObserverPattern.subject.WeatherDataUsingJavaUtil
import com.example.codepractice.R

class WeatherStationActivity : AppCompatActivity() {
    private val weatherData = WeatherData()
    private val currentConditionsDiaplay = CurrentConditionsDisplay(weatherData)

    private val weatherDataUsingJavaUtil = WeatherDataUsingJavaUtil()
    private val currentConditionsDisplayUsingJavaUtil = CurrentConditionsDisplayUsingJavaUtil(weatherDataUsingJavaUtil)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_observer)

        val customObserverView = findViewById<TextView>(R.id.change_conditions_using_custom_observer)
        customObserverView.setOnClickListener {
            weatherData.setMeasurements(80f, 65f,30.4f)
            weatherData.setMeasurements(83f, 70f,29.1f)
            weatherData.setMeasurements(78f, 90f,30.4f)
        }

        val javaUtilObserverView = findViewById<TextView>(R.id.change_conditions_using_java_util)
        javaUtilObserverView.setOnClickListener {
            weatherDataUsingJavaUtil.setMeasurements(80f, 65f,30.4f)
            weatherDataUsingJavaUtil.setMeasurements(83f, 70f,29.1f)
            weatherDataUsingJavaUtil.setMeasurements(78f, 90f,30.4f)
        }
    }
}