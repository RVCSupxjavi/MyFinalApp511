package edu.student.myfinalapp511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Declaring Vals
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val nxtBtn = findViewById<ImageButton>(R.id.nxtBtn)
        val editNum1 = findViewById<EditText>(R.id.editNum1)
        val editNum2 = findViewById<EditText>(R.id.editNum2)
        val textResult = findViewById<TextView>(R.id.textResult)



        //The math is mathiing in this section
        btnSubmit.setOnClickListener {
            //Todo check the empty validation
            if(editNum1.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Please enter Sold Price", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(editNum2.text.toString().isEmpty()){
                Toast.makeText(applicationContext,"Please enter Item Cost", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //Todo calculate the profit and show in txtResult
            var profit:Int = editNum1.text.toString().toInt() - editNum2.text.toString().toInt()
            textResult.text = "Profit: $profit"
        }
        nxtBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }


}