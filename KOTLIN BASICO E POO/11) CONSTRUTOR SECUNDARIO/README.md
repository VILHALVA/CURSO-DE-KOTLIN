# CONSTRUTOR SECUNDARIO
Os construtores secundários são usados em Kotlin para fornecer formas alternativas de inicializar objetos de uma classe. Diferentemente do construtor primário, que é definido na declaração da classe, os construtores secundários são definidos dentro da classe usando a palavra-chave `constructor`. Os construtores secundários permitem que você crie objetos da classe de maneiras diferentes, fornecendo diferentes conjuntos de argumentos. Vamos explorar como criar e usar construtores secundários em Kotlin.

**Definindo um Construtor Secundário:**

Para definir um construtor secundário em Kotlin, você usa a palavra-chave `constructor`, seguida dos parâmetros do construtor. Aqui está um exemplo simples de uma classe `Pessoa` com um construtor primário e um construtor secundário:

```kotlin
class Pessoa(val nome: String, var idade: Int) {
    // Construtor secundário
    constructor(nome: String) : this(nome, 0)
}
```

Neste exemplo, a classe `Pessoa` possui um construtor primário que aceita um nome e uma idade. Além disso, há um construtor secundário que aceita apenas um nome e chama o construtor primário com o nome fornecido e uma idade padrão de 0.

**Criando Objetos com Construtores Secundários:**

Para criar um objeto usando um construtor secundário, você simplesmente chama o construtor secundário quando cria uma instância da classe. No exemplo acima, você pode criar um objeto `Pessoa` com um nome e uma idade padrão assim:

```kotlin
val pessoa1 = Pessoa("Alice", 30) // Construtor primário
val pessoa2 = Pessoa("Bob") // Construtor secundário
```

O segundo objeto `pessoa2` foi criado usando o construtor secundário, que só aceita um nome, enquanto o primeiro objeto `pessoa1` foi criado usando o construtor primário.

**Construtores Secundários Múltiplos:**

Você pode definir vários construtores secundários na mesma classe, cada um com sua própria lista de parâmetros. Isso permite que você crie objetos de diferentes maneiras, dependendo dos argumentos fornecidos.

```kotlin
class Pessoa(val nome: String, var idade: Int) {
    // Construtor secundário com nome e idade padrão
    constructor() : this("Usuário", 0)

    // Construtor secundário com nome padrão e idade fornecida
    constructor(idade: Int) : this("Usuário", idade)
}
```

Neste exemplo, a classe `Pessoa` possui três construtores secundários diferentes que permitem criar objetos com diferentes combinações de argumentos.

**Chamando o Construtor Primário a partir de um Construtor Secundário:**

Dentro de um construtor secundário, você deve chamar o construtor primário usando a sintaxe `this(...)` antes de executar qualquer outra lógica. Isso garante que as propriedades da classe sejam inicializadas corretamente.

Os construtores secundários podem ser uma ferramenta poderosa para tornar sua classe mais flexível e permitir a criação de objetos de várias maneiras. Eles são úteis quando você precisa de diferentes maneiras de inicializar objetos da mesma classe, sem a necessidade de criar várias classes diferentes.