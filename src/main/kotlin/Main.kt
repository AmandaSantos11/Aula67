
fun main(args: Array<String>) {

    val compra = Compra()

    var listaDeCompra = mutableListOf<Produto>()

    listaDeCompra.add(Maca("Maça",0.60))
    listaDeCompra.add(Maca("Maça",0.60))
    listaDeCompra.add(Laranja("Laranja",0.25))
    listaDeCompra.add(Maca("Maça",0.60))

    println(" ======Frutas======")
    println(compra.mostrarListaDeCompra(listaDeCompra))
    println("Valor total: R$${compra.calcularTotalDaCompra(listaDeCompra)}\n----------------")

    //ETAPA 2
    var listaDeCompra2 = mutableListOf<Produto>()
    println("\nVocê participou da nossa promoção!\n")
    compra.compraComOferta(2,listaDeCompra2)
    println(compra.mostrarListaDeCompra(listaDeCompra2))
    println("Valor total: R$${compra.calcularTotalDaCompra(listaDeCompra2)}")

    println("----------------")
    var listaDeCompra3 = mutableListOf<Produto>()
    println("\nVocê participou da nossa promoção!\n")
    compra.compraComOferta(1,listaDeCompra3)
    println(compra.mostrarListaDeCompra(listaDeCompra3))
    println("Valor total: R$${compra.calcularTotalDaCompra(listaDeCompra3)}")

    //ETAPA 3
    println("----------------")
    var listaDeCompra4 = mutableListOf<Produto>()
    listaDeCompra4.add(Maca("Maça",0.60))
    println(" ======Seu carrinho======")
    println(compra.mostrarListaDeCompra(listaDeCompra4))
    println("Valor total: R$${compra.calcularTotalDaCompra(listaDeCompra4)}\n----------------")
    compra.statusDoPedido(listaDeCompra4)

    println("----------------")
    var listaDeCompra5 = mutableListOf<Produto>()
    println(" ======Seu carrinho======")
    println(compra.mostrarListaDeCompra(listaDeCompra5))
    compra.statusDoPedido(listaDeCompra5)

    //ETAPA 4
    println("----------------")
    var listaDeCompra6 = mutableListOf<Produto>()
    println("Frutas disponíveis:\n1-Maça | Preço: R$0,60 | Quantidade: 5\n2-Laranja | Preço: R\$0,25 | Quantidade: 10\n")
    compra.comprarComEstoque(1,6,listaDeCompra6)

    println("----------------")
    var listaDeCompra7 = mutableListOf<Produto>()
    println("Frutas disponíveis:\n1-Maça | Preço: R$0,60 | Quantidade: 5\n2-Laranja | Preço: R\$0,25 | Quantidade: 10\n")
    compra.comprarComEstoque(2,5,listaDeCompra7)
    println(" ======Seu carrinho======")
    println(compra.mostrarListaDeCompra(listaDeCompra7))
    println("Valor total: R$${compra.calcularTotalDaCompra(listaDeCompra7)}\n----------------")
    compra.statusDoPedido(listaDeCompra7)
}