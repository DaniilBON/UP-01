package com.example.practice

import android.bluetooth.BluetoothClass.Device
import android.content.Intent
import android.net.Uri.Builder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.sql.Types

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Practice)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button_Info)
        
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.dialogName)
            builder.setTitle(R.string.dialogMessage)
            builder.setPositiveButton("ОК"){dialogInterface, which ->
                Toast.makeText(applicationContext, "Нажмите ОК", Toast.LENGTH_LONG).show() }

            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
         }


    }
    fun Room (view: View){
        val intent: Intent = Intent(this@MainActivity, RoomActivity::class.java)
        startActivity(intent)
    }
    fun Login (view: View){
        val intent: Intent = Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
    }
    fun Types(view: View){
        val intent: Intent = Intent(this@MainActivity, TypesOfDeviceActivity::class.java)
        startActivity(intent)
    }
    fun Device(view: View){
        val intent: Intent = Intent(this@MainActivity, DeviceActivity::class.java)
        startActivity(intent)
    }
}