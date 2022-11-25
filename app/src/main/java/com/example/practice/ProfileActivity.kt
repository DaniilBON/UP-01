package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }
    fun Back (view: View){
        val intent: Intent = Intent(this@ProfileActivity, MainActivity::class.java)
        startActivity(intent)
    }
    fun AddDevice_1 (view: View){
        val intent: Intent = Intent(this@ProfileActivity, AddRoomActivity::class.java)
        startActivity(intent)
    }
    fun AddDevice_2 (view: View){
        val intent: Intent = Intent(this@ProfileActivity, AddTypesActivity::class.java)
        startActivity(intent)
    }
    fun AddDevice_3 (view: View){
        val intent: Intent = Intent(this@ProfileActivity, AddDeviceActivity::class.java)
        startActivity(intent)
    }

}