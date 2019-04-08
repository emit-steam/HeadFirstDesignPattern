package com.example.codepractice.DecoratorPattern

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.codepractice.DecoratorPattern.CoffeeMenu.Beverage
import com.example.codepractice.DecoratorPattern.CoffeeMenu.Espresso
import com.example.codepractice.DecoratorPattern.CondimentMenu.Mocha
import com.example.codepractice.DecoratorPattern.CondimentMenu.Soy
import com.example.codepractice.DecoratorPattern.CondimentMenu.Whip
import com.example.codepractice.R
import com.orhanobut.logger.Logger

class StarBuzzCoffeeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decorator)

        val orderEspresso = findViewById<TextView>(R.id.order_espresso)
        val orderDarkRoast = findViewById<TextView>(R.id.order_dark_roast)
        val orderHouseBlend = findViewById<TextView>(R.id.order_house_blend)

        orderEspresso.setOnClickListener {
            val beverage: Beverage = Espresso()
            Logger.d(beverage.description() + " $" + beverage.cost())
        }

        orderDarkRoast.setOnClickListener {
            var beverage: Beverage = Espresso()
            beverage = Mocha(beverage)
            beverage = Mocha(beverage)
            beverage = Whip(beverage)
            Logger.d(beverage.description() + " $" + beverage.cost())
        }

        orderHouseBlend.setOnClickListener {
            var beverage: Beverage = Espresso()
            beverage = Soy(beverage)
            beverage = Mocha(beverage)
            beverage = Whip(beverage)
            Logger.d(beverage.description() + " $" + beverage.cost())
        }
    }
}