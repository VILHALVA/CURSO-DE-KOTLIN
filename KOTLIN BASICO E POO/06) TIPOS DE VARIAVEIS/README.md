# TIPOS DE VARIAVEIS
Em Kotlin, você pode declarar variáveis de diferentes tipos, cada uma com seu propósito e características específicas. Neste artigo, vamos abordar os principais tipos de variáveis em Kotlin, explicando suas características e fornecendo exemplos de uso.

Existem dois tipos principais de variáveis em Kotlin: variáveis mutáveis e variáveis imutáveis. Variáveis mutáveis podem ser alteradas após sua inicialização, enquanto variáveis imutáveis não podem ser modificadas após a atribuição de um valor.

**1. Variáveis Mutáveis:**

- **`var`**: Você pode usar a palavra-chave `var` para declarar variáveis mutáveis em Kotlin. Estas variáveis podem ser atualizadas com novos valores.

Exemplo:
```kotlin
var nome: String = "Alice"
nome = "Bob" // O valor pode ser alterado
```

**2. Variáveis Imutáveis:**

- **`val`**: Para criar variáveis imutáveis, use a palavra-chave `val`. Uma vez atribuído um valor, ele não pode ser alterado.

Exemplo:
```kotlin
val idade: Int = 30
// idade = 31 // Isso causará um erro, pois a variável é imutável
```

Agora, vamos explorar alguns dos tipos de dados mais comuns em Kotlin:

**3. Tipos Numéricos:**

Kotlin oferece vários tipos numéricos para representar números inteiros e números de ponto flutuante. Alguns exemplos são:

- `Int`: Representa números inteiros de 32 bits.
- `Long`: Representa números inteiros de 64 bits.
- `Float`: Representa números de ponto flutuante de precisão simples.
- `Double`: Representa números de ponto flutuante de precisão dupla.

Exemplo:
```kotlin
val numeroInteiro: Int = 42
val numeroFlutuante: Double = 3.14
```

**4. Texto e Caracteres:**

- `String`: Representa sequências de caracteres imutáveis.
- `Char`: Representa um único caractere Unicode.

Exemplo:
```kotlin
val nome: String = "Alice"
val primeiroCaractere: Char = 'A'
```

**5. Booleanos:**

- `Boolean`: Representa valores lógicos `true` ou `false`.

Exemplo:
```kotlin
val estaChovendo: Boolean = false
```

**6. Tipos Personalizados:**

Você também pode criar seus próprios tipos personalizados em Kotlin usando as classes. Por exemplo, você pode criar uma classe `Pessoa` para representar informações sobre pessoas.

Exemplo:
```kotlin
class Pessoa(val nome: String, val idade: Int)

val pessoa1 = Pessoa("Alice", 30)
val pessoa2 = Pessoa("Bob", 25)
```

Estes são alguns dos tipos de variáveis mais comuns em Kotlin. Lembre-se de escolher o tipo apropriado com base nos requisitos do seu programa, pois isso pode ajudar a melhorar a legibilidade e a eficiência do código. Kotlin também suporta inferência de tipo, o que significa que você muitas vezes não precisa especificar o tipo explicitamente, pois o compilador pode inferir automaticamente com base no valor atribuído.