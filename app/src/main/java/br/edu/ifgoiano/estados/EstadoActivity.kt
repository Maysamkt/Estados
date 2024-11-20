package br.edu.ifgoiano.estados

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EstadoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estado)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imgEstado = intent.getIntExtra("imgEstado", 0)
        if(imgEstado > 0){
            val img = findViewById<View>(R.id.img) as ImageView
            img.setImageResource(imgEstado)
        }

        val nome = intent.getStringExtra("nome")
        if(!nome.isNullOrEmpty()){
            val nome1 = findViewById<View>(R.id.tNome) as TextView
            nome1.text = nome
        }

        val capital = intent.getStringExtra("capital")
        if(!capital.isNullOrEmpty()){
            val capital1 = findViewById<View>(R.id.tCapital) as TextView
            capital1.text = "Capital: $capital"
        }
        val populacao = intent.getDoubleExtra("população", 0.0)
        if(populacao > 0){
            val pEstado = findViewById<View>(R.id.tPopulacao) as TextView
            val format = java.text.NumberFormat.getInstance()
            pEstado.text = "População: ${format.format(populacao)}"
        }
        val regiao = intent.getStringExtra("região")
        if(!regiao.isNullOrEmpty()){
            val regiao1 = findViewById<View>(R.id.tRegiao) as TextView
            regiao1.text = "Região: $regiao"
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> {
                supportFinishAfterTransition()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}