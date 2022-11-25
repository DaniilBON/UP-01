package com.example.practice

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RoomActivity : AppCompatActivity() {

    private val sharedPrefFile2 = "kotlinsharedpreference2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val textView: TextView = findViewById<TextView>(R.id.textInfo1)
        val textView2: TextView = findViewById<TextView>(R.id.textInfo2)
        val textView3: TextView = findViewById<TextView>(R.id.textInfo3)
        val textView4: TextView = findViewById<TextView>(R.id.textInfo4_1)
        val textView5: TextView = findViewById<TextView>(R.id.textInfo5)
        val textView6: TextView = findViewById<TextView>(R.id.textInfo6)
        val textView7: TextView = findViewById<TextView>(R.id.textView7)
        val textView8: TextView = findViewById<TextView>(R.id.textView8)
        val textView9: TextView = findViewById<TextView>(R.id.textView9_1)
        val textView10: TextView = findViewById<TextView>(R.id.textInfo10)
        val textView11: TextView = findViewById<TextView>(R.id.textInfo11)
        val textView12: TextView = findViewById<TextView>(R.id.textInfo12)
        val textView13: TextView = findViewById<TextView>(R.id.textView13)
        val textView14: TextView = findViewById<TextView>(R.id.textView14)
        val textView15: TextView = findViewById<TextView>(R.id.textView15)
        val textView16: TextView = findViewById<TextView>(R.id.textView16)
        val textView17: TextView = findViewById<TextView>(R.id.textView17)
        val textView18: TextView = findViewById<TextView>(R.id.textView18)

        val outputView = findViewById<TextView>(R.id.textInfo1)
        val outputView2 = findViewById<TextView>(R.id.textInfo2)
        val outputView3 = findViewById<TextView>(R.id.textInfo3)
        val outputView4 = findViewById<TextView>(R.id.textInfo4_1)
        val outputView5 = findViewById<TextView>(R.id.textInfo5)
        val outputView6 = findViewById<TextView>(R.id.textInfo6)
        val outputView7 = findViewById<TextView>(R.id.textView7)
        val outputView8 = findViewById<TextView>(R.id.textView8)
        val outputView9 = findViewById<TextView>(R.id.textView9_1)
        val outputView10 = findViewById<TextView>(R.id.textInfo10)
        val outputView11 = findViewById<TextView>(R.id.textInfo11)
        val outputView12 = findViewById<TextView>(R.id.textInfo12)
        val outputView13 = findViewById<TextView>(R.id.textView13)
        val outputView14 = findViewById<TextView>(R.id.textView14)
        val outputView15 = findViewById<TextView>(R.id.textView15)
        val outputView16 = findViewById<TextView>(R.id.textView16)
        val outputView17 = findViewById<TextView>(R.id.textView17)
        val outputView18 = findViewById<TextView>(R.id.textView18)

        val btnSave = findViewById<Button>(R.id.ButtonSave)
        val btnView = findViewById<Button>(R.id.ButtonView)
        val sharedPreferences: SharedPreferences =
            this.getSharedPreferences(sharedPrefFile2,Context.MODE_PRIVATE)
        btnSave.setOnClickListener(View.OnClickListener {
            val room1: String = textView.text.toString()
            val room2: String = textView2.text.toString()
            val room3: String = textView3.text.toString()
            val room4: String = textView4.text.toString()
            val room5: String = textView5.text.toString()
            val room6: String = textView6.text.toString()
            val room7: String = textView7.text.toString()
            val room8: String = textView8.text.toString()
            val room9: String = textView9.text.toString()
            val room10: String = textView10.text.toString()
            val room11: String = textView11.text.toString()
            val room12: String = textView12.text.toString()
            val room13: String = textView13.text.toString()
            val room14: String = textView14.text.toString()
            val room15: String = textView15.text.toString()
            val room16: String = textView16.text.toString()
            val room17: String = textView17.text.toString()
            val room18: String = textView18.text.toString()

            val editor:SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("Room1", room1)
            editor.putString("Room2", room2)
            editor.putString("Room3", room3)
            editor.putString("Room4", room4)
            editor.putString("Room5", room5)
            editor.putString("Room6", room6)
            editor.putString("Room7", room7)
            editor.putString("Room8", room8)
            editor.putString("Room9", room9)
            editor.putString("Room10", room10)
            editor.putString("Room11", room11)
            editor.putString("Room12", room12)
            editor.putString("Room13", room13)
            editor.putString("Room14", room14)
            editor.putString("Room15", room15)
            editor.putString("Room16", room16)
            editor.putString("Room17", room17)
            editor.putString("Room18", room18)
            editor.apply()
            editor.commit()
        })
        btnView.setOnClickListener {
            val sharedRoom1Value = sharedPreferences.getString("Room1", "defaultname")
            val sharedRoom2Value = sharedPreferences.getString("Room2", "defaultname")
            val sharedRoom3Value = sharedPreferences.getString("Room3", "defaultname")
            val sharedRoom4Value = sharedPreferences.getString("Room4", "defaultname")
            val sharedRoom5Value = sharedPreferences.getString("Room5", "defaultname")
            val sharedRoom6Value = sharedPreferences.getString("Room6", "defaultname")
            val sharedRoom7Value = sharedPreferences.getString("Room7", "defaultname")
            val sharedRoom8Value = sharedPreferences.getString("Room8", "defaultname")
            val sharedRoom9Value = sharedPreferences.getString("Room9", "defaultname")
            val sharedRoom10Value = sharedPreferences.getString("Room10", "defaultname")
            val sharedRoom11Value = sharedPreferences.getString("Room11", "defaultname")
            val sharedRoom12Value = sharedPreferences.getString("Room12", "defaultname")
            val sharedRoom13Value = sharedPreferences.getString("Room13", "defaultname")
            val sharedRoom14Value = sharedPreferences.getString("Room14", "defaultname")
            val sharedRoom15Value = sharedPreferences.getString("Room15", "defaultname")
            val sharedRoom16Value = sharedPreferences.getString("Room16", "defaultname")
            val sharedRoom17Value = sharedPreferences.getString("Room17", "defaultname")
            val sharedRoom18Value = sharedPreferences.getString("Room18", "defaultname")

            if (sharedRoom1Value.equals("defaultname") && sharedRoom2Value.equals("defaultname")
                && sharedRoom3Value.equals("defaultname") && sharedRoom4Value.equals("defaultname")
                && sharedRoom5Value.equals("defaultname") && sharedRoom6Value.equals("defaultname")
                && sharedRoom7Value.equals("defaultname") && sharedRoom8Value.equals("defaultname")
                && sharedRoom9Value.equals("defaultname") && sharedRoom10Value.equals("defaultname")
                && sharedRoom11Value.equals("defaultname") && sharedRoom12Value.equals("defaultname")
                && sharedRoom13Value.equals("defaultname") && sharedRoom14Value.equals("defaultname")
                && sharedRoom15Value.equals("defaultname") && sharedRoom16Value.equals("defaultname")
                && sharedRoom17Value.equals("defaultname") && sharedRoom18Value.equals("defaultname")) {
                outputView.setText("default room1: ${sharedRoom1Value}").toString()
                outputView.setText("default room2: ${sharedRoom2Value}").toString()
                outputView.setText("default room3: ${sharedRoom3Value}").toString()
                outputView.setText("default room4: ${sharedRoom4Value}").toString()
                outputView.setText("default room5: ${sharedRoom5Value}").toString()
                outputView.setText("default room6: ${sharedRoom6Value}").toString()
                outputView.setText("default room7: ${sharedRoom7Value}").toString()
                outputView.setText("default room8: ${sharedRoom8Value}").toString()
                outputView.setText("default room9: ${sharedRoom9Value}").toString()
                outputView.setText("default room10: ${sharedRoom10Value}").toString()
                outputView.setText("default room11: ${sharedRoom11Value}").toString()
                outputView.setText("default room12: ${sharedRoom12Value}").toString()
                outputView.setText("default room13: ${sharedRoom13Value}").toString()
                outputView.setText("default room14: ${sharedRoom14Value}").toString()
                outputView.setText("default room15: ${sharedRoom15Value}").toString()
                outputView.setText("default room16: ${sharedRoom16Value}").toString()
                outputView.setText("default room17: ${sharedRoom17Value}").toString()
                outputView.setText("default room18: ${sharedRoom18Value}").toString()
            } else {
                outputView.setText(sharedRoom1Value).toString()
                outputView2.setText(sharedRoom2Value).toString()
                outputView3.setText(sharedRoom3Value).toString()
                outputView4.setText(sharedRoom4Value).toString()
                outputView5.setText(sharedRoom5Value).toString()
                outputView6.setText(sharedRoom6Value).toString()
                outputView7.setText(sharedRoom7Value).toString()
                outputView8.setText(sharedRoom8Value).toString()
                outputView9.setText(sharedRoom9Value).toString()
                outputView10.setText(sharedRoom10Value).toString()
                outputView11.setText(sharedRoom11Value).toString()
                outputView12.setText(sharedRoom12Value).toString()
                outputView13.setText(sharedRoom13Value).toString()
                outputView14.setText(sharedRoom14Value).toString()
                outputView15.setText(sharedRoom15Value).toString()
                outputView16.setText(sharedRoom16Value).toString()
                outputView17.setText(sharedRoom17Value).toString()
                outputView18.setText(sharedRoom18Value).toString()
            }

        }
        val arguments: Bundle? = intent.extras
        if (arguments != null){

            val Room1: String = arguments.get("Room1").toString()
            val Room2: String = arguments.get("Room2").toString()
            val Room3: String = arguments.get("Room3").toString()
            val Room4: String = arguments.get("Room4").toString()
            val Room5: String = arguments.get("Room5").toString()
            val Room6: String = arguments.get("Room6").toString()
            val Room7: String = arguments.get("Room7").toString()
            val Room8: String = arguments.get("Room8").toString()
            val Room9: String = arguments.get("Room9").toString()
            val Room10: String = arguments.get("Room10").toString()
            val Room11: String = arguments.get("Room11").toString()
            val Room12: String = arguments.get("Room12").toString()
            val Room13: String = arguments.get("Room13").toString()
            val Room14: String = arguments.get("Room14").toString()
            val Room15: String = arguments.get("Room15").toString()
            val Room16: String = arguments.get("Room16").toString()
            val Room17: String = arguments.get("Room17").toString()
            val Room18: String = arguments.get("Room18").toString()

            textView.text = "1. $Room1"
            textView2.text = "2. $Room2"
            textView3.text = "3. $Room3"
            textView4.text = "4. $Room4"
            textView5.text = "5. $Room5"
            textView6.text = "6. $Room6"
            textView7.text = "7. $Room7"
            textView8.text = "8. $Room8"
            textView9.text = "9. $Room9"
            textView10.text = "10. $Room10"
            textView11.text = "11. $Room11"
            textView12.text = "12. $Room12"
            textView13.text = "13. $Room13"
            textView14.text = "14. $Room14"
            textView15.text = "15. $Room15"
            textView16.text = "16. $Room16"
            textView17.text = "17. $Room17"
            textView18.text = "18. $Room18"
        }
        fun back2 (view: View){
            val intent: Intent = Intent(this@RoomActivity, MainActivity::class.java)
            startActivity(intent)
        }

    }
    
}

