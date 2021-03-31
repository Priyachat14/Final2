package com.example.home_work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home_work.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num1:Int = 0
    var ch = 0
    var pl = ""
    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button13.setOnClickListener{
            if (textView.text.toString() == "0"){

                textView.setText("1")
            }
            else{
                var str = textView.text.toString().plus(1)
                textView.setText(str)
            }
        }
        button14.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("2")
            }
            else{
                var str = textView.text.toString().plus(2)
                textView.setText(str)
            }
        }
        button15.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("3")
            }
            else{
                var str = textView.text.toString().plus(3)
                textView.setText(str)
            }
        }
        button9.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("4")
            }
            else{
                var str = textView.text.toString().plus(4)
                textView.setText(str)
            }
        }
        button10.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("5")
            }
            else{
                var str = textView.text.toString().plus(5)
                textView.setText(str)
            }
        }
        button11.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("6")
            }
            else{
                var str = textView.text.toString().plus(6)
                textView.setText(str)
            }
        }
        button5.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("7")
            }
            else{
                var str = textView.text.toString().plus(7)
                textView.setText(str)
            }
        }
        button6.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("8")
            }
            else{
                var str = textView.text.toString().plus(8)
                textView.setText(str)
            }
        }
        button8.setOnClickListener{
            if (textView.text.toString() == "0"){
                textView.setText("9")
            }
            else{
                var str = textView.text.toString().plus(9)
                textView.setText(str)
            }
        }
        button20.setOnClickListener{
            if (textView.text.toString() == "0"){

            }
            else {
                var str = textView.text.toString().plus(0)
                textView.setText(str)
            }
        }

        button.setOnClickListener{
            textView.setText("0")
        }

        button2.setOnClickListener{
            if(textView.text.toString().length<=1){
                textView.setText("0")
            }
            else if(textView.text.isNotEmpty()) {
                textView.text=textView.text.dropLast(1)
            }
        }
        button16.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "plus"
            sum = num1 + textView.text.toString().toInt()
            textView.setText(sum.toString())
        }
        button12.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "minus"
            sum = num1 - textView.text.toString().toInt()
            textView.setText(sum.toString())
        }
        button7.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "mul"
            sum = num1 * textView.text.toString().toInt()
            textView.setText(sum.toString())
        }
        button4.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "div"
            sum = num1 / textView.text.toString().toInt()
            textView.setText(sum.toString())
        }
        button3.setOnClickListener {
            num1 = textView.text.toString().toInt()
            ch = 1
            pl = "mod"
            sum = num1 % textView.text.toString().toInt()
            textView.setText(sum.toString())
        }
        button23.setOnClickListener {
            if(pl == "plus") {
                sum = num1 + textView.text.toString().toInt()
                textView.setText(sum.toString())
            }
            else if (pl == "minus"){
                sum = num1 - textView.text.toString().toInt()
                textView.setText(sum.toString())

            }
            else if (pl == "mul"){
                sum = num1 * textView.text.toString().toInt()
                textView.setText(sum.toString())
            }
            else if (pl == "div"){
                sum = num1 / textView.text.toString().toInt()
                textView.setText(sum.toString())
            }
            else if (pl == "mod"){
                sum = num1 % textView.text.toString().toInt()
                textView.setText(sum.toString())
            }

        }
    }
}