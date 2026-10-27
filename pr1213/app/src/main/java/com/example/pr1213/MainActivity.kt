package com.example.pr1213

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val messageRes = when (item.itemId) {
            R.id.action1 -> R.string.selected_first
            R.id.action2 -> R.string.selected_second
            R.id.action3 -> R.string.selected_third
            R.id.action_settings -> R.string.selected_settings
            else -> return super.onOptionsItemSelected(item)
        }
        val message = getString(messageRes)
        textView.text = message
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        return true
    }
}
