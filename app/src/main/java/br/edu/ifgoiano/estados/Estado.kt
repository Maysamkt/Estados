package br.edu.ifgoiano.estados

data class Estado(val nome: String, val capital: String, val populacao: Double, val regiao: String,  val img: Int)

object EstadoData {
    fun getEstados(): List<Estado> {
        return listOf(
            Estado("Acre", "Rio Branco",  830.018, "Norte" ,  R.drawable.bandeira_acre),
            Estado("Alagoas", "Maceió", 3127.683, "Nordeste", R.drawable.bandeira_alagoas),
            Estado("Amapa", "Macapá", 733.759, "Norte" , R.drawable.bandeira_amapa),
            Estado("Amazonas", "Manaus", 3941.613, "Norte", R.drawable.bandeira_amazonas),
            Estado("Bahia", "Salvador", 14141.626, "Nordeste", R.drawable.bandeira_bahia),
            Estado("Ceará", "Fortaleza", 8704.957, "Nordeste", R.drawable.bandeira_ceara),
            Estado("Distrito Federal", "Brasília", 2817.381, "Centro-Oeste", R.drawable.bandeira_distrito_federal),
            Estado("Espírito Santo", "Vitória", 3833.712, "Sudeste" , R.drawable.bandeira_espirito_santo),
            Estado("Goiás", "Goiânia", 7056.495, "Centro-Oeste", R.drawable.bandeira_goias),
            Estado("Maranhão", "São Luís", 6775.805, "Nordeste", R.drawable.bandeira_maranhao),
            Estado("Mato Grosso", "Cuiabá", 3658.649, "Centro_Oeste", R.drawable.bandeira_mato_grosso),
            Estado("Mato Grosso do Sul", "Campo Grande", 2757.013, "Centro-Oeste", R.drawable.bandeira_mato_grosso_do_sul),
            Estado("Minas Gerais", "Belo Horizonte", 20539.989, "Sudeste", R.drawable.bandeira_minas_gerais),
            Estado("Pará", "Belém", 8120.131, "Norte", R.drawable.bandeira_para),
            Estado("Paraíba", "João Pessoa", 3974.687, "Nordeste", R.drawable.bandeira_paraiba),
            Estado("Paraná", "Curitiba", 11444.380, "Sul", R.drawable.bandeira_parana),
            Estado("Pernambuco", "Recife", 9058.931, "Nordeste", R.drawable.bandeira_pernambuco),
            Estado("Piauí", "Teresina", 3271.199, "Nordeste", R.drawable.bandeira_piaui),
            Estado("Rio de Janeiro", "Rio de Janeiro", 16055.174, "Sudeste", R.drawable.bandeira_rio_de_janeiro),
            Estado("Rio Grande do Norte", "Natal", 3302.729, "Nordeste", R.drawable.bandeira_rio_grande_do_norte),
            Estado("Rio Grande do Sul", "Porto Alegre", 10882.965, "Sul", R.drawable.bandeira_rio_grande_do_sul),
            Estado("Rondônia", "Porto Velho", 1581.196, "Norte", R.drawable.bandeira_rondonia),
            Estado("Roraima", "Boa Vista", 223644.53, "Norte", R.drawable.bandeira_roraima),
            Estado("Santa Catarina", "Florianópolis", 7610.361, "Sul", R.drawable.bandeira_santa_catarina),
            Estado("São Paulo", "São Paulo", 44411.238, "Sudeste", R.drawable.bandeira_sao_paulo),
            Estado("Sergipe", "Aracajú", 2210.004, "Nordeste", R.drawable.bandeira_sergipe),
            Estado("Tocantins", "Palmas", 277423.62, "Norte", R.drawable.bandeira_tocantins)

        )
    }
}