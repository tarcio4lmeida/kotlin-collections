fun testaSet() {
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

    println(assistiramCursoAndroid union assistiramCursoKoltin)
    println(assistiramCursoAndroid subtract assistiramCursoKoltin)
    println(assistiramCursoAndroid intersect assistiramCursoKoltin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList.toSet())
}
