# ENTENDA ARRAYS
Em Kotlin, um array é uma coleção ordenada de elementos do mesmo tipo. Cada elemento em um array é identificado por um índice, que começa em zero. Os arrays podem ser unidimensionais (um único conjunto de elementos) ou multidimensionais (matrizes de matrizes). Neste artigo, vamos entender os conceitos básicos relacionados a arrays unidimensionais em Kotlin e como trabalhar com eles.

**Declarando um Array:**

Para declarar um array em Kotlin, você pode usar a função `arrayOf()` ou `arrayOfNulls()` para criar um array com elementos ou um array com valores nulos, respectivamente. Aqui estão alguns exemplos:

```kotlin
// Array de Inteiros
val numeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)

// Array de Strings
val nomes: Array<String> = arrayOf("Alice", "Bob", "Charlie")

// Array de Valores Nulos (String)
val valoresNulos: Array<String?> = arrayOfNulls(3)
```

**Acessando Elementos de um Array:**

Para acessar elementos em um array, você usa o operador de índice `[]` com o número do índice. Lembre-se de que os índices em Kotlin começam em zero.

```kotlin
val primeiroNumero = numeros[0] // Acessa o primeiro elemento (índice 0)
val segundoNome = nomes[1] // Acessa o segundo elemento (índice 1)
```

**Modificando Elementos em um Array:**

Você pode modificar os elementos de um array, desde que o array seja mutável (declarado com `var` em vez de `val`).

```kotlin
val frutas: Array<String> = arrayOf("Maçã", "Banana", "Laranja")
frutas[1] = "Pera" // Modifica o segundo elemento do array
```

**Tamanho de um Array:**

Para obter o tamanho de um array (ou seja, o número de elementos), você pode usar a propriedade `size`.

```kotlin
val tamanho = frutas.size // Retorna 3 (no exemplo acima)
```

**Iterando em um Array:**

Você pode usar um loop `for` ou funções de alta ordem, como `forEach`, para percorrer os elementos de um array.

Usando um loop `for`:

```kotlin
val numeros = arrayOf(1, 2, 3, 4, 5)
for (numero in numeros) {
    println(numero)
}
```

Usando `forEach`:

```kotlin
val nomes = arrayOf("Alice", "Bob", "Charlie")
nomes.forEach { nome ->
    println(nome)
}
```

**Arrays Multidimensionais:**

Kotlin também suporta arrays multidimensionais, como matrizes bidimensionais (arrays de arrays). Você pode declarar e acessar elementos em matrizes multidimensionais da seguinte maneira:

```kotlin
val matriz = Array(3) { IntArray(4) } // Cria uma matriz 3x4 de inteiros

matriz[0][0] = 1 // Acessa o elemento na primeira linha e primeira coluna
```

Isso é apenas uma introdução aos arrays em Kotlin. Eles são uma estrutura de dados fundamental que é amplamente usada para armazenar e manipular coleções de elementos do mesmo tipo. À medida que você se aprofundar em Kotlin, você encontrará mais recursos e funções úteis relacionadas a arrays, como filtragem, mapeamento e redução de elementos em um array.