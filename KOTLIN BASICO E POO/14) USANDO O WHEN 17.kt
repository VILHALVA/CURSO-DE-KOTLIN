package org.kotlinlang.play  

fun main() {
    var OPCAO = 5
    when (OPCAO) {
        1 -> println("OPÇÃO 1")
        2 -> println("OPÇÃO 2")
        3 -> println("OPÇÃO 3")
        4 -> println("OPÇÃO 4")
        5 -> println("OPÇÃO 5")
        6 -> println("OPÇÃO 6")
        7 -> println("OPÇÃO 7")
        8 -> println("OPÇÃO 8")
        9 -> println("OPÇÃO 9")
        10 -> println("OPÇÃO 10")
        else -> println("OPÇÃO INVÁLIDA!")
    }
    
    var OPCAO2 = 5
    var resultado = when (OPCAO2) {
        1 -> "OPÇÃO 1"
        2 -> "OPÇÃO 2"
        3 -> "OPÇÃO 3"
        4 -> "OPÇÃO 4"
        5 -> "OPÇÃO 5"
        6 -> "OPÇÃO 6"
        7 -> "OPÇÃO 7"
        8 -> "OPÇÃO 8"
        9 -> "OPÇÃO 9"
        10 -> "OPÇÃO 10"
        else -> "OPÇÃO INVÁLIDA!"
    }
    println(resultado)
    
    var MENU = 5
    when (MENU) {
        1 -> {
            println("CAFÉ COM LEITE!")
            println("MELHOR OPÇÃO DA CASA!")
        	 }
        2 -> {
            println("PIZZA")
            println("CUIDADO PARA NÃO ENGORDAR!")
        	 }
        3 -> {
            println("BRIGADEIRO!")
            println("MELHOR SOBREMESA!")
        	 }
        4 -> {
            println("GELATINA!")
            println("DETESTO ESSA COMIDA!")
        	 }
        5,6 -> {
            println("BISCOITO!")
            println("É BISCOITO OU BOLACHA? EIS A QUESTÃO!")
        	 }
        else -> println("ESCOLHA INVÁLIDA!")
    }
}