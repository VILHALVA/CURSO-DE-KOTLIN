# ESTRUTURAS CONDICIONAIS
As estruturas condicionais permitem que você controle o fluxo de execução de um programa com base em condições. Em Kotlin, você pode usar as seguintes estruturas condicionais:

1. **if-else:**

   O `if-else` permite que você execute um bloco de código se uma condição for verdadeira e outro bloco de código se a condição for falsa.

   ```kotlin
   val idade = 18

   if (idade >= 18) {
       println("Você é maior de idade.")
   } else {
       println("Você é menor de idade.")
   }
   ```

2. **when:**

   O `when` é uma versão mais poderosa do `switch` em outras linguagens de programação. Ele permite que você compare uma expressão com vários casos e execute o bloco de código correspondente ao primeiro caso que corresponder.

   ```kotlin
   val diaDaSemana = 3

   when (diaDaSemana) {
       1 -> println("Segunda-feira")
       2 -> println("Terça-feira")
       3 -> println("Quarta-feira")
       4 -> println("Quinta-feira")
       5 -> println("Sexta-feira")
       else -> println("Fim de semana")
   }
   ```

3. **if-else-if-else:**

   Você pode usar várias instruções `if` encadeadas com `else if` para testar várias condições sequencialmente e executar o bloco de código correspondente à primeira condição verdadeira.

   ```kotlin
   val nota = 85

   if (nota >= 90) {
       println("A")
   } else if (nota >= 80) {
       println("B")
   } else if (nota >= 70) {
       println("C")
   } else {
       println("D")
   }
   ```

4. **Expressões condicionais:**

   Você também pode usar a expressão condicional (operador ternário) para criar uma estrutura condicional concisa.

   ```kotlin
   val idade = 20
   val status = if (idade >= 18) "Maior de idade" else "Menor de idade"
   println(status)
   ```

As estruturas condicionais são essenciais para controlar o fluxo do seu programa, permitindo que você tome decisões com base em condições específicas. Elas podem ser usadas para executar diferentes blocos de código, dependendo das condições fornecidas. Além disso, o `when` é uma opção poderosa para lidar com várias opções de casos em uma única expressão.