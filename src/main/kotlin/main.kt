fun main() {

    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria"
    )

    val assistiramCursoKoltin: MutableSet<String> = mutableSetOf(
        "Alex",
        "Paulo",
        "Maria"
    )

    //val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKoltin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKoltin)
    println(assistiramAmbos)

}

