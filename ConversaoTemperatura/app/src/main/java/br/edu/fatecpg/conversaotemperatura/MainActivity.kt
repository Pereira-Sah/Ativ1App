package br.edu.fatecpg.conversaotemperatura

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.String

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtTemperatura = findViewById<EditText>(R.id.edt_temperatura)
        val btnConverter = findViewById<Button>(R.id.btn_converter)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnConverter.setOnClickListener{
            val c = edtTemperatura.text.toString().toDouble()
            var f = (c * 1.8) + 32
            txvResultado.text = "${String.format( "%.1f",f)}°F"
        }
    }
}
