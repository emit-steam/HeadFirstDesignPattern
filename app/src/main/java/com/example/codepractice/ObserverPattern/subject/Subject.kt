package com.example.codepractice.ObserverPattern.subject

import com.example.codepractice.ObserverPattern.observer.Observer

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}