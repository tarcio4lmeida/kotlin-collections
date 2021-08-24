fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0

    )

    val valorpedido = pedidos.getValue(4)
    println(valorpedido)
    println(pedidos.getOrElse(0) {
        "Nao tem o pedido"
    })

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)
    println(pedidos.values)

    for (numero in pedidos.keys) {
        println("pedidos $numero")
    }

    val pedidoFilter = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidoFilter)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    println(pedidosAcima)

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(8 to 100.0))
    println(pedidos)

    println(pedidos - 6)

    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    pedidos += listOf<Pair<Int, Double>>(7 to 100.0, 8 to 20.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)
}
