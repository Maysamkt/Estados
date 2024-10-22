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
        val nome = intent.getIntExtra("nome", 0)
        if(nome > 0){
            val nome1 = findViewById<View>(R.id.tNome) as TextView
            nome1.setText(nome)
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