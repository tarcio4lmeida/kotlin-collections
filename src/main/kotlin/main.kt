fun main(){
    val nomes: Collection<String> = listOf("Alex", "Fran", "Gui", "Maria", "Ana")

    println(nomes)

    for(nome in nomes){
        println(nome)
    }
    println("Tem o nome alex? ${nomes.contains("Alex")}")
    println("Tamanho da colecao ${nomes.size}")

}