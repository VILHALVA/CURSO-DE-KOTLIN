package org.kotlinlang.play  

/*
 * UMA INTERFACE É UM CONTRATO QUE QUANDO ASSUMIDO POR UMA CLASS DEVE SER IMPLEMENTADO.
 * PODEMOS TER MUITOS OBJETOS (CLASS) QUE PODEM POSSUIR A MESMA AÇÃO (METODO/FUNÇÃO). 
 * PORÉM, PODEM SER EXECUTADAS DE MANEIRA DIFERENTE.
*/

open class Cidadao() {
    fun direitosDeveres() {
        println("TODO CIDADÃO TEM DIREITOS E DEVERES!")
    }
}

interface Eleitor {
    fun votar()
}

class Vilhalva(): Cidadao(), Eleitor {
    override fun votar() {
        println("VOTAR NO NOVO PRESIDENTE!")
    }
}

interface Presidente {
    fun ganharEleicao()
}

class Obama(): Cidadao(), Presidente {
    override fun ganharEleicao() {
        println("GANHAR A ELEIÇÃO NOS EUA!")
    }
}

fun main() {
    val vilhalva = Vilhalva()
    vilhalva.direitosDeveres()
    vilhalva.votar()
    
    val obama = Obama()
    vilhalva.direitosDeveres()
    obama.ganharEleicao()   
}