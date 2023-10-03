package org.kotlinlang.play  

class Casa {
    // ATRIBUTOS OU PROPRIEDADES:
    var cor: String = "" // ATRIBUTOS DA CLASS
    
    // METODOS OU FUNÇÕES:
    fun abrirJanela(quat: Int) {
        println("ABRINDO $quat JANELAS")
    }
    
    fun fecharJanela(quat: Int) {
        println("FECHANDO $quat JANELAS")
    }
    
    fun abrirCasa() {
        this.abrirJanela(7) // ACESSANDO METODOS DENTRO DE OUTRO METODO
    }
    
    fun fecharCasa() {
        this.fecharJanela(7)
    }
}

fun main() {  
    val casa = Casa()  // CRIAÇÃO DO OBJETO CASA
    casa.cor = "AMARELA"
    println(casa.cor)
    casa.abrirJanela(4)
    casa.fecharJanela(10)
    
    val casa2 = Casa() // CRIAÇÃO DO 2 OBJETO DE CASA
    casa2.cor = "VERMELHA"
    println(casa2.cor)
    
    val casa3 = Casa() // CRIAÇÃO DO 3 OJETO DE CASA
    casa3.cor = "AZUL"
    println(casa3.cor)
    casa3.fecharJanela(9)
    
    val casa4 = Casa() // CRIAÇÃO DO 4 OBJETO DE CASA
    casa4.cor = "PRETO"
    println(casa4.cor)
    casa4.abrirCasa()
    casa4.fecharCasa()
}

/* DIFERENTE DO JAVA, NO KOTLIN NÃO É PRECISO CRIAR OS METODOS APÓS OS ATRIBUTOS. 
 * NEM O METODO RETURN PARA USAR OS PARAMETROS NO OBJETO. */


