package org.kotlinlang.play  

fun exibirMensagem() {
	println("VOCÊ NÃO PREENCHEU TODOS OS DADOS!") 
}

fun multiplicacao() {
    var n1 = 34
    var n2 = 67
    var total = n1 * n2
    println("MULTIPLICANDO $n1 X $n2 = $total")
}

fun saldacao(nome: String, idade: Int) {
    println("OLÁ $nome COM $idade ANOS, SEJA BEM VINDO!")
}

fun somar(numero1: Int, numero2: Int) {
    var totais = numero1 + numero2
    println("A SOMA ENTRE $numero1 E $numero2 É IGUAL $totais")
}

fun divisao(num1: Int, num2: Int): Int {
    var div = num1 / num2
    return div
}

fun main() {                        
 	exibirMensagem() 
    multiplicacao()
    
    saldacao("VILHALVA", 30)
    saldacao("JOSÉ", 22)
    somar(34, 67)
    somar(56, 89)
    
    var res = divisao(89, 12)
    println(res)
}