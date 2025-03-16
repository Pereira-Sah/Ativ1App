package br.edu.fatecpg.calculoohm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtVolts = findViewById<EditText>(R.id.edt_volts)
        val edtResistencia = findViewById<EditText>(R.id.edt_resistencia)
        val edtCorrente = findViewById<EditText>(R.id.edt_corrente)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{
            val volts = edtVolts.text.toString().toDoubleOrNull()
            val resistencia = edtResistencia.text.toString().toDoubleOrNull()
            val corrente = edtCorrente.text.toString().toDoubleOrNull()
            if (volts == null && resistencia != null && corrente != null) {
                val resultado = resistencia * corrente
                edtVolts.setText(resultado.toString())
            }else{
                if (volts != null && resistencia == null && corrente != null) {
                    val resultado = volts / corrente
                    edtResistencia.setText(resultado.toString())
                }else{
                    if (volts != null && resistencia != null && corrente == null) {
                        val resultado = volts / resistencia
                        edtCorrente.setText(resultado.toString())
                    }
                }
            }
        }
    }
}
