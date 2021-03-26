package com.plusminus.diceroll

import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
       // val imageView : ImageView = findViewById(R.id.imageView)
      
        diceRoll()
        button.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        val myDice = Dice(6)
        imageView.contentDescription = myDice.roll().toString()
        when (myDice.roll()) {
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }

    }
    class Dice(numOfSide: Int) {
        private val randomNo = (1..numOfSide).random()
        fun roll(): Int {
            return randomNo
        }
    }
}
