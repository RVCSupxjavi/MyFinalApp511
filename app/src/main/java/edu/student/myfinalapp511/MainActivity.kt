package edu.student.myfinalapp511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Next Page (Temporary until Google Sign In Firebase is figured out.
        val nxtPg1 = findViewById<ImageButton>(R.id.nxtPg1)

        nxtPg1.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}
