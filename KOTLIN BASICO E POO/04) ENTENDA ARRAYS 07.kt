package org.kotlinlang.play        

fun main() {                        
 	var nomes = arrayOf("JAMILTOM", "MARCOS", "LETICIA", "JOSÉ", 34)
    nomes[0] = "PEDRO" // ALTERANDO O INDICE 0.
    println(nomes[0])
    println(nomes[1])
    println(nomes[2])
    println(nomes[3])
    println(nomes[4])
    
    var numeros = intArrayOf(45, 56, 34) // ARRAY DE NÚMEROS INT.
    println(numeros[0])
    println(numeros[1])
    println(numeros[2])   
}

/* ARRAYS SE TRATAM DE VARIAVEIS COMPOSTAS: 
 * AMARZENAR MULTIPLOS DADOS EM UMA ÚNICA VARIAVEL.
 * DENTRO DE UMA MESMA ARRAY (ARRAYOF) PODE TER VALORES INT, STRING, FLOAT MISTURADOS (NO JAVA NÃO PODE). */

