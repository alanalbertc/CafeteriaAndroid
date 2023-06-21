package com.example.cafeteria

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var items: ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        listView = findViewById(R.id.lista_productos)
        items = arrayListOf("Platillo 1    $15.00", "Platillo 2    $20.00", "Platillo 3    $18.00", "Platillo 4    $22.00", "Platillo 5    $10.00")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        /*listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            navigateToDetail(selectedItem)
        }*/

        val item = intent.getStringExtra("item")

        val textView: TextView = findViewById(R.id.nombre_cafeteria)
        textView.text = item
    }
}
