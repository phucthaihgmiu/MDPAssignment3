package com.example.problem1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    }

    fun clickAdd(view: View){
        val version = et1.text.toString().trim();
        val code = et2.text.toString().trim();
        if(version.isNotEmpty() && code.isNotEmpty()){
            val row = TableRow(this);
            row.layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT);

            val colVersion = TextView(this);
            colVersion.text = version;
            val colCode = TextView(this);
            colCode.text = code;

            colVersion.layoutParams = tvCol1.layoutParams;
            colVersion.background = tvCol1.background;

            colCode.layoutParams = tvCol2.layoutParams;
            colCode.background = tvCol2.background;

            row.addView(colVersion, 0);
            row.addView(colCode, 1);

            tbl.addView(row);
        }

    }
}