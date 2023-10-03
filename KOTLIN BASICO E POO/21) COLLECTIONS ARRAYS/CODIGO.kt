package org.kotlinlang.play  

/*
 * Collections ou Coleções são implementações de estruturas de dados.
 * - LIST(listOf) -> IMUTAVEL, TAMANHO FIXO, APENAS LEITURA.
 * - ARRAYLIST(arrayListOf) -> MUTAVEL, TAMANHO VARIAVEL, LEITURA E ESCRITA.
 */

fun main() {
    var estados = listOf("SP", "RJ", "MG")
    println(estados)
    
    var estados2 = arrayListOf("SP", "RJ", "MG")
    estados2[0] = "BA" //-> MUDANDO O INDICE 0.
    estados2.add("AM") //-> ADICIONANDO NOVO ITEM.
    estados2.remove("SP") //-> REMOVE ITEM.
    estados2.removeAt(2) //-> REMOVE ITEM PELO INDICE.
    println(estados2)
    println(estados2.size) //-> EXIBE QUANTIDADE DE ITENS.
    println(estados2.isEmpty()) //-> EXIBE SE A LISTA ESTÁ VAZIA.
}