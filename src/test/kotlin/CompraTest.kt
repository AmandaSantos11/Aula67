import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CompraTest {

    val compra = Compra()

    @Test
    fun verificaCalcularTotalDaCompra(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Laranja("Laranja",0.25))
        listaDeCompra.add(Maca("Maça",0.60))

        val resultado = compra.calcularTotalDaCompra(listaDeCompra)

        assertEquals(2.05,resultado)
    }

    @Test
    fun verificaSeAdicionaCorretamenteAsFrutasNaListaDeCompra(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Laranja("Laranja",0.25))
        listaDeCompra.add(Maca("Maça",0.60))

        assertEquals(4,listaDeCompra.size)
    }

    @Test
    fun verificaSeRemoveCorretamenteAsFrutasNaListaDeCompra(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Laranja("Laranja",0.25))
        val maca = Maca("Maça",0.60)

        listaDeCompra.remove(maca)

        assertFalse(listaDeCompra.contains(maca))
    }

    @Test
    fun verificaSeCaiEmExececaoQuandoAListaDeCompraEstaVazia(){
        var listaDeCompra = mutableListOf<Produto>()
        assertThrows<IllegalArgumentException>{compra.calcularTotalDaCompra(listaDeCompra)}
    }

    @Test
    fun verificaSeMostraAsFrutasDaListaDeCompra(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Maca("Maça",0.60))
        listaDeCompra.add(Laranja("Laranja",0.25))
        listaDeCompra.add(Maca("Maça",0.60))

        val retornoEsperado = "Nome:Maça | Preço:R$0.6\nNome:Maça | Preço:R$0.6\nNome:Laranja | Preço:R$0.25\nNome:Maça | Preço:R$0.6\n"

        val retornoRecebido = compra.mostrarListaDeCompra(listaDeCompra)

        assertEquals(retornoEsperado,retornoRecebido)
    }

    //ETAPA 2
    @Test
    fun verificaACompraComOfertaCaiEmExcecao(){
        var listaDeCompra = mutableListOf<Produto>()
        assertThrows<IllegalArgumentException> { compra.compraComOferta(0,listaDeCompra) }
    }
    @Test
    fun verificaSeAlteraQuantidadeDaListaDeCompraQuandoCompraComOfertaMaca(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Maca("Maça",0.60))
        compra.compraComOferta(1,listaDeCompra)
        assertTrue(listaDeCompra.size==3)
    }
    @Test
    fun verificaSeAlteraQuantidadeDaListaDeCompraQuandoCompraComOfertaLaranja(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Laranja("Laranja",0.25))
        compra.compraComOferta(2,listaDeCompra)
        assertTrue(listaDeCompra.size==4)
    }

    //ETAPA 3
    @Test
    fun verificaSeStatusPedidoNotificaAEntrega(){
        var listaDeCompra = mutableListOf<Produto>()
        listaDeCompra.add(Maca("Maça",0.60))
        val notificao = compra.statusDoPedido(listaDeCompra)
        assertEquals(true,notificao)
    }
    @Test
    fun verificaSeStatusPedidoNotificaAListaDeCompraVazia(){
        var listaDeCompra = mutableListOf<Produto>()
        val notificao = compra.statusDoPedido(listaDeCompra)
        assertEquals(false,notificao)
    }
}