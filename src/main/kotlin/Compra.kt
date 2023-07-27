class Compra {

    fun calcularTotalDaCompra(listaDeCompra:MutableList<Produto>):Double{
        var totalDaCompra = 0.0
        if (listaDeCompra.isNotEmpty()){
            for (produto in listaDeCompra){
                totalDaCompra += produto.preco
            }
        }
        else{
            throw IllegalArgumentException()
        }
        return totalDaCompra
    }

    fun mostrarListaDeCompra(listaDeCompra:MutableList<Produto>):String{
        var produtos = ""

        listaDeCompra.forEach { produto -> produtos += "Nome:${produto.nome} | Preço:R$${produto.preco}\n" }

        return produtos
    }
}