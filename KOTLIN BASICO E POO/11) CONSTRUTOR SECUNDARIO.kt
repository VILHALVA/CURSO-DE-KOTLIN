package org.kotlinlang.play  

class Casa {
    // ATRIBUTOS OU PROPRIEDADES:
    var cor: String // ATRIBUTOS DA CLASS
    var vagasGaragem: Int // ATRIBUTOS DA CLASS
    
    constructor (cor: String, vagasGaragem: Int) {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    
    // METODOS OU FUNÇÕES:
    fun detalhes() {
        println("A CASA TEM COR $cor E $vagasGaragem VAGAS NA GARAGEM")
    }
}

fun main() {
    val casa = Casa("AMARELA", 2)  // CRIAÇÃO DO OBJETO CASA COM CONSTRUTOR (PARAMETROS).
    casa.detalhes()
}