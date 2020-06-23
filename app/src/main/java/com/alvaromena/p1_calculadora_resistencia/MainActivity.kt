package com.alvaromena.p1_calculadora_resistencia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var valor= ""
        var resistencia: Long
        bt_calcular.setOnClickListener {

            if (rb_b1_n.isChecked) valor="0"
            if (rb_b1_m.isChecked) valor="1"
            if (rb_b1_r.isChecked) valor="2"
            if (rb_b1_naranja.isChecked) valor="3"
            if (rb_b1_amarillo.isChecked) valor="4"
            if (rb_b1_verde.isChecked) valor="5"
            if (rb_b1_azul.isChecked) valor="6"
            if (rb_b1_violeta.isChecked) valor="7"
            if (rb_b1_gris.isChecked) valor="8"
            if (rb_b1_blanco.isChecked) valor="9"

            if (rb_b2_n.isChecked) valor+="0"
            if (rb_b2_m.isChecked) valor+="1"
            if (rb_b2_r.isChecked) valor+="2"
            if (rb_b2_naranja.isChecked) valor+="3"
            if (rb_b2_amarillo.isChecked) valor+="4"
            if (rb_b2_verde.isChecked) valor+="5"
            if (rb_b2_azul.isChecked) valor+="6"
            if (rb_b2_violeta.isChecked) valor+="7"
            if (rb_b2_gris.isChecked) valor+="8"
            if (rb_b2_blanco.isChecked) valor+="9"

            resistencia=valor.toLong()

            if (rb_b3_n.isChecked) resistencia*=1
            if (rb_b3_m.isChecked) resistencia*=10
            if (rb_b3_r.isChecked) resistencia*=100
            if (rb_b3_naranja.isChecked) resistencia*=1000
            if (rb_b3_amarillo.isChecked) resistencia*=10000
            if (rb_b3_verde.isChecked) resistencia*=100000
            if (rb_b3_azul.isChecked) resistencia*=1000000
            if (rb_b3_violeta.isChecked) resistencia*=10000000
            if (rb_b3_gris.isChecked) resistencia*=100000000
            if (rb_b3_blanco.isChecked) resistencia*=1000000000
            valor=resistencia.toString()

            if (rb_tolerancia_1.isChecked) valor+="ohm +/- 1%"
            if (rb_tolerancia_2.isChecked) valor+="ohm +/- 2%"
            if (rb_tolerancia_3.isChecked) valor+="ohm +/- 5%"
            if (rb_tolerancia_4.isChecked) valor+="ohm +/- 10%"

            tv_resultados.text=valor
        }
    }
}