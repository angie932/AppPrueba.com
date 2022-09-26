package com.appprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1:Button=findViewById(R.id.Button)
        boton1.setOnClickListener { IngresarNombre() }
    }

    private fun IngresarNombre(){
        val textView:EditText=findViewById(R.id.EditNameText)
        var TextApellido:EditText=findViewById((R.id.TextApellido))

        var apellido=TextApellido.text
        var name=textView.text
        Toast.makeText(this, "Bienvenido a careverga.com \n saludo a $name $apellido chopapipis", Toast.LENGTH_LONG).show()
    }

}