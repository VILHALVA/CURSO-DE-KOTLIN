package org.kotlinlang.play 

/* ENUM -> É UMA NUMERAÇÃO.
 * É UM TIPO DE DADOS QUE CONSISTE EM UM CONJUNTO DE CONSTANTES.  
*/

enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {
    var status: StatusPedido = StatusPedido.APROVADO
}

fun main() { 
    val pedido = Pedido()
    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("PEDIDO ESTÁ SENDO PROCESSADO!")
    }
    else if (pedido.status == StatusPedido.APROVADO) {
        println("SEU PEDIDO FOI APROVADO!")
    }
    else {
        println("SEU PEDIDO FOI REPROVADO!")
    }
}