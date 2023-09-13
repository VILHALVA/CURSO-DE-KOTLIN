package org.kotlinlang.play  

fun main() {
    var num1 = 5 // VOCÊ PODE FICAR ALTERANDO ESTES NÚMEROS A VONTADE PARA VER COMO AS CONDIÇÕES MUDAM.
    var num2 = 9
    
    if (num1 == num2) {
        println("VERDADEIRO! $num1 E $num2 NÚMEROS SÃO IGUAIS!")
    }
    else {
        println("FALSO! $num1 E $num2 SÃO NÚMEROS DIFERENTES!")
    }
    
    if (num1 > num2) {
        println("VERDADEIRO! $num1 É MAIOR DO $num2!")
    }
    else {
        println("FALSO! $num1 É MENOR DO QUE $num2!")
    }
    
    
    var idade = 14 // VOCÊ PODE FICAR ALTERANDO ESTE NÚMERO A VONTADE PARA VER COMO AS CONDIÇÕES MUDAM.
    if (idade < 10) {
        println("COM IDADE DE $idade, VOCÊ É CRIANÇA!")
    }
    else if (idade > 10 && idade <= 12) {
        println("COM IDADE DE $idade, VOCÊ É ADOLESCENTE!")
    }
    else if (idade > 12 && idade <= 18) {
        println("COM IDADE DE $idade, VOCÊ É JOVEM!")
    }
    else if (idade > 18 && idade < 60) {
        println("COM IDADE DE $idade, VOCÊ É ADULTO!")
    }
    else {
        println("COM IDADE DE $idade, VOCÊ É IDOSO!")
    }
    
    var media1 = 9 // VOCÊ PODE FICAR ALTERANDO ESTE NÚMERO A VONTADE PARA VER COMO AS CONDIÇÕES MUDAM.
    var resultado = if (media1 > 7) "APROVADO" else "REPROVADO" 
    println(resultado)
  
  // ===================== ESCOLA: ====================================================== //
    fun calculoMedia(nome: String, num1: Int, num2: Int) {
       var media = (num1 + num2) / 2
       println("A NOTA 1 É $num1. A NOTA 2 É $num2. A MÉDIA É $media")
       if (media <= 5) {
           println("ALUNO $nome ESTÁ REPROVADO!")
       }
       else if (media > 5 && media < 7) {
           println("ALUNO $nome ESTÁ DE RECUPERAÇÃO!")
       }
       else {
           println("ALUNO $nome FOI APROVADO!")
       }
   }
   
   calculoMedia("LUCAS", 4, 9) // VOCÊ PODE FICAR ALTERANDO ESTES VALORES A VONTADE PARA VER COMO AS CONDIÇÕES MUDAM.
   calculoMedia("ROSE", 9, 5)
   calculoMedia("PEDRO", 7, 4)
}