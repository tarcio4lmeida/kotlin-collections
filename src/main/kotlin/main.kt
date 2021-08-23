fun main() {

    val assistiramCursoAndroid: List<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria"
    )

    val assistiramCursoKoltin:List<String> = listOf(
        "Alex",
        "Paulo",
        "Maria"
    )

    val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    println(assistiramAmbos)

    assistiramAmbos.addAll(assistiramCursoKoltin)
    println(assistiramAmbos)
    println(assistiramAmbos.distinct())


}

