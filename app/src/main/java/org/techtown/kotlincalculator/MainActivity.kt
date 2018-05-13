package org.techtown.kotlincalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addClick(v: View) {
        var n1 = Integer.parseInt(firstnum.text.toString());
        var n2 = Integer.parseInt(secondnum.text.toString());

        result.setText(Integer.toString(n1 + n2));
    }

    fun subtractClick(v: View) {
        var n1 = Integer.parseInt(firstnum.text.toString());
        var n2 = Integer.parseInt(secondnum.text.toString());

        result.setText(Integer.toString(n1 - n2));
    }

    fun multiplyClick(v: View) {
        var n1 = Integer.parseInt(firstnum.text.toString());
        var n2 = Integer.parseInt(secondnum.text.toString());

        result.setText(Integer.toString(n1 * n2));
    }

    fun divideClick(v: View) {
        var n1 = Integer.parseInt(firstnum.text.toString());
        var n2 = Integer.parseInt(secondnum.text.toString());

        result.setText(Integer.toString(n1 / n2));
    }
}
