
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
}