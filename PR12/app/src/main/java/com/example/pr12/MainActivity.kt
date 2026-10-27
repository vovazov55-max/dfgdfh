package com.example.pr12

import android.os.Bundle
import android.view.animation.BounceInterpolator
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val translation = TranslateAnimation(1000f, 0f, 0f, 0f)
        translation.duration = 5000
        translation.interpolator = BounceInterpolator()
        imageView.startAnimation(translation)
    }
}
