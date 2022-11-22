package pacocovesgarcia.iessochoa.a2doexamenpacocovesgarcia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Compra : AppCompatActivity() {

    companion object{

        //Variables companion object que obtendrán los datos de la activity IntroducirValores_Compra
        public val EXTRA_PRECIO="2doexamenPacoCovesGarcia.Compra.EXTRA_PRECIO"
        public val EXTRA_CANTIDAD="2doexamenPacoCovesGarcia.Compra.EXTRA_CANTIDAD"

    }

    //Declaración de variables
    private lateinit var tvBruto : TextView
    private lateinit var tvIva : TextView
    private lateinit var tvNeto : TextView
    private lateinit var btnFacturar : Button
    private lateinit var Bruto : Number
    private lateinit var Neto : Number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compra)

        //Asignación de variables
        tvBruto = findViewById(R.id.tvBruto)
        tvIva  = findViewById(R.id.tvIva)
        tvNeto  = findViewById(R.id.tvNeto)
        btnFacturar = findViewById(R.id.btnFacturar)

        //Asigno el valor de las variables de la activityIntroducirValoresCompra y las opero para mostrar los datos procesados
        Bruto = (Integer.parseInt(intent.getStringExtra(EXTRA_PRECIO)))*(Integer.parseInt(intent.getStringExtra(EXTRA_CANTIDAD)))
        Neto = ((Bruto as Int * 0.16)+Bruto as Int)
        tvBruto.setText("Bruto: "+ Bruto.toString())
        tvIva.setText("IVA: 16.0")
        tvNeto.setText("Neto: "+ Neto)

        //Evento 'click' del botón
        btnFacturar.setOnClickListener{}

    }
}