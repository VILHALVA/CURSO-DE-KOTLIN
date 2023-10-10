# USANDO O WHEN
O `when` é uma estrutura de controle de fluxo em Kotlin que permite você avaliar uma expressão e executar código com base no valor dessa expressão, de forma semelhante a um switch-case em outras linguagens de programação. Aqui estão algumas formas de utilizar o `when` em Kotlin:

**Forma Básica:**

Aqui está um exemplo simples de uso do `when` para verificar o valor de uma variável e executar código com base nesse valor:

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

Neste exemplo, o código imprime o nome do dia da semana correspondente ao valor da variável `diaDaSemana`. Se o valor não corresponder a nenhum dos casos, o bloco `else` será executado.

**Uso de Expressões:**

O `when` também pode ser usado como uma expressão, o que significa que ele pode retornar um valor com base na expressão avaliada:

```kotlin
val diaDaSemana = 3
val mensagem = when (diaDaSemana) {
    1 -> "Segunda-feira"
    2 -> "Terça-feira"
    3 -> "Quarta-feira"
    4 -> "Quinta-feira"
    5 -> "Sexta-feira"
    else -> "Fim de semana"
}

println("Hoje é $mensagem.")
```

Neste exemplo, o `when` avalia a variável `diaDaSemana` e atribui a string correspondente à variável `mensagem`, que é posteriormente impressa.

**Verificação de Intervalos:**

Você pode usar o `when` para verificar intervalos de valores:

```kotlin
val nota = 85
val conceito = when {
    nota >= 90 -> "A"
    nota >= 80 -> "B"
    nota >= 70 -> "C"
    else -> "D"
}

println("Conceito: $conceito")
```

Neste exemplo, o `when` verifica em qual intervalo a variável `nota` se encaixa e atribui o conceito correspondente com base nesse intervalo.

**Verificação de Tipos:**

O `when` também pode ser usado para verificar tipos de objetos:

```kotlin
fun avaliar(valor: Any): String {
    return when (valor) {
        is String -> "É uma String"
        is Int -> "É um Inteiro"
        is Double -> "É um Double"
        else -> "Tipo desconhecido"
    }
}

val resultado = avaliar("Hello")
println(resultado)
```

Neste exemplo, a função `avaliar` verifica o tipo do parâmetro `valor` e retorna uma mensagem correspondente.

O `when` é uma ferramenta poderosa para criar lógica condicional em Kotlin, permitindo que você avalie expressões e execute código com base em diferentes casos. Ele oferece flexibilidade e legibilidade ao seu código, tornando-o uma escolha útil para tomar decisões com base em múltiplas opções.