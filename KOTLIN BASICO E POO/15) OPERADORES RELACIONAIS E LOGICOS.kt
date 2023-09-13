package org.kotlinlang.play  

/*
 * OPERADORES RELACIONAIS:
 * == (IGUAL A)
 * != (DIFERENTE)
 * > (MAIOR QUE)
 * < (MENOR QUE)
 * >= (MAIOR OU IGUAL)
 * <= (MENOR UM IGUAL)
 * OPERADORES LOGICOS:
 * || (OU/OR)
 * && (E/AND)
 */

fun main() {
    println(5 == 5)
    println(5 != 5)
    println(5 > 5)
    println(5 < 5)
    println(5 >= 5)
    println(5 <= 5)   
    
    var nota = 6
    println(nota > 7)
    
    println(true && true)
    println(true && false)
    println(true || true)
    println(true || false)
    
    println(5 == 5 && 6 == 6)
    println(5 == 5 || 7 == 9)
    
    var notaProfessor = 7
    var notaGeral = 5
    println(notaProfessor > 6 && notaGeral >= 5)
    println(notaProfessor > 6 || notaGeral >= 5)
}