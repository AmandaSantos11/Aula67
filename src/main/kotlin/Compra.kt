class Compra {

    fun calcularTotalDaCompra(listaDeCompra:MutableList<Produto>):Double{
        var totalDaCompra = 0.0
        if (listaDeCompra.isNotEmpty()){
            for (produto in listaDeCompra){
                totalDaCompra += produto.preco
            }
        }
        else{
            throw IllegalArgumentException("A lista de compra está vazia")
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

    //ETAPA 3
    fun statusDoPedido(listaDeCompra:MutableList<Produto>):Boolean{
        if (listaDeCompra.isNotEmpty()){
            println(" =====STATUS DO PEDIDO=====")
            println("Opa temos uma boa notícia! Seu pedido está sendo preparado")
            Thread.sleep(1500)
            println("Seu pedido está pronto e foi entregue a transportadora")
            Thread.sleep(1500)
            println("Seu pedido está a caminho, previsão de entrega em: 30min")
            Thread.sleep(1500)
            println("Seu produto foi entregue, agradecemos a sua preferência!")
            return true
        }
        else{
            println("Você ainda não comprou!")
            return false
        }
    }

    //ETAPA 4
    fun comprarComEstoque(codigo:Int,qtd:Int,listaDeCompra:MutableList<Produto>):Boolean{
        if (codigo==1){
            when{
                qtd in 1..5 -> {
                    for (i in 1..qtd){
                        listaDeCompra.add(Maca("Maça",0.60))
                    }
                    println("Compra efetuada com sucesso!")
                    return true
                }
                else -> {
                    println("A quantidade solicitada não está disponível para esse produto")
                }
            }
        }
        else if(codigo==2){
            when{
                qtd in 1..10 -> {
                    for (i in 1..qtd){
                        listaDeCompra.add(Laranja("Laranja",0.25))
                    }
                    println("Compra efetuada com sucesso!")
                    return true
                }
                else -> {
                    println("A quantidade solicitada não está disponível para esse produto")
                }
            }
        }
        else{
            throw IllegalArgumentException("Opção de produto inválida")
        }
        return false
    }
}