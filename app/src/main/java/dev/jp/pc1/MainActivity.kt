package dev.jp.pc1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ntparcial: EditText = findViewById(R.id.notaParcial)
        val ntfinal: EditText = findViewById(R.id.notaFinal)
        val promedio: EditText = findViewById(R.id.promedioPEP)
        val btnSend: Button = findViewById(R.id.btnsend)
        btnSend.setOnClickListener{
            val intent = Intent(this,Result::class.java)
            val parcial: String = ntparcial.text.toString()
            val final: String = ntfinal.text.toString()
            val promedio: String = promedio.text.toString()

//            intent.putExtra("param",message)
//            startActivity(intent)
            //sdaikdoiaskdnoernifneinernfnvd
        }
    }
}