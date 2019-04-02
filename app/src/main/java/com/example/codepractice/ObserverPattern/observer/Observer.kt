package com.example.codepractice.ObserverPattern.observer

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}