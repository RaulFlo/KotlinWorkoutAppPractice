package com.example.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        //val flStartButton : FrameLayout = findViewById(R.id.flStart)
        // using binding now. easier,faster and less code
        binding?.flStart?.setOnClickListener {
            Toast.makeText(this,"works", Toast.LENGTH_SHORT).show()
        }



    }

    override fun onDestroy() {
        super.onDestroy()
        // got reset binding to null
        binding = null
    }
}