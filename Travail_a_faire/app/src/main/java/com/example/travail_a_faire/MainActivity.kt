package com.example.travail_a_faire

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.travail_a_faire.ui.theme.Travail_a_faireTheme

class MainActivity : ComponentActivity() {
    lateinit var btn:Button
    lateinit var page: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.button)
        page=findViewById(R.id.LinearLayout)
        btn.setOnClickListener { showPopup(btn) }
    }
    /*fun showPopup(view: View) {
        val popup = PopupMenu(this, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.poppupmenu, popup.menu)
        popup.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.menu_item1 -> {
                    Toast.makeText(this, "Menu Item 1 Clicked", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.menu_item2 -> {
                    Toast.makeText(this, "Menu Item 2 Clicked", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }
        popup.show()
    }*/
    fun showPopup(view: View){
        val popup = PopupMenu(this, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.poppupmenu, popup.menu)
        popup.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId) {
                R.id.red -> {
                    page.setBackgroundColor(android.graphics.Color.RED)
                    true
                }

                R.id.green -> {
                    page.setBackgroundColor(android.graphics.Color.GREEN)
                    true
                }
                R.id.yellow -> {
                    page.setBackgroundColor(android.graphics.Color.YELLOW)
                    true
                }
                R.id.gray -> {
                    page.setBackgroundColor(android.graphics.Color.GRAY)
                    true
            }

                else -> false
            }
        }
        popup.show()
    }
}