package br.edu.ifgoiano.estados

data class Estado(val nome: String, val img: Int)

object EstadoData {
    fun getEstados(): List<Estado> {
        return listOf(
            Estado("Acre", R.drawable.bandeira_acre),
            Estado("Alagoas", R.drawable.bandeira_alagoas),
            Estado("Amapa", R.drawable.bandeira_amapa),
            Estado("Amazonas", R.drawable.bandeira_amazonas),
            Estado("Bahia", R.drawable.bandeira_bahia),
            Estado("Ceará", R.drawable.bandeira_ceara),
            Estado("Distrito Federal", R.drawable.bandeira_distrito_federal),
            Estado("Espírito Santo", R.drawable.bandeira_espirito_santo),
            Estado("Goiás", R.drawable.bandeira_goias),
            Estado("Maranhão", R.drawable.bandeira_maranhao),
            Estado("Mato Grosso", R.drawable.bandeira_mato_grosso),
            Estado("Mato Grosso do Sul", R.drawable.bandeira_mato_grosso_do_sul),
            Estado("Minas Gerais", R.drawable.bandeira_minas_gerais),
            Estado("Pará", R.drawable.bandeira_para),
            Estado("Paraíba", R.drawable.bandeira_paraiba),
            Estado("Paraná", R.drawable.bandeira_parana),
            Estado("Pernambuco", R.drawable.bandeira_pernambuco),
            Estado("Piauí", R.drawable.bandeira_piaui),
            Estado("Rio de Janeiro", R.drawable.bandeira_rio_de_janeiro),
            Estado("Rio Grande do Norte", R.drawable.bandeira_rio_grande_do_norte),
            Estado("Rio Grande do Sul", R.drawable.bandeira_rio_grande_do_sul),
            Estado("Rondônia", R.drawable.bandeira_rondonia),
            Estado("Roraima", R.drawable.bandeira_roraima),
            Estado("Santa Catarina", R.drawable.bandeira_santa_catarina),
            Estado("São Paulo", R.drawable.bandeira_sao_paulo),
            Estado("Sergipe", R.drawable.bandeira_sergipe),
            Estado("Tocantins", R.drawable.bandeira_tocantins)

        )
    }
}