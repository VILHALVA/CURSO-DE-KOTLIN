package org.kotlinlang.play  

/* ESTRUTURAS DE REPETIÇÃO (LOOPS) 
 * FOR (PARA)
 * WHILE (ENQUANTO)
 */

fun main() {
    var num = 1
    while(num < 10) {
        println("CONTAGEM WHILE $num")
        num++  // -> PARA NÃO DÁ UM LOOP INFINITO, NO WHILE É PRECISO ADICIONAR ESSE INCREMENTO.
    }
    
    var n = 10
    while(n > 0) {
        println("CONTAGEM REGRESSIVA $n")
        n--
    }
    
    var vin = 0
    for(vin in 1..10) { // CONTAGEM DE 1 ATÉ 10.
        println("CONTAGEM FOR $vin")
    }
    
    //===================== USANDO O FOR COM ARRAY ===============================//
    val postagens = arrayOf("NUM 1", "NUM 2", "NUM 3", "NUM 4", "NUM 5")
    for (postagem in postagens) {
        println(postagem)
    }
    
    for ((indice, postagem) in postagens.withIndex()) {
        println("$indice - $postagem")
    }
}