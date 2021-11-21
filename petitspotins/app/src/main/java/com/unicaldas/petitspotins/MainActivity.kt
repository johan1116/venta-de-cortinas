package com.unicaldas.petitspotins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var edtUsername : EditText? = null
    private var edtPassword : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)


    }

    fun onLogin(botonLogin: View) {


        var username:String = edtUsername!!.text.toString()
        var password:String = edtPassword!!.text.toString()

        if (username == "johan@gmail.com" && password == "1234"){

            //PRIMERA FORMA DE INGRESO

            /*val intento = Intent(this,WelcomeActivity::class.java)
            startActivity(intento)*/

            //SEGUNDA FORMA DE INGRESO MEDIANTE DIALOGOS EMERGENTES
            /*
            val positiveButton = {dialog:DialogInterface,which:Int ->
                val intento = Intent(this,WelcomeActivity::class.java)
                startActivity(intento)

            }

            val negativeButton = {_:DialogInterface,_:Int ->}

            val dialog = AlertDialog.Builder(this)
                .setTitle(getResources().getString(R.string.txt_welcome)+"!")
                .setMessage(getResources().getString(R.string.txt_user)+edtUsername!!.text.toString())
                .setPositiveButton(getResources().getString(R.string.txt_ok),positiveButton)
                .setNegativeButton(getResources().getString(R.string.txt_cancel),negativeButton)

            dialog.create()
            dialog.show()*/

            //TERCERA FORMA DE INGRESO CON UN DIALOGO EMERGENTE PERO QUE NO QUITA FUNCIONALIDAD

            val intento = Intent(this,AbonoActivity::class.java)
            startActivity(intento)

            Toast.makeText(applicationContext,getResources().getString(R.string.txt_welcome)+"!",
                Toast.LENGTH_LONG).show()



        }
        else{

            //PRIMERA FORMA DE INVALIDAR EL USUARIO
            /*
            val dialog = AlertDialog.Builder(this).setTitle(getResources().getString(R.string.txt_error))
                .setMessage(getResources().getString(R.string.txt_error_inicio)).create().show()*/

            //SEGUNDA FORMA DE INVALIDAR EL USUARIO
            Toast.makeText(this,getResources().getString(R.string.txt_error_inicio), Toast.LENGTH_SHORT).show()
        }

    }
}