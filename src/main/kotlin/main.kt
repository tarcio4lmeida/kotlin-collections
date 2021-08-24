fun main() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 50.0),
        Pedido(5, 60.0)
    )

    println(pedidos)

    val pedidosMapeados = pedidos.associateBy { pedido ->
        pedido.numero
    }

    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=5, valor = 60.0)])

    val mapa : Map<Boolean, Pedido> = pedidos.associateBy {
        pedido -> pedido.valor > 50.0
    }

    val  pedidosFreteGratisAgrupados = pedidos.groupBy {  pedido: Pedido ->
        pedido.valor > 50
    }

    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf<String>(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Gisele"
    )

    val agenda = nomes.groupBy { nome->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])
}


data class Pedido(
    val numero: Int,
    val valor: Double
)
