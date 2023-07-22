package com.example.sintia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.sintia.R.id.ingresar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ingresar : Button = findViewById(ingresar)

        val spInstituciones : Spinner = findViewById(R.id.mySpinner)
        val lisInstituciones = arrayOf("Icolven", "Coals", "Pinar", "Santa Rita", "La Camila",
             "Altos Oriente")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, lisInstituciones)
        spInstituciones.adapter = adaptador

        val spAño : Spinner = findViewById(R.id.mySpinnerAño)
        val año = arrayOf(2019, 2020, 2021, 2022, 2023)
        val adap = ArrayAdapter(this, android.R.layout.simple_spinner_item, año)
        spAño.adapter = adap
    }

    fun iniciarSesion(view: View){

        val usuario : EditText = findViewById(R.id.ti_usuario)
        val password : EditText = findViewById(R.id.ti_password)

        if (usuario.text.toString() == "Marvin"){
            if (password.text.toString() == "1478"){
                Toast.makeText(this, "Ingresando a sintia...", Toast.LENGTH_LONG).show()
            }
        }else {
            Toast.makeText(this, "Datos erroneos intente de nuevo...", Toast.LENGTH_LONG).show()
        }



    }

}