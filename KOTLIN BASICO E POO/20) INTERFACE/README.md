# INTERFACE
Em Kotlin, uma interface é uma estrutura que define um contrato para as classes que a implementam. Ela define um conjunto de métodos e propriedades que as classes concretas devem fornecer. Interfaces são usadas para definir um comportamento comum que várias classes podem compartilhar, independentemente da hierarquia de herança. Abaixo, vou explicar como criar e usar interfaces em Kotlin:

**Definindo uma Interface:**

Para criar uma interface em Kotlin, você usa a palavra-chave `interface`, seguida pelo nome da interface e o corpo da interface, que contém a definição dos métodos e propriedades que as classes que a implementam devem fornecer. Aqui está um exemplo simples:

```kotlin
interface Animal {
    fun fazerBarulho()
    fun comer()
}
```

Neste exemplo, a interface `Animal` define dois métodos: `fazerBarulho()` e `comer()`. Qualquer classe que implementar essa interface deve fornecer implementações para esses métodos.

**Implementando uma Interface:**

Para que uma classe implemente uma interface, você usa a palavra-chave `implements`. Aqui está um exemplo de uma classe `Cachorro` que implementa a interface `Animal`:

```kotlin
class Cachorro : Animal {
    override fun fazerBarulho() {
        println("Cachorro fazendo latido.")
    }

    override fun comer() {
        println("Cachorro comendo ração.")
    }
}
```

A classe `Cachorro` deve fornecer implementações para todos os métodos da interface `Animal`. No exemplo acima, ela fornece implementações para `fazerBarulho()` e `comer()`.

**Usando Interfaces:**

Quando uma classe implementa uma interface, ela herda os métodos e propriedades definidos na interface e deve fornecer suas próprias implementações para esses membros. Você pode criar objetos da classe implementadora e chamar os métodos definidos na interface:

```kotlin
val cachorro = Cachorro()
cachorro.fazerBarulho() // Chama o método fazerBarulho() da classe Cachorro
cachorro.comer() // Chama o método comer() da classe Cachorro
```

Interfaces também podem ser usadas para declarar variáveis e parâmetros de métodos, permitindo que você trabalhe com objetos de classes que implementam a interface de maneira genérica.

```kotlin
fun cuidarDoAnimal(animal: Animal) {
    animal.fazerBarulho()
    animal.comer()
}
```

Isso permite que você passe qualquer objeto que implemente a interface `Animal` como argumento para a função `cuidarDoAnimal()`.

Interfaces são uma parte fundamental da programação orientada a objetos e da hierarquia de tipos em Kotlin. Elas permitem a criação de código mais flexível e genérico, permitindo que diferentes classes forneçam implementações específicas para um conjunto comum de métodos e propriedades.