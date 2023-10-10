# FUNCOES
As funções são blocos de código que executam uma tarefa específica ou cálculos em Kotlin. Elas são uma parte fundamental da programação em Kotlin e permitem que você divida seu código em partes reutilizáveis e organizadas. Neste artigo, vamos explorar como criar, chamar e trabalhar com funções em Kotlin.

**Declarando uma Função:**

Para declarar uma função em Kotlin, você usa a palavra-chave `fun`, seguida pelo nome da função, parâmetros (se houver), e o tipo de retorno (se aplicável). Aqui está a sintaxe básica de uma função:

```kotlin
fun nomeDaFuncao(parametro1: Tipo, parametro2: Tipo): TipoDeRetorno {
    // Código da função
    return valorDeRetorno
}
```

- `nomeDaFuncao`: O nome da função.
- `parametro1`, `parametro2`, etc.: Os parâmetros que a função aceita. Eles são opcionais, e você pode ter zero ou mais parâmetros.
- `Tipo`: O tipo de cada parâmetro.
- `TipoDeRetorno`: O tipo de dado que a função retorna. Se a função não retorna nada, você pode usar `Unit` ou omitir o tipo de retorno.

**Exemplo de Função Simples:**

Aqui está um exemplo simples de uma função que soma dois números inteiros e retorna o resultado:

```kotlin
fun somar(a: Int, b: Int): Int {
    val resultado = a + b
    return resultado
}
```

**Chamando uma Função:**

Para chamar uma função, você utiliza seu nome seguido pelos argumentos correspondentes entre parênteses. O resultado da função pode ser atribuído a uma variável ou utilizado em outras expressões.

```kotlin
val resultadoDaSoma = somar(5, 3)
println(resultadoDaSoma) // Isso imprimirá "8"
```

**Funções com Valor de Retorno Opcional:**

Se uma função não retornar nenhum valor, você pode declarar seu tipo de retorno como `Unit` ou omiti-lo. Em Kotlin, `Unit` é usado para indicar que a função não retorna nada, semelhante ao `void` em outras linguagens.

```kotlin
fun exibirMensagem(): Unit {
    println("Esta é uma função que não retorna valor.")
}
```

Você também pode omitir o tipo de retorno:

```kotlin
fun exibirMensagem() {
    println("Esta é uma função que não retorna valor.")
}
```

**Funções com Parâmetros Opcionais:**

Em Kotlin, você pode criar funções com parâmetros opcionais, fornecendo valores padrão para os parâmetros. Isso permite chamar a função com menos argumentos, usando os valores padrão para os parâmetros ausentes.

```kotlin
fun saudacao(nome: String = "Usuário") {
    println("Olá, $nome!")
}

saudacao() // Imprime "Olá, Usuário!"
saudacao("Alice") // Imprime "Olá, Alice!"
```

**Funções de Extensão:**

Kotlin suporta funções de extensão, que permitem adicionar funcionalidades a classes existentes sem precisar modificar o código-fonte da classe. Você pode criar funções de extensão para tipos existentes, como `String`, `List`, etc.

```kotlin
fun String.contarPalavras(): Int {
    return this.split(" ").size
}

val frase = "Isso é uma frase de exemplo."
val numeroDePalavras = frase.contarPalavras() // Retorna 6
```

As funções são uma parte fundamental da programação em Kotlin e desempenham um papel crucial na organização e na reutilização do código. Elas permitem que você divida tarefas complexas em partes menores e mais gerenciáveis, melhorando a legibilidade e a manutenção do seu código.