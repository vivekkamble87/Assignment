package com.vivek.assignment

class SpeedMonitor (
    private val speedSensor: SpeedSensorManager,
    private val firebaseNotifier: FirebaseNotifier
) {
    fun monitor(customer: Customer) {
        val currentSpeed = speedSensor.getCurrentSpeed()
        if (currentSpeed > customer.maxSpeedLimit) {
            val alertMessage = "Speed exceeded! Limit: ${customer.maxSpeedLimit}, Current: $currentSpeed"

            // Log or handle user warning (stubbed here)
            println("Warning to user: $alertMessage")

            // Notify rental company via Firebase
            firebaseNotifier.sendAlert(customer, alertMessage)
        }
    }
}