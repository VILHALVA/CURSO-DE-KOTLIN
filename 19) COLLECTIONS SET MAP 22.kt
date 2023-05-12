package org.kotlinlang.play 

/* 
 * SET(hashSetOf) -> NÃO PERMITE ELEMENTOS DUPLICADOS, É MAIS RAPIDO QUE O ARRAYLIST, NÃO MANTEM ORDEM DOS ELEMENTOS.
 * MAP(hashMapOf) -> É UMA IMPLEMENTAÇÃO CHAVE VALOR (SEMELHANTE AO DICIONARIO DO PYTHON). 
*/

fun main() {
    var itens = hashSetOf("A", "B", "C", "C")
    println(itens)
    
    for (item in itens) {
        println(item)
    }
    
    var num = hashSetOf(10, 20, 30, 50, 70, 100)
    println(num)
    
    
    var animal = hashMapOf(
        "URSO" to "ANIMAL QUE EMBERNA", 
        "LEÃO" to "REI DA SELVA", 
        "CÃO" to "MELHOR AMIGO DO HOMEM")
    
    animal.put("PASSARO", "GOSTA DE VOAR") //-> PUT ADICIONA ITENS. 
    animal.remove("LEÃO") //-> REMOVE ITEM COM BASE NA CHAVE.
    println(animal)
    
    for (item in animal.values) { //-> VALUES EXIBE APENAS VALORES.
        println(item)
    }
    
    for (item in animal.keys) { //-> KEYS EXIBE APENAS AS CHAVES.
        println(item)
    }
}