package com.jupiter.coinpouch

import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val sdf = SimpleDateFormat("dd MMMM yyyy")
        val c = Calendar.getInstance()
        val dts = sdf.format(c.getTime())

        txtDate.text = dts.toString()

        prvDay.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                c.add(Calendar.DATE,-1)
                val dtn = sdf.format(c.getTime())
                txtDate.text = dtn.toString()

            }

        })
    }
}