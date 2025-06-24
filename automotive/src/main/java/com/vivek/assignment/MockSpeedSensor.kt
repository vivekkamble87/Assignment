package com.vivek.assignment

class MockSpeedSensor(private val speed: Int) : SpeedSensorManager {
    override fun getCurrentSpeed(): Int = speed
}