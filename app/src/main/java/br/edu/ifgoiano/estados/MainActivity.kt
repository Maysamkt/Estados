package br.edu.ifgoiano.estados

import android.annotation.SuppressLint
import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.ContextUtils.getActivity

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var estados: List<Estado>? = emptyList()
    private lateinit var adapter: EstadoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        estados = EstadoData.getEstados()

        adapter = EstadoAdapter(this, estados, onClickEstado())
        recyclerView.adapter = adapter }



    private fun onClickEstado(): EstadoAdapter.EstadoOnClickListener{
        return object : EstadoAdapter.EstadoOnClickListener {
            @SuppressLint("RestrictedApi")
            override fun onClickEstado(holder: EstadoAdapter.EstadosViewHolder?, idx: Int){
                val estado = (estados?.getOrNull(idx) ?: return)
                val context = holder?.itemView?.context?:return
                val intent = Intent(baseContext, EstadoActivity::class.java)
                intent.putExtra("imgEstado", estado.img)
                intent.putExtra("nome", estado.nome)
                intent.putExtra("capital", estado.capital)
                intent.putExtra("população", estado.populacao)
                intent.putExtra("região", estado.regiao)




                val key = getString(R.string.transition_key)
                val img: ImageView = holder.img




                val opts1 = ActivityOptions.makeSceneTransitionAnimation(
                    getActivity(context),
                    img,
                    key

                )



//
//                val opts2 = ActivityOptions.makeCustomAnimation(
//                    context,
//                    R.anim.shake,
//                    R.anim.abc_slide_in_top
//                )

                startActivity(intent, opts1.toBundle())
            }
        }
    }


//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.menu_estado, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.action_linear_layout -> {
//                recyclerView.layoutManager = LinearLayoutManager(this)
//                return true
//            }
//            R.id.action_grid_layout -> {
//                recyclerView.layoutManager = GridLayoutManager(this, 2)
//                return true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

}
