package com.example.codepractice.StrategyPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.codepractice.R
import com.example.codepractice.StrategyPattern.duck.MallardDuck
import com.example.codepractice.StrategyPattern.duck.ModelDuck
import com.example.codepractice.StrategyPattern.fly.FlyRocketPowered

class DuckActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy)

        val mallard = findViewById<TextView>(R.id.mallard)
        val model = findViewById<TextView>(R.id.model)

        mallard.setOnClickListener {
            val mallard = MallardDuck()
            mallard.performQuack()
            mallard.performFly()
            mallard.display()
            mallard.swim()
        }

        model.setOnClickListener {
            val model = ModelDuck()
            model.performFly()
            model.flyBehavior = FlyRocketPowered()
            model.performFly()
        }
    }
}