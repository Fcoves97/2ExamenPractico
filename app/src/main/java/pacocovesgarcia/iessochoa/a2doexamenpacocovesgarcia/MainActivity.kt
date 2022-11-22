package pacocovesgarcia.iessochoa.a2doexamenpacocovesgarcia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //Declaración de Variables
    private lateinit var btnCompra : Button
    private lateinit var btnDetalles : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Asignación de variables a los botones
        btnCompra = findViewById(R.id.btnCompra)
        btnDetalles = findViewById(R.id.btnDetalles)

        //Evento 'click' de los botones
        btnCompra.setOnClickListener{AbrirActivityCompra()}
        btnDetalles.setOnClickListener{AbrirActivityDetalles()}
    }
    fun AbrirActivityCompra(){      //Método que abre la activity IntroducirValores_Compra
        val intent = Intent(this,IntroducirValores_Compra::class.java)
        startActivity(intent)
    }
    fun AbrirActivityDetalles(){   //Método que abre la activity Detalles
        val intent = Intent(this,Detalles::class.java)
        startActivity(intent)
    }
}