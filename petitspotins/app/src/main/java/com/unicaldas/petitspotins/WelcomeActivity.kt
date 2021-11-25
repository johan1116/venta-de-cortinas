package com.unicaldas.petitspotins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class WelcomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        setSupportActionBar(findViewById(R.id.my_toolbar))


        val card_1 = findViewById<CardView>(R.id.card_pay)
        val card_2 = findViewById<CardView>(R.id.card_sale)
        val card_3 = findViewById<CardView>(R.id.card_home)

        card_1.setOnClickListener(clickListener)
        card_2.setOnClickListener(clickListener)
        card_3.setOnClickListener(clickListener)

    }

//    ONCLICK PARA LA PRIMERA CARD

    val clickListener = View.OnClickListener {view ->

        when (view.getId()) {
            R.id.card_pay-> irPago()
            R.id.card_sale-> irVenta()
            R.id.card_home-> irHome()



        }
    }

    private fun irPago() {
        val intento = Intent(this, AbonoActivity::class.java)
        startActivity(intento)
    }

    private fun irVenta() {
        val intento = Intent(this, VentaActivity::class.java)
        startActivity(intento)
    }

    private fun irHome() {
        val intento = Intent(this, HomeActivity::class.java)
        startActivity(intento)
    }


}