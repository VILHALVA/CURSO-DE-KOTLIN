# CONSTRUTOR PRIMARIO
O construtor primário é uma parte fundamental de uma classe em Kotlin. Ele é usado para inicializar as propriedades da classe quando você cria uma instância dessa classe. Em Kotlin, você pode definir o construtor primário diretamente na declaração da classe. Vamos entender como criar e usar o construtor primário em Kotlin.

**Definindo um Construtor Primário:**

Para definir um construtor primário, você coloca os parâmetros do construtor diretamente na declaração da classe, após o nome da classe. Você também pode especificar os tipos de dados dos parâmetros, se necessário.

Aqui está um exemplo simples de uma classe `Pessoa` com um construtor primário que aceita dois parâmetros:

```kotlin
class Pessoa(val nome: String, var idade: Int) {
    // Corpo da classe
}
```

Neste exemplo, o construtor primário da classe `Pessoa` possui dois parâmetros: `nome` (uma propriedade imutável) e `idade` (uma propriedade mutável).

**Criando Objetos com o Construtor Primário:**

Para criar um objeto a partir de uma classe com um construtor primário, você simplesmente fornece os argumentos necessários ao criar a instância do objeto. No caso da classe `Pessoa`, você deve fornecer um nome e uma idade ao criar um objeto `Pessoa`.

```kotlin
val pessoa1 = Pessoa("Alice", 30)
val pessoa2 = Pessoa("Bob", 25)
```

**Acessando Propriedades Inicializadas pelo Construtor:**

As propriedades definidas no construtor primário podem ser acessadas diretamente em objetos criados a partir da classe. Elas são inicializadas automaticamente quando o objeto é criado.

```kotlin
println(pessoa1.nome) // Imprime "Alice"
println(pessoa1.idade) // Imprime 30
```

**Construtores com Valores Padrão:**

Em Kotlin, você pode fornecer valores padrão para os parâmetros do construtor primário. Isso significa que você pode criar objetos sem a necessidade de fornecer todos os argumentos, usando os valores padrão para os parâmetros ausentes.

```kotlin
class Pessoa(val nome: String = "Usuário", var idade: Int = 0)
```

Aqui, se você criar um objeto `Pessoa` sem fornecer valores para `nome` e `idade`, eles assumirão os valores padrão.

```kotlin
val pessoa1 = Pessoa() // Nome será "Usuário" e idade será 0
val pessoa2 = Pessoa("Alice") // Nome será "Alice" e idade será 0
```

O construtor primário é uma parte essencial das classes em Kotlin, pois permite inicializar objetos com os valores desejados. Ao definir construtores primários com valores padrão, você torna suas classes mais flexíveis e facilita a criação de objetos com diferentes configurações.