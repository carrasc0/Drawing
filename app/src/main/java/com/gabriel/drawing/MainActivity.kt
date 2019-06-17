package com.gabriel.drawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabriel.drawing.utils.DrawView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRestart.setOnClickListener {
            draw_view.clearCanvas()
        }
    }
}
