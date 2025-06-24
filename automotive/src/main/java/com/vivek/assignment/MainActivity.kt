package com.vivek.assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        notificationMonitor()
    }

    private fun notificationMonitor() {
        TODO("Not yet implemented")
        val customer = Customer(id = "CUST1001", name = "John Doe", maxSpeedLimit = 80)

        val speedSensor = MockSpeedSensor(95) // Simulated current speed
        val firebaseNotifier = FirebaseNotifier()

        val monitor = SpeedMonitor(speedSensor, firebaseNotifier)
        monitor.monitor(customer)
    }
}