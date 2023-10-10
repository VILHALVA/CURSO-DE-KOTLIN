# NULL SAFETY
A null safety, ou segurança de nulos, é uma característica importante de Kotlin projetada para ajudar a evitar erros comuns relacionados a valores nulos (null) em seu código. Em muitas linguagens de programação, o uso de valores nulos pode levar a exceções e bugs difíceis de rastrear. Kotlin aborda esse problema de maneira eficaz. Aqui estão os principais conceitos relacionados à null safety em Kotlin:

**1. Tipos Anuláveis (Nullable Types):**

Em Kotlin, você precisa especificar explicitamente quando uma variável pode ou não ser nula. Para isso, utiliza-se o operador `?` após o tipo de dado da variável. Isso indica que a variável pode armazenar um valor ou ser nula.

```kotlin
var nome: String? = null // Variável "nome" pode ser nula
var idade: Int = 25 // Variável "idade" não pode ser nula
```

**2. Operador de Acesso Seguro (Safe Call Operator):**

Para acessar propriedades ou métodos de uma variável anulável, você utiliza o operador `?.`. Isso permite que você evite exceções de `NullPointerException` se a variável for nula.

```kotlin
val tamanho: Int? = nome?.length // Retorna o tamanho da string se "nome" não for nulo, ou nulo se for
```

**3. Operador Elvis (Elvis Operator):**

O operador Elvis `?:` permite fornecer um valor padrão para ser usado se uma variável anulável for nula.

```kotlin
val tamanho: Int = nome?.length ?: 0 // Retorna o tamanho da string se "nome" não for nulo, ou 0 se for
```

**4. Lançamento Seguro (Safe Cast):**

Você pode realizar conversões seguras entre tipos anuláveis e não anuláveis usando o operador `as?`. Isso verifica se a conversão é possível e retorna nulo se não for.

```kotlin
val numero: Int? = texto as? Int // Retorna um Int se "texto" puder ser convertido, ou nulo se não puder
```

**5. Lançamento Não Seguro (Unsafe Cast):**

Se você tem certeza de que uma variável anulável não é nula e pode ser convertida para um tipo não anulável, pode usar o operador `as`. No entanto, isso pode causar uma exceção se a variável for nula.

```kotlin
val numero: Int = texto as Int // Lança uma exceção se "texto" for nulo ou não for um Int
```

**6. Verificação de Nulo (Null Check):**

Você pode usar a verificação de nulo (`if` ou `when`) para testar se uma variável é nula antes de usá-la.

```kotlin
if (nome != null) {
    val tamanho: Int = nome.length
} else {
    // Tratar o caso em que "nome" é nulo
}
```

**7. Lançamento de Exceção de Nulo (NullPointerException):**

Kotlin ainda permite que ocorram exceções de `NullPointerException`, mas apenas quando você explicitamente declara uma variável como não anulável e tenta acessá-la como nula sem verificação de nulo.

A null safety é uma característica fundamental de Kotlin que ajuda a tornar o código mais seguro e robusto, reduzindo a probabilidade de erros relacionados a valores nulos. É uma parte importante da filosofia de Kotlin de tornar a programação mais segura e menos propensa a erros.