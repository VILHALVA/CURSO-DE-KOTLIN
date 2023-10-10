# COLLECTIONS ARRAYS
Em Kotlin, as collections são estruturas de dados que permitem armazenar e manipular conjuntos de elementos de maneira eficiente. As collections são amplamente usadas na programação para lidar com grupos de dados. Kotlin oferece várias classes e interfaces para trabalhar com collections, incluindo arrays, listas, sets, maps e muito mais. Vamos dar uma olhada em como usar arrays em Kotlin.

**Arrays em Kotlin:**

Um array é uma coleção ordenada de elementos do mesmo tipo. Em Kotlin, você pode criar arrays de diferentes tipos de dados, incluindo tipos primitivos e objetos. Os arrays em Kotlin têm um tamanho fixo, o que significa que você precisa especificar o tamanho do array quando o cria.

**Declarando e Inicializando um Array:**

Você pode declarar e inicializar um array de várias maneiras em Kotlin:

1. **Usando a função `arrayOf()`:**

   ```kotlin
   val numeros = arrayOf(1, 2, 3, 4, 5)
   val nomes = arrayOf("Alice", "Bob", "Charlie")
   ```

2. **Usando a função `Array()` com lambda:**

   ```kotlin
   val numerosPares = Array(5) { i -> i * 2 }
   ```

   Isso cria um array de tamanho 5 onde cada elemento é calculado com base na expressão lambda.

**Acessando Elementos do Array:**

Você pode acessar elementos de um array usando o operador de índice `[]`. O índice do primeiro elemento é 0.

```kotlin
val numeros = arrayOf(1, 2, 3, 4, 5)
val primeiroNumero = numeros[0] // 1
val terceiroNumero = numeros[2] // 3
```

**Iterando em um Array:**

Você pode iterar em um array usando loops, como o loop `for` ou o loop `forEach()`.

```kotlin
val numeros = arrayOf(1, 2, 3, 4, 5)

// Usando um loop for
for (numero in numeros) {
    println(numero)
}

// Usando forEach() com lambda
numeros.forEach { println(it) }
```

**Mudando Elementos em um Array:**

Você pode alterar elementos em um array atribuindo um novo valor a um índice específico.

```kotlin
val numeros = arrayOf(1, 2, 3, 4, 5)
numeros[1] = 10 // Altera o segundo elemento para 10
```

**Propriedades de Array:**

Os arrays em Kotlin têm algumas propriedades úteis, como `size` para obter o tamanho do array e `indices` para obter o intervalo de índices válidos.

```kotlin
val numeros = arrayOf(1, 2, 3, 4, 5)
val tamanho = numeros.size // 5
val primeiroIndice = numeros.indices.first // 0
val ultimoIndice = numeros.indices.last // 4
```

Essas são algumas das operações básicas que você pode realizar com arrays em Kotlin. Além disso, Kotlin oferece muitas funções de extensão úteis para trabalhar com arrays, como `filter()`, `map()`, `reduce()` e outras, que permitem manipular e transformar arrays de maneira conveniente.