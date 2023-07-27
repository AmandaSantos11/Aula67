
fun main(args: Array<String>) {

    val compra = Compra()

    var listaDeCompra = mutableListOf<Produto>()

    listaDeCompra.add(Maca("Maça",0.60))
    listaDeCompra.add(Maca("Maça",0.60))
    listaDeCompra.add(Laranja("Laranja",0.25))
    listaDeCompra.add(Maca("Maça",0.60))

    println(" ======Frutas======")
    println(compra.mostrarListaDeCompra(listaDeCompra))
    println("Valor total: R$${compra.calcularTotalDaCompra(listaDeCompra)}")
}