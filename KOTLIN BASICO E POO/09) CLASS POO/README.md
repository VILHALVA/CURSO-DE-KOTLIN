# CLASS POO
Programação Orientada a Objetos (POO) é um paradigma de programação amplamente utilizado em que os programas são estruturados em torno de objetos. Em Kotlin, como em muitas outras linguagens de programação, você pode criar classes para modelar objetos do mundo real e usar essas classes para criar instâncias de objetos. Neste artigo, vamos explorar a criação de classes em Kotlin, seus membros e como usar essas classes para criar objetos.

**Criando uma Classe:**

Para criar uma classe em Kotlin, você usa a palavra-chave `class`, seguida pelo nome da classe. Aqui está um exemplo simples de uma classe `Pessoa`:

```kotlin
class Pessoa {
    // Propriedades e métodos da classe
}
```

**Propriedades de Classe:**

As propriedades de classe representam os atributos ou características dos objetos que você está modelando. Você pode declarar propriedades usando a palavra-chave `val` (para propriedades imutáveis) ou `var` (para propriedades mutáveis).

```kotlin
class Pessoa {
    val nome: String = "Alice"
    var idade: Int = 30
}
```

**Métodos de Classe:**

Os métodos de classe representam o comportamento dos objetos. Você pode declarar métodos dentro de uma classe para realizar operações específicas.

```kotlin
class Pessoa {
    val nome: String = "Alice"
    var idade: Int = 30

    fun cumprimentar() {
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}
```

**Construtor Primário:**

Um construtor primário é uma parte importante de uma classe, pois permite que você inicialize propriedades quando cria um objeto. Você pode definir um construtor primário diretamente na declaração da classe.

```kotlin
class Pessoa(val nome: String, var idade: Int) {
    fun cumprimentar() {
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}
```

**Criando Objetos:**

Para criar um objeto a partir de uma classe em Kotlin, você utiliza a palavra-chave `val` ou `var`, seguida pelo nome da variável que receberá o objeto e o operador `=` seguido pela chamada ao construtor.

```kotlin
val pessoa1 = Pessoa("Alice", 30)
val pessoa2 = Pessoa("Bob", 25)
```

**Acessando Propriedades e Métodos:**

Uma vez criados os objetos, você pode acessar suas propriedades e métodos usando a notação de ponto.

```kotlin
println(pessoa1.nome) // Imprime "Alice"
println(pessoa1.idade) // Imprime 30
pessoa1.cumprimentar() // Imprime "Olá, meu nome é Alice e tenho 30 anos."
```

**Herança:**

Kotlin suporta herança, permitindo que você crie uma classe derivada (subclasse) com base em uma classe existente (superclasse). Isso é feito usando a palavra-chave `open` na classe base e a palavra-chave `override` na subclasse.

```kotlin
open class Animal {
    open fun fazerBarulho() {
        println("Animal fazendo barulho.")
    }
}

class Cachorro : Animal() {
    override fun fazerBarulho() {
        println("Cachorro latindo.")
    }
}
```

**Polimorfismo:**

O polimorfismo permite que você chame métodos de uma classe base em objetos de classes derivadas, e o comportamento é determinado pela classe real do objeto em tempo de execução.

```kotlin
val animal: Animal = Cachorro()
animal.fazerBarulho() // Imprime "Cachorro latindo."
```

Essas são noções básicas sobre como criar e usar classes em Kotlin para implementar o paradigma de Programação Orientada a Objetos. Classes e objetos são fundamentais para estruturar e organizar o código em projetos de software maiores, tornando-o mais modular e reutilizável.