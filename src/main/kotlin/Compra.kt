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

    //ETAPA 2
    fun compraComOferta(opcao:Int,listaDeCompra:MutableList<Produto>):MutableList<Produto>{
        when(opcao){
            1 -> { listaDeCompra.add(Maca("Maça",0.60))
                    listaDeCompra.add(Maca("Maça",0.0))
            }
            2 -> { listaDeCompra.add(Laranja("Laranja",0.25))
                listaDeCompra.add(Laranja("Laranja",0.25))
                listaDeCompra.add(Laranja("Laranja",0.0))
            }
            else -> { throw IllegalArgumentException("Opção inválida")
            }
        }
        return listaDeCompra
    }
}