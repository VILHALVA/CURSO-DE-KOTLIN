package org.kotlinlang.play  

/* PRIVATE > VISIVEL APENAS DENTRO DA CLASS.
 * PROTECTED > FUNCIONA COMO O PRIVATE, MAS É VISIVEL EM SUBCLASS (FILHAS).
 * PUBLIC > VISIVEL EM TODO O LUGAR. CASO NÃO DEFINIDA É O PADRÃO.
 * INTERNAL > PARECIDA COM O PUBLIC. A DIFERENÇA É QUE SUA VISIBILIDADE É RESTRINGINDA AO MÓDULO. */

open class Animal {
    public var nome = "MARLEY"
    private var idade = 48
    protected var sexo = "MASCULINO"
    internal var regiao = "BRASIL"
}

class Cao: Animal() {
    fun exibenome() {
        println("O NOME DO CÃO É $nome")
    }
    
    /* fun exibeidade() { > "PRIVATE" NÃO PODE SER INSTANCIADA FORA DA CLASS.
        println("SUA IDADE É $idade")
    } */
    
    fun exibesexo() {
        println("SEU SEXO É $sexo")
    }
    
    fun exiberegiao() {
        println("SUA REGIÃO É $regiao")
    }
}

fun main() {
   	val animal = Animal()
    println(animal.nome)
    //println(animal.idade) > "PRIVATE" NÃO PODE SER INSTANCIADA FORA DA CLASS.
    // println(animal.sexo) > "PROTECTED" NÃO PODE SER INSTANCIADA FORA DA CLASS.
    println(animal.regiao) 
    
    val cao = Cao()
    cao.exibenome()
    // cao.exibeidade() > "PRIVATE" NÃO PODE SER INSTANCIADA FORA DA CLASS.
    cao.exibesexo()
    cao.exiberegiao()
}