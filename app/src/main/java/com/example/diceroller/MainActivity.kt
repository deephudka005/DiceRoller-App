package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dicevar = diceroll(6)

        val rollbutton: Button=findViewById(R.id.Roll)
        rollbutton.setOnClickListener {
            val rolling =dicevar.roll()
            //val flag=flag.makeText(this,"Dice Rolled!",flag.LENGTH.SHORT).show() To show that the button is pressed by giving the message we want.
           // val resultTextView: TextView = findViewById(R.id.resulttext)
            //resultTextView.text=rolling.toString()
            val resultimageview: ImageView= findViewById(R.id.imageView)
            when (rolling) {
                1 -> resultimageview.setImageResource(R.drawable.dice_1)
                2 -> resultimageview.setImageResource(R.drawable.dice_2)
                3 -> resultimageview.setImageResource(R.drawable.dice_3)
                4 -> resultimageview.setImageResource(R.drawable.dice_4)
                5 -> resultimageview.setImageResource(R.drawable.dice_5)
                6 -> resultimageview.setImageResource(R.drawable.dice_6)
            }

        }

        //println("Your ${dicevar.sides} sided dice rolled ${rolling}!")

    }
}
class diceroll (val sides: Int){
    fun roll(): Int
    {
        return(1..sides).random()
    }
}