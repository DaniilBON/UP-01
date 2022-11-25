package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AddRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_room)
    }

    fun Profile(view: View) {
        val intent: Intent = Intent(this@AddRoomActivity, ProfileActivity::class.java)
        startActivity(intent)
    }

    fun AddRoom(view: View) {
        val roomText1: TextView = findViewById(R.id.editTextRoom1)
        val roomText2: TextView = findViewById(R.id.editTextRoom2)
        val roomText3: TextView = findViewById(R.id.editTextRoom3)
        val roomText4: TextView = findViewById(R.id.editTextRoom4)
        val roomText5: TextView = findViewById(R.id.editTextRoom5)
        val roomText6: TextView = findViewById(R.id.editTextRoom6)
        val roomText7: TextView = findViewById(R.id.editTextRoom7)
        val roomText8: TextView = findViewById(R.id.editTextRoom8)
        val roomText9: TextView = findViewById(R.id.editTextRoom9)
        val roomText10: TextView = findViewById(R.id.editTextRoom10)
        val roomText11: TextView = findViewById(R.id.editTextRoom11)
        val roomText12: TextView = findViewById(R.id.editTextRoom12)
        val roomText13: TextView = findViewById(R.id.editTextRoom13)
        val roomText14: TextView = findViewById(R.id.editTextRoom14)
        val roomText15: TextView = findViewById(R.id.editTextRoom15)
        val roomText16: TextView = findViewById(R.id.editTextRoom16)
        val roomText17: TextView = findViewById(R.id.editTextRoom17)
        val roomText18: TextView = findViewById(R.id.editTextRoom18)

        val room1 = roomText1.text.toString()
        val room2 = roomText2.text.toString()
        val room3 = roomText3.text.toString()
        val room4 = roomText4.text.toString()
        val room5 = roomText5.text.toString()
        val room6 = roomText6.text.toString()
        val room7 = roomText7.text.toString()
        val room8 = roomText8.text.toString()
        val room9 = roomText9.text.toString()
        val room10 = roomText10.text.toString()
        val room11 = roomText11.text.toString()
        val room12 = roomText12.text.toString()
        val room13 = roomText13.text.toString()
        val room14 = roomText14.text.toString()
        val room15 = roomText15.text.toString()
        val room16 = roomText16.text.toString()
        val room17 = roomText17.text.toString()
        val room18 = roomText18.text.toString()

        val intent: Intent = Intent(this@AddRoomActivity, RoomActivity::class.java)
        intent.putExtra("Room1", room1)
        intent.putExtra("Room2", room2)
        intent.putExtra("Room3", room3)
        intent.putExtra("Room4", room4)
        intent.putExtra("Room5", room5)
        intent.putExtra("Room6", room6)
        intent.putExtra("Room7", room7)
        intent.putExtra("Room8", room8)
        intent.putExtra("Room9", room9)
        intent.putExtra("Room10", room10)
        intent.putExtra("Room11", room11)
        intent.putExtra("Room12", room12)
        intent.putExtra("Room13", room13)
        intent.putExtra("Room14", room14)
        intent.putExtra("Room15", room15)
        intent.putExtra("Room16", room16)
        intent.putExtra("Room17", room17)
        intent.putExtra("Room18", room18)

        startActivity(intent)
    }
}