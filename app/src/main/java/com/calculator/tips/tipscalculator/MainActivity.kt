package com.calculator.tips.tipscalculator

import android.app.ActionBar
import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TextView Variables
        lateinit var name: TextView
        lateinit var sales: TextView
        lateinit var tipOut: TextView
        lateinit var signature: TextView
        //Row Variables
        lateinit var row: TableRow
        //Parameters dimentions




        lateinit var widthParam: TableRow.LayoutParams

        //Parameters Margins
//        lateinit var marginsPara: ViewGroup.MarginLayoutParams
//        marginsPara = ViewGroup.MarginLayoutParams(100,100)

        table.setColumnStretchable(0, true)
        table.setColumnStretchable(1, true)
        table.setColumnStretchable(2, true)
        table.setColumnStretchable(3, true)

//        name.layoutParams = widthParam
//        widthParam = TableRow.LayoutParams(170, 60)
//        sales.layoutParams = widthParam
//        tipOut.layoutParams = widthParam
//        signature.layoutParams = widthParam


        bu1.setOnClickListener {

            //Toast.makeText(this, "This is a toast message", Toast.LENGTH_LONG).show()

            row = TableRow(this)
            row.weightSum = 100.0f
            name = TextView(this)
            sales = TextView(this)
            tipOut = TextView(this)
            signature = TextView(this)

            widthParam = TableRow.LayoutParams()
            widthParam.weight = 40.0f

            name.text = "Jonathan"
            name.layoutParams = widthParam

            //widthParam = TableRow.LayoutParams()
            widthParam.weight = 20.0f

            sales.text = "12"
            sales.layoutParams = widthParam
            tipOut.text = "213"
            tipOut.layoutParams = widthParam
            signature.text = "Approved"
            signature.layoutParams = widthParam

            row.addView(name,0)
            row.addView(sales, 1)
            row.addView(tipOut, 2)
            row.addView(signature, 3)

            table.addView(row)

        }

    }
}



