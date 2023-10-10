# COLLECTIONS SET MAP
Em Kotlin, as collections `Set` e `Map` são estruturas de dados usadas para armazenar e manipular conjuntos de elementos e pares chave-valor, respectivamente. Vamos explorar as características e uso dessas collections:

**Set:**

Um `Set` é uma coleção que armazena elementos únicos, o que significa que não pode conter duplicatas. Existem dois tipos principais de `Set` em Kotlin: `Set` e `MutableSet`. A diferença principal é que um `Set` é somente leitura (não pode ser alterado após a inicialização), enquanto um `MutableSet` permite adicionar e remover elementos.

**Declarando e Inicializando um Set:**

```kotlin
// Usando a função setOf() para criar um Set imutável
val frutas = setOf("Maçã", "Banana", "Laranja")

// Usando a função mutableSetOf() para criar um MutableSet mutável
val animais = mutableSetOf("Cachorro", "Gato", "Pássaro")
```

**Adicionando e Removendo Elementos de um MutableSet:**

```kotlin
val numeros = mutableSetOf(1, 2, 3)

numeros.add(4) // Adiciona o número 4
numeros.remove(2) // Remove o número 2
```

**Map:**

Um `Map` é uma coleção que armazena pares chave-valor, onde cada chave é única e está associada a um valor. Existem dois tipos principais de `Map` em Kotlin: `Map` e `MutableMap`. Da mesma forma que com `Set`, um `Map` é somente leitura, enquanto um `MutableMap` permite adicionar, remover e modificar pares chave-valor.

**Declarando e Inicializando um Map:**

```kotlin
// Usando a função mapOf() para criar um Map imutável
val capitais = mapOf("Brasil" to "Brasília", "EUA" to "Washington", "França" to "Paris")

// Usando a função mutableMapOf() para criar um MutableMap mutável
val frutasEQuantidade = mutableMapOf("Maçã" to 5, "Banana" to 3, "Laranja" to 8)
```

**Acessando e Modificando Valores em um MutableMap:**

```kotlin
val frutasEQuantidade = mutableMapOf("Maçã" to 5, "Banana" to 3, "Laranja" to 8)

val quantidadeMaçãs = frutasEQuantidade["Maçã"] // Obtém a quantidade de maçãs (5)
frutasEQuantidade["Banana"] = 4 // Modifica a quantidade de bananas para 4
frutasEQuantidade["Pêra"] = 2 // Adiciona uma nova fruta ao mapa
frutasEQuantidade.remove("Laranja") // Remove a entrada para laranja
```

**Iterando em um Map:**

Você pode iterar pelas chaves ou pelos pares chave-valor de um `Map` em Kotlin:

```kotlin
val capitais = mapOf("Brasil" to "Brasília", "EUA" to "Washington", "França" to "Paris")

// Iterando pelas chaves
for (pais in capitais.keys) {
    println("A capital do $pais é ${capitais[pais]}")
}

// Iterando pelos pares chave-valor
for ((pais, capital) in capitais) {
    println("A capital do $pais é $capital")
}
```

As collections `Set` e `Map` são muito úteis para armazenar e manipular dados de maneira eficiente em Kotlin. Use `Set` quando precisar de uma coleção de elementos únicos e `Map` quando precisar associar chaves a valores. As versões mutáveis (`MutableSet` e `MutableMap`) são úteis quando você precisa modificar a coleção após a inicialização.