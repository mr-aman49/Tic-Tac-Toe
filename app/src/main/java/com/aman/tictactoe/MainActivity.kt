package com.aman.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var PLAYER =true
    var TURN_COUNT =0

    var boardStatus =Array(3) {IntArray(3)}

    lateinit var board : Array<Array<Button>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)

        board = arrayOf(
            arrayOf(button, button1, button2),
            arrayOf(button3, button4, button5),
            arrayOf(button6, button7, button8)
        )

        for (i in board) {
            for (button in i) {
                button.setOnClickListener(this)
            }
        }
        val initializeBoardStatus
        initializeBoardStatus

        button9.setOnClickListener{
            
        }
    }



    override fun onClick(view: View) {
        when(view.id){
            R.id.button -> {
            }
            R.id.button1 -> {
            }
            R.id.button2 -> {
            }
            R.id.button3 -> {
            }
            R.id.button4 -> {
            }
            R.id.button5 -> {
            }
            R.id.button6 -> {
            }
            R.id.button7 -> {
            }
            R.id.button8 -> {
            }

        }
    }
}