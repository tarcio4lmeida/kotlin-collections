fun main() {

    val banco = BancoDeNomes()
    banco.salva("Alex")
    println(banco.nomes)

}

class BancoDeNomes{


    val nomes : Collection<String>  get() = dados

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