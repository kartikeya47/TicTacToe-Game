package com.example.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arr: Array<Button> =
            arrayOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)
        var count = 0
        var drawCount = 0
        val cAArr: Array<Int> = arrayOf(20, 20, 20, 20, 20, 20, 20, 20, 20)
        val cBArr: Array<Int> = arrayOf(20, 20, 20, 20, 20, 20, 20, 20, 20)
        var aWins = 0
        var bWins = 0

        for (btn in arr) {
            btn.setOnClickListener {
                drawCount += 1
                if (count == 0) {
                    cAArr[arr.indexOf(btn)] = 12
                    btn.text = "X"
                    btn.setTextColor(getColor(R.color.white))
                    btn.textSize = 50f

                    if ((cAArr[0] == 12 && cAArr[1] == 12 && cAArr[2] == 12) || (cAArr[3] == 12 && cAArr[4] == 12 && cAArr[5] == 12) ||
                        (cAArr[6] == 12 && cAArr[7] == 12 && cAArr[8] == 12) || (cAArr[0] == 12 && cAArr[3] == 12 && cAArr[6] == 12) ||
                        (cAArr[1] == 12 && cAArr[4] == 12 && cAArr[7] == 12) || (cAArr[2] == 12 && cAArr[5] == 12 && cAArr[8] == 12) ||
                        (cAArr[0] == 12 && cAArr[4] == 12 && cAArr[8] == 12) || (cAArr[2] == 12 && cAArr[4] == 12 && cAArr[6] == 12)
                    ) {
                        aWins += 1
                        textView2.text = "A's Score: $aWins"
                        textView.text = "Player A Won!!"
                        button1.isEnabled = false
                        button2.isEnabled = false
                        button3.isEnabled = false
                        button4.isEnabled = false
                        button5.isEnabled = false
                        button6.isEnabled = false
                        button7.isEnabled = false
                        button8.isEnabled = false
                        button9.isEnabled = false
                        count = 1

                    } else if (drawCount == 9) {
                        textView.text = "It's a Draw :)"
                        btn.isEnabled = false
                        count = 1
                    } else {
                        textView.text = "Player B's Chance"
                        btn.isEnabled = false
                        count = 1
                    }
                } else if (count == 1) {
                    if (drawCount == 9) {
                        textView.text = "It's a Draw :)"
                    }
                    cBArr[arr.indexOf(btn)] = 12
                    btn.text = "O"
                    btn.setTextColor(getColor(R.color.white))
                    btn.textSize = 50f
                    if ((cBArr[0] == 12 && cBArr[1] == 12 && cBArr[2] == 12) || (cBArr[3] == 12 && cBArr[4] == 12 && cBArr[5] == 12) ||
                        (cBArr[6] == 12 && cBArr[7] == 12 && cBArr[8] == 12) || (cBArr[0] == 12 && cBArr[3] == 12 && cBArr[6] == 12) ||
                        (cBArr[1] == 12 && cBArr[4] == 12 && cBArr[7] == 12) || (cBArr[2] == 12 && cBArr[5] == 12 && cBArr[8] == 12) ||
                        (cBArr[0] == 12 && cBArr[4] == 12 && cBArr[8] == 12) || (cBArr[2] == 12 && cBArr[4] == 12 && cBArr[6] == 12)
                    ) {
                        bWins += 1
                        textView3.text = "B's Score: $bWins"
                        textView.text = "Player B Won!!"
                        button1.isEnabled = false
                        button2.isEnabled = false
                        button3.isEnabled = false
                        button4.isEnabled = false
                        button5.isEnabled = false
                        button6.isEnabled = false
                        button7.isEnabled = false
                        button8.isEnabled = false
                        button9.isEnabled = false
                        count = 0
                    } else if (drawCount == 9) {
                        textView.text = "It's a Draw :)"
                        btn.isEnabled = false
                        count = 0
                    } else {
                        textView.text = "Player A's Chance"
                        btn.isEnabled = false
                        count = 0
                    }
                }
            }
        }

        button_reset.setOnClickListener {
            drawCount = 0
            for (i in 0..8) {
                cAArr[i] = 20
            }
            for (j in 0..8) {
                cBArr[j] = 20
            }
            count = 0
            button1.text = ""
            button1.isEnabled = true
            button2.text = ""
            button2.isEnabled = true
            button3.text = ""
            button3.isEnabled = true
            button4.text = ""
            button4.isEnabled = true
            button5.text = ""
            button5.isEnabled = true
            button6.text = ""
            button6.isEnabled = true
            button7.text = ""
            button7.isEnabled = true
            button8.text = ""
            button8.isEnabled = true
            button9.text = ""
            button9.isEnabled = true
            textView.text = "Player A's Chance"
        }
        button_newGame.setOnClickListener {
            aWins = 0
            bWins = 0
            textView2.text = "A's Score: $aWins"
            textView3.text = "B's Score: $bWins"
            drawCount = 0
            for (i in 0..8) {
                cAArr[i] = 20
            }
            for (j in 0..8) {
                cBArr[j] = 20
            }
            count = 0
            button1.text = ""
            button1.isEnabled = true
            button2.text = ""
            button2.isEnabled = true
            button3.text = ""
            button3.isEnabled = true
            button4.text = ""
            button4.isEnabled = true
            button5.text = ""
            button5.isEnabled = true
            button6.text = ""
            button6.isEnabled = true
            button7.text = ""
            button7.isEnabled = true
            button8.text = ""
            button8.isEnabled = true
            button9.text = ""
            button9.isEnabled = true
            textView.text = "Player A's Chance"
        }
    }
}