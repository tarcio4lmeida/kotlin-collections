fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes

    banco.salva("Alex")
    println(nomesSalvos)
    println(banco.nomes)
}

class BancoDeNomes{

    val nomes : Collection<String>  get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }

    companion object{
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    println(nomes)

    for (nome in nomes) {
        println(nome)
    }

    println("Tem o nome alex? ${nomes.contains("Alex")}")
    println("Tamanho da colecao ${nomes.size}")
}