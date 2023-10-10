# USANDO ENUM
Em Kotlin, um enumeração (enum) é uma classe especial que representa um conjunto fixo de valores constantes. Enums são frequentemente usados para representar valores que são mutuamente exclusivos ou categorias de valores. Vamos explorar como criar e usar enums em Kotlin:

**Criando um Enum:**

Para criar um enum, você usa a palavra-chave `enum` seguida pelo nome do enum e um bloco de chaves que contém os valores constantes (chamados de membros do enum). Aqui está um exemplo simples de enum que representa os dias da semana:

```kotlin
enum class DiaDaSemana {
    SEGUNDA,
    TERÇA,
    QUARTA,
    QUINTA,
    SEXTA,
    SÁBADO,
    DOMINGO
}
```

**Usando um Enum:**

Uma vez definido um enum, você pode usá-lo como um tipo de dado em seu código. Você pode atribuir valores do enum a variáveis, passá-los como argumentos de função e compará-los.

```kotlin
val dia = DiaDaSemana.QUARTA // Atribui o valor QUARTA a dia

fun saudacaoPorDia(dia: DiaDaSemana) {
    when (dia) {
        DiaDaSemana.SEGUNDA, DiaDaSemana.TERÇA, DiaDaSemana.QUARTA, DiaDaSemana.QUINTA, DiaDaSemana.SEXTA -> {
            println("Bom dia!")
        }
        DiaDaSemana.SÁBADO, DiaDaSemana.DOMINGO -> {
            println("Bom fim de semana!")
        }
    }
}

saudacaoPorDia(dia) // Chama a função com o valor QUARTA
```

**Propriedades e Funções em Enums:**

Você pode adicionar propriedades e funções a um enum. Cada membro do enum pode ter suas próprias implementações de propriedades e funções. Por exemplo:

```kotlin
enum class DiaDaSemana(val abreviacao: String) {
    SEGUNDA("Seg"),
    TERÇA("Ter"),
    QUARTA("Qua"),
    QUINTA("Qui"),
    SEXTA("Sex"),
    SÁBADO("Sáb"),
    DOMINGO("Dom");

    fun saudacao(): String {
        return "Bom dia na $abreviacao-feira!"
    }
}

val dia = DiaDaSemana.QUARTA
println(dia.saudacao()) // Imprime "Bom dia na Qua-feira!"
```

**Iterando em um Enum:**

Você pode iterar por todos os valores de um enum usando a propriedade `values()` e `valueOf()`. Por exemplo:

```kotlin
enum class DiaDaSemana {
    // ...

    companion object {
        fun listarDiasUteis(): List<DiaDaSemana> {
            return values().toList()
        }

        fun obterDiaPorNome(nome: String): DiaDaSemana? {
            return try {
                valueOf(nome.toUpperCase())
            } catch (e: IllegalArgumentException) {
                null
            }
        }
    }
}
```

Isso permite que você obtenha uma lista de todos os valores do enum e também procure um valor com base em uma string.

Enums são úteis quando você precisa representar um conjunto finito de valores constantes em seu código. Eles tornam seu código mais legível e seguro, pois garantem que os valores sejam restritos a um conjunto específico de opções.