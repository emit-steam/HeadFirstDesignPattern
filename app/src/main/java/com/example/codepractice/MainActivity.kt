package com.example.codepractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.codepractice.ObserverPattern.WeatherStationActivity
import com.example.codepractice.StrategyPattern.DuckActivity
import com.example.codepractice.StrategyPattern.duck.MallardDuck
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.Logger.addLogAdapter



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.addLogAdapter(AndroidLogAdapter())

        val strategy = findViewById<TextView>(R.id.strategy)
        val observer = findViewById<TextView>(R.id.observer)

        strategy.setOnClickListener {
            val intent = Intent(this, DuckActivity::class.java)
            startActivity(intent)
        }

        observer.setOnClickListener {
            val intent = Intent(this, WeatherStationActivity::class.java)
            startActivity(intent)
        }
    }
}
