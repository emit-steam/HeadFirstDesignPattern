package com.example.codepractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.codepractice.Dagger2.DaggerExam1Activity
import com.example.codepractice.Dagger2.DaggerExam2Activity
import com.example.codepractice.Dagger2.DaggerExam3Activity
import com.example.codepractice.DecoratorPattern.StarBuzzCoffeeActivity
import com.example.codepractice.ObserverPattern.WeatherStationActivity
import com.example.codepractice.StrategyPattern.DuckActivity
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.addLogAdapter(AndroidLogAdapter())

        val strategy = findViewById<TextView>(R.id.strategy)
        val observer = findViewById<TextView>(R.id.observer)
        val decorator = findViewById<TextView>(R.id.decorator)
        val daggerExam1 = findViewById<TextView>(R.id.dagger_exam1)
        val daggerExam2 = findViewById<TextView>(R.id.dagger_exam2)
        val daggerExam3 = findViewById<TextView>(R.id.dagger_exam3)

        strategy.setOnClickListener {
            val intent = Intent(this, DuckActivity::class.java)
            startActivity(intent)
        }

        observer.setOnClickListener {
            val intent = Intent(this, WeatherStationActivity::class.java)
            startActivity(intent)
        }

        decorator.setOnClickListener {
            val intent = Intent(this, StarBuzzCoffeeActivity::class.java)
            startActivity(intent)
        }

        daggerExam1.setOnClickListener {
            val intent = Intent(this, DaggerExam1Activity::class.java)
            startActivity(intent)
        }

        daggerExam2.setOnClickListener {
            val intent = Intent(this, DaggerExam2Activity::class.java)
            startActivity(intent)
        }

        daggerExam3.setOnClickListener {
            val intent = Intent(this, DaggerExam3Activity::class.java)
            startActivity(intent)
        }
    }
}
