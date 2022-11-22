package pacocovesgarcia.iessochoa.a2doexamenpacocovesgarcia

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class IntroducirValores_Compra : AppCompatActivity() {

    companion object{

        //Variables companion object que obtendrá el total de la activity Compra
        public val EXTRA_TOTAL="2doexamenPacoCovesGarcia.IntroducirValoresCompra.EXTRA_TOTAL"

    }

    //Declaración de Variables
    private lateinit var ptnPrecio : EditText
    private lateinit var ptnCantidad : EditText
    private lateinit var tvMostrartotal : TextView
    private lateinit var btnTotal : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introducir_valores_compra)

        //Asignación de variables
        ptnPrecio = findViewById(R.id.ptnPrecio)
        ptnCantidad = findViewById(R.id.ptnCantidad)
        btnTotal = findViewById(R.id.btnTotal)
        tvMostrartotal = findViewById(R.id.tvMostrartotal)

        //Evento 'click' del botón
        btnTotal.setOnClickListener{EnviarValoresCompra(ptnPrecio.text.toString(),ptnCantidad.text.toString())}

        //Asignación del total al textview
        if(!tvMostrartotal.text.isEmpty()){
            tvMostrartotal.setText("El total de la factura es:" + intent.getStringExtra(EXTRA_TOTAL)+ " Gracias pr su compra !!!")
        }

    }
    fun EnviarValoresCompra(precio:String,cantidad:String){
        val intent = Intent(this,Compra::class.java)
        intent.putExtra(Compra.EXTRA_PRECIO,precio)
        intent.putExtra(Compra.EXTRA_CANTIDAD,cantidad)
        startActivity(intent)
    }
}