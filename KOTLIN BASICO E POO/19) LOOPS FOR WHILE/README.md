# LOOPS FOR WHILE
Em Kotlin, você pode usar loops `for` e `while` para repetir um bloco de código várias vezes. Aqui estão exemplos de como usar esses loops:

**Loop `for` (para):**

O loop `for` é útil quando você sabe a quantidade exata de iterações que deseja realizar. Você pode iterar por uma sequência de números ou por elementos de uma coleção, como uma lista ou um intervalo.

```kotlin
// Loop for para iterar por um intervalo de números
for (i in 1..5) {
    println(i)
}

// Loop for para iterar por elementos de uma lista
val frutas = listOf("Maçã", "Banana", "Laranja")
for (fruta in frutas) {
    println(fruta)
}
```

**Loop `while` (enquanto):**

O loop `while` é usado quando você deseja repetir um bloco de código enquanto uma condição específica for verdadeira. A condição é verificada antes de cada iteração.

```kotlin
var contador = 0

while (contador < 5) {
    println("Contador: $contador")
    contador++
}
```

**Loop `do-while` (faça-enquanto):**

O loop `do-while` é semelhante ao `while`, mas a condição é verificada após a primeira iteração. Isso garante que o bloco de código seja executado pelo menos uma vez.

```kotlin
var contador = 0

do {
    println("Contador: $contador")
    contador++
} while (contador < 5)
```

**Break e Continue:**

Você pode usar a palavra-chave `break` para sair de um loop antes que a condição seja falsa e a palavra-chave `continue` para pular para a próxima iteração do loop.

```kotlin
for (i in 1..10) {
    if (i == 5) {
        break // Sai do loop quando i for igual a 5
    }
    if (i % 2 == 0) {
        continue // Pula as iterações com números pares
    }
    println(i)
}
```

Os loops `for` e `while` são fundamentais para a programação e permitem que você execute blocos de código repetidamente, enquanto as condições especificadas forem atendidas. Escolha o loop que melhor se adapte à sua situação com base na quantidade de iterações desejadas e nas condições a serem verificadas.