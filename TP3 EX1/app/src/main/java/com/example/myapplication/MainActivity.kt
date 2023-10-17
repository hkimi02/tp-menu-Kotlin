package com.example.myapplication

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import kotlin.system.exitProcess

class MainActivity : ComponentActivity() {
    lateinit var email:EditText
    lateinit var prenom:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        email=findViewById(R.id.email)
        prenom=findViewById(R.id.prenom)
        registerForContextMenu(email)
        registerForContextMenu(prenom)
    }

    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
        menuInflater.inflate(R.menu.actionsbar, menu)
        return true
   }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.menu_search -> {
                Toast.makeText(this, "search selected", Toast.LENGTH_LONG).show()
                true
            }
            R.id.menu_exit ->{
                Toast.makeText(this, "exit", Toast.LENGTH_LONG).show()
                true
            }
            else ->{
                super.onOptionsItemSelected(item)
            }
        }

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater:MenuInflater=menuInflater
        inflater.inflate(R.menu.contextmenu, menu)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        super.onContextItemSelected(item)
        return when (item.itemId){
            R.id.ch1->{
                Toast.makeText(this,"search selected",Toast.LENGTH_LONG).show()
                true
            }else->super.onContextItemSelected(item)
        }
    }
}
