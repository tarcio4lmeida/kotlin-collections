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
    println(pedidosFreteGratis[Pedido(numero=1, valor = 20.0)])

}


data class Pedido(
    val numero: Int,
    val valor: Double
)
