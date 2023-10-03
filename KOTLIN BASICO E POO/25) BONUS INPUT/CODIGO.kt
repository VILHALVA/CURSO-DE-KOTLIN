package org.kotlinlang.play 

fun main() {
    val nome: String?
    val idade: Int?

    print("Digite seu nome: ")
    nome = readLine()

    print("Digite sua idade: ")
    idade = readLine()?.toIntOrNull()

    if (nome != null && idade != null) {
        println("Seu nome é $nome e você tem $idade anos.")
    } 
    else {
        println("Nome ou idade inválidos.")
    }
}
