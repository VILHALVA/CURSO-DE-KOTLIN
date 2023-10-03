package org.kotlinlang.play  

open class Animal { // O "OPEN" PERMITE QUE A CLASSE E O METODO SEJAM HERDADOS (DESABILITA O FINAL).
    open fun dormir() {
        print("DORMINDO ")
    }
    
    open fun correr() {
        println("CORRENDO!")
    }   
}

class Cao: Animal() { // CÃO HERDA DE ANIMAL.
    override fun dormir() { // "OVERRIDE" É USADO PARA SOBRE ESCREVER O "DORMIR" DA CLASS MÃE.
        super.dormir() // O "SUPER" FAZ UM COMPREMENTO ENTRE A CLASS MÃE E CLASS FILHA.
        println("COMO CÃO!")
    }
    
    fun latir() {
        println("AU! AU! AU!")
    }
}

class Passaro: Animal() { // PASSARO HERDA DE ANIMAL.
    override fun dormir() {
        super.dormir()
        println("COMO PASSARO!")
    }
    
    fun voando() {
        println("PASSARO VOANDO!")
    }  
}

fun main() {
    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()
    
    val passaro = Passaro()
    passaro.dormir()
    passaro.correr()
    passaro.voando()
}