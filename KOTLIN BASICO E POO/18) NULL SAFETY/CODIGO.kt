package org.kotlinlang.play  

/*
 * A "?" APÓS A VARIAVEL FUNCIONA COMO "TRY" E "EXCETION"!
 * EVITANDO QUE ALGUMA EXCEÇÃO SEJA DISPARADA NO CONSOLE. 
 */

fun main() {
    var texto: String? = null
    println(texto)
    
    var nome: String? = null
    // nome = "VILHALVA"
    println(nome?.length) // "LENGTH" SERVE PARA EXIBIR A QUANTIDADE DE CARACTERES.
}