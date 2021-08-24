fun main() {
    val pedidos = mutableMapOf<Int,Double>(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )

    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (p in pedidos){
        println("pedido ${p.key} - valor ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)

    pedidos.put(1, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(1, 200.0)
    println(pedidos)

    pedidos.remove(1)
    println(pedidos)

    pedidos.remove(3, 70.0)
    println(pedidos)

}


