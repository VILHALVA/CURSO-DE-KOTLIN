# HERANCA ENTRE CLASS
A herança é um conceito importante na Programação Orientada a Objetos (POO) que permite criar uma nova classe (subclasse) com base em uma classe já existente (superclasse). A subclasse herda propriedades e métodos da superclasse e também pode adicionar novas propriedades e métodos ou modificar os existentes. Em Kotlin, você pode usar a palavra-chave `:`, seguida do nome da superclasse, para criar uma relação de herança. Vamos explorar como funciona a herança entre classes em Kotlin.

**Definindo uma Superclasse (Classe Base):**

Para criar uma superclasse em Kotlin, você declara uma classe como faria normalmente. Aqui está um exemplo de uma superclasse chamada `Animal`:

```kotlin
open class Animal(val nome: String) {
    open fun fazerBarulho() {
        println("Animal fazendo barulho.")
    }
}
```

Neste exemplo, a classe `Animal` possui uma propriedade `nome` e um método `fazerBarulho()`. A palavra-chave `open` é usada para indicar que a classe é aberta para herança, permitindo que outras classes sejam derivadas dela.

**Definindo uma Subclasse:**

Para criar uma subclasse em Kotlin, você declara uma classe que estende a superclasse usando a palavra-chave `:`, seguida do nome da superclasse. Aqui está um exemplo de uma subclasse chamada `Cachorro` que estende a classe `Animal`:

```kotlin
class Cachorro(nome: String, val raca: String) : Animal(nome) {
    override fun fazerBarulho() {
        println("Cachorro fazendo latido.")
    }
}
```

Neste exemplo, a classe `Cachorro` estende a classe `Animal` e adiciona uma propriedade `raca`. Ela também substitui o método `fazerBarulho()` da superclasse com um comportamento específico de latido para o cachorro.

**Criando Objetos da Subclasse:**

Depois de definir a subclasse, você pode criar objetos da subclasse da mesma forma que faria com qualquer outra classe. No entanto, observe que você deve fornecer os argumentos necessários para a superclasse ao criar um objeto da subclasse.

```kotlin
val animal = Animal("Animal Genérico")
val cachorro = Cachorro("Fido", "Labrador")
```

**Chamando Métodos da Superclasse:**

Você pode chamar os métodos da superclasse em objetos da subclasse usando a notação de ponto. Se a subclasse não substitui o método, o método da superclasse é executado.

```kotlin
animal.fazerBarulho() // Imprime "Animal fazendo barulho."
cachorro.fazerBarulho() // Imprime "Cachorro fazendo latido."
```

**Herança Múltipla:**

Em Kotlin, você pode herdar de uma única superclasse (herança simples) devido a restrições de design da linguagem. No entanto, você pode implementar múltiplas interfaces, o que permite que uma classe tenha várias interfaces. Isso permite que você alcance funcionalidades semelhantes à herança múltipla.

**Conclusão:**

A herança é uma maneira poderosa de criar relacionamentos entre classes em Kotlin. Ela permite que você compartilhe funcionalidades comuns entre classes e estenda essas funcionalidades em subclasses específicas. É importante lembrar de usar a palavra-chave `open` nas classes ou métodos que você deseja que sejam herdados ou sobrescritos e a palavra-chave `override` nos métodos que você deseja substituir nas subclasses.