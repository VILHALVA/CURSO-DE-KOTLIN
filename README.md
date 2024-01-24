# CURSO DE KOTLIN
👨‍⚖️KOTLIN É UMA LINGUAGEM DE PROGRAMAÇÃO.

[![GitHub Repo stars](https://img.shields.io/badge/VILHALVA-GITHUB-03A9F4?logo=github)](https://github.com/VILHALVA) 
[![GitHub Repo stars](https://img.shields.io/badge/VEJA-DOCUMENTAÇÃO-03A9F4?logo=google)](https://kotlinlang.org/docs/home.html)
[![GitHub Repo stars](https://img.shields.io/badge/-PLAYLIST%20DO%20YOUTUBE-blueviolet)](https://www.youtube.com/playlist?list=PLmcyA-BbqsvJnOZoGNHPMF1dCBq0m6Qzg)

# 👀VISÃO PANORÂMICA:
| PERGUNTA | RESPOSTA |
| :---: | :---: |
| DATA DE CRIAÇÃO | 2009 |
| NOME DO CRIADOR | Equipe de desenvolvedores da JetBrains, liderada por Dmitry Jemerov e Andrey Breslav. | 
| SIGNIFICADO DO NOME | O nome "Kotlin" foi inspirado na ilha russa de Kotlin, próxima à cidade de São Petersburgo, onde a JetBrains tem sua sede. O nome foi escolhido para refletir a localização geográfica da equipe de desenvolvimento do Kotlin. |
| É BASEADA NO | JAVA |
| EXTENÇÃO DO ARQUIVO | .kt |
| É MAIS USADA | Criação de Apps para Android |

* O Kotlin foi criado por uma equipe de desenvolvedores da JetBrains, liderada por Dmitry Jemerov e Andrey Breslav. A linguagem foi anunciada publicamente em 2011, mas seu desenvolvimento começou alguns anos antes, em 2009.
* O nome "Kotlin" foi inspirado na ilha russa de Kotlin, próxima à cidade de São Petersburgo, onde a JetBrains tem sua sede. O nome foi escolhido para refletir a localização geográfica da equipe de desenvolvimento do Kotlin.
* O Kotlin é uma linguagem de programação moderna e concisa que foi projetada para interoperar perfeitamente com o Java. Ela foi desenvolvida com o objetivo de melhorar a produtividade dos desenvolvedores e oferecer uma alternativa mais segura, expressiva e eficiente ao Java.
* O Kotlin é mais usado no desenvolvimento de aplicativos Android. Em 2017, o Google anunciou o suporte oficial ao Kotlin como uma linguagem de programação para o desenvolvimento de aplicativos Android, o que impulsionou ainda mais sua popularidade nesse campo. Desde então, muitos desenvolvedores têm adotado o Kotlin como a linguagem preferida para criar aplicativos Android devido à sua sintaxe limpa, recursos modernos e interoperabilidade com o Java.
* Além do desenvolvimento Android, o Kotlin também pode ser usado no desenvolvimento de aplicativos de servidor, desenvolvimento web com frameworks como o Spring Boot, criação de ferramentas de linha de comando e até mesmo no desenvolvimento de aplicações desktop com bibliotecas como o TornadoFX.
* Em resumo, o Kotlin é uma linguagem de programação moderna, segura e concisa, criada pela JetBrains. Ela é amplamente utilizada no desenvolvimento de aplicativos Android, mas também pode ser empregada em outros contextos de desenvolvimento de software.

# 🤳SINTAXE DA LINGUAGEM:
## 0) FUNDAMENTOS:
Aqui está um exemplo de código em Kotlin que utiliza os operadores aritméticos, relacionais e lógicos com tipos primitivos:
```kotlin
fun main() {
    val a: Int = 10
    val b: Int = 5

    // Operadores aritméticos
    val soma = a + b
    val subtracao = a - b
    val multiplicacao = a * b
    val divisao = a / b
    val resto = a % b

    // Operadores relacionais
    val maior = a > b
    val menor = a < b
    val igual = a == b
    val diferente = a != b
    val maiorOuIgual = a >= b
    val menorOuIgual = a <= b

    // Operadores lógicos
    val and = maior && menor
    val or = maior || menor
    val not = !maior

    // Imprimindo os resultados
    println("Operadores Aritméticos:")
    println("Soma: $soma")
    println("Subtração: $subtracao")
    println("Multiplicação: $multiplicacao")
    println("Divisão: $divisao")
    println("Resto: $resto")

    println("\nOperadores Relacionais:")
    println("Maior: $maior")
    println("Menor: $menor")
    println("Igual: $igual")
    println("Diferente: $diferente")
    println("Maior ou Igual: $maiorOuIgual")
    println("Menor ou Igual: $menorOuIgual")

    println("\nOperadores Lógicos:")
    println("AND: $and")
    println("OR: $or")
    println("NOT: $not")
}
```
Neste exemplo, utilizamos duas variáveis `a` e `b` do tipo `Int`. Os operadores aritméticos realizam as operações básicas de soma, subtração, multiplicação, divisão e resto da divisão. Os operadores relacionais comparam os valores das variáveis, retornando um valor booleano. E os operadores lógicos realizam operações de conjunção (`&&`), disjunção (`||`) e negação (`!`).

Ao executar o código, ele irá imprimir os resultados de cada operação na saída.

## 1) VARIAVEIS SIMPLES:
Em Kotlin, as variáveis simples são declaradas usando a palavra-chave "var" para variáveis mutáveis (que podem ter seu valor alterado) ou "val" para variáveis imutáveis (que têm um valor atribuído e não podem ser alteradas posteriormente). Aqui está um exemplo de declaração de variáveis simples em Kotlin:
````kotlin
fun main() {
    // Variável mutável
    var idade: Int = 25
    idade = 30
    println("Idade: $idade")
    
    // Variável imutável
    val nome: String = "João"
    println("Nome: $nome")
}
````
Nesse exemplo, declaramos uma variável mutável chamada "idade" do tipo "Int" e atribuímos a ela o valor inicial de 25. Em seguida, alteramos seu valor para 30. No caso de variáveis mutáveis, podemos reatribuir um novo valor a elas conforme necessário. Também declaramos uma variável imutável chamada "nome" do tipo "String" e atribuímos a ela o valor "João". As variáveis imutáveis não podem ter seu valor alterado depois de atribuído, o que torna seu valor constante. Note que em Kotlin, o tipo das variáveis pode ser inferido automaticamente pelo compilador com base no valor atribuído. No exemplo acima, fornecemos a anotação de tipo explicitamente para fins de clareza, mas poderíamos omiti-la e deixar o compilador inferir o tipo da variável. As variáveis em Kotlin também suportam o recurso de interpolação de string, que permite incorporar valores de variáveis diretamente em uma string usando o caractere "$". Isso é demonstrado no exemplo acima, onde imprimimos os valores das variáveis "idade" e "nome" na saída.

Em Kotlin, para realizar a entrada de dados pelo usuário, podemos utilizar a função `readLine()`. Essa função lê uma linha de texto digitada pelo usuário e retorna uma string. Para converter essa string em um tipo específico, como um número inteiro ou decimal, podemos utilizar as funções de conversão disponíveis.

Aqui está um exemplo de como realizar a entrada de dados em Kotlin:
```kotlin
fun main() {
    // Entrada de um número inteiro
    print("Digite um número inteiro: ")
    val numeroInteiro = readLine()?.toIntOrNull()
    if (numeroInteiro != null) {
        println("Você digitou o número inteiro: $numeroInteiro")
    } 
    else {
        println("Entrada inválida. Certifique-se de digitar um número inteiro.")
    }

    // Entrada de um número decimal
    print("Digite um número decimal: ")
    val numeroDecimal = readLine()?.toDoubleOrNull()
    if (numeroDecimal != null) {
        println("Você digitou o número decimal: $numeroDecimal")
    } 
    else {
        println("Entrada inválida. Certifique-se de digitar um número decimal.")
    }

    // Entrada de uma string
    print("Digite seu nome: ")
    val nome = readLine()
    println("Olá, $nome!")

    // Entrada de um caractere
    print("Digite um caractere: ")
    val caractere = readLine()?.getOrNull(0)
    if (caractere != null) {
        println("Você digitou o caractere: $caractere")
    } 
    else {
        println("Entrada inválida. Certifique-se de digitar um caractere.")
    }
}
````
Neste exemplo, utilizamos a função `readLine()` para realizar a leitura da entrada do usuário. Em seguida, utilizamos as funções de conversão `toIntOrNull()`, `toDoubleOrNull()` e `getOrNull()` para converter a string de entrada para os tipos desejados.

É importante notar que a função `readLine()` retorna um objeto do tipo `String?`, que pode ser nulo (`null`) se o usuário pressionar Enter sem digitar nada. Portanto, é necessário fazer verificações para lidar com entradas inválidas ou nulas.

Ao executar o código, ele irá solicitar ao usuário que digite os valores desejados e em seguida imprimirá os valores lidos na saída.

## 2) ESTRUTURA CONDICIONAL: 
### ESTRUTURA IF-ELSE:
A estrutura "if-else" é usada para executar um bloco de código condicionalmente, com base em uma condição booleana.
````kotlin
fun main() {
    val idade = 18
    if (idade >= 18) {
        println("Você é maior de idade.")
    } 
    else {
        println("Você é menor de idade.")
    }
}
````
Neste exemplo, verificamos se a variável "idade" é maior ou igual a 18. Se for verdadeiro, a mensagem "Você é maior de idade" será exibida. Caso contrário, a mensagem "Você é menor de idade" será exibida.

### ESTRUTURA WHEN:
A estrutura "when" é uma alternativa ao "switch" em outras linguagens de programação. Ela permite realizar várias verificações em uma expressão.
````kotlin
fun main() {
    val diaSemana = 3
    when (diaSemana) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Dia inválido")
    }
}
````
Neste exemplo, com base no valor da variável "diaSemana", o bloco correspondente será executado. Se o valor for 1, será impresso "Domingo", se for 2, será impresso "Segunda-feira" e assim por diante. Se o valor não corresponder a nenhuma das opções, o bloco "else" será executado e imprimirá "Dia inválido". Além disso, as estruturas condicionais em Kotlin também podem ser aninhadas, permitindo uma lógica condicional mais complexa, se necessário.

## 3) ESTRUTURA DE REPETIÇÃO:
### ESTRUTURA FOR:
A estrutura "for" é usada para iterar sobre uma sequência de elementos, como um intervalo numérico ou uma coleção.
````kotlin
fun main() {
    for (i in 1..5) {
        println("Número: $i")
    }
}
````
Neste exemplo, o loop "for" itera sobre um intervalo de números de 1 a 5. A cada iteração, o valor de "i" é atualizado e impresso na saída.

### ESTRUTURA WHILE:
A estrutura "while" é usada quando você deseja repetir um bloco de código enquanto uma condição booleana for verdadeira.
````kotlin
fun main() {
    var contador = 0
    while (contador < 5) {
        println("Contador: $contador")
        contador++
    }
}
````
Neste exemplo, o loop "while" repete o bloco de código enquanto a variável "contador" for menor que 5. A cada iteração, o valor de "contador" é impresso e incrementado.

### ESTRUTURA DO-WHILE:
A estrutura "do-while" é semelhante à estrutura "while", mas garante que o bloco de código seja executado pelo menos uma vez, mesmo que a condição seja falsa.
````kotlin
fun main() {
    var contador = 0
    do {
        println("Contador: $contador")
        contador++
    } 
    while (contador < 5)
}
````
Neste exemplo, o loop "do-while" executa o bloco de código pelo menos uma vez, independentemente da condição. Em seguida, verifica a condição e continua repetindo o bloco até que a condição seja falsa. É importante garantir que a condição em uma estrutura de repetição eventualmente se torne falsa para evitar loops infinitos. Além disso, você pode usar as palavras-chave "break" e "continue" para controlar o fluxo de execução dentro dos loops, permitindo que você saia antecipadamente ou pule para a próxima iteração, respectivamente.

## 4) VARIAVEIS COMPOSTAS:
### ARRAYS:
Os arrays em Kotlin são estruturas de dados que armazenam um conjunto fixo de elementos do mesmo tipo. Eles são usados para armazenar e acessar elementos de forma indexada.
````kotlin
fun main() {
    // Declaração de um array de números inteiros
    val numeros = arrayOf(1, 2, 3, 4, 5)

    // Acessando elementos do array
    println("Elemento na posição 2: ${numeros[1]}")
    println("Tamanho do array: ${numeros.size}")

    // Modificando um elemento do array
    numeros[3] = 10

    // Iterando sobre os elementos do array
    for (numero in numeros) {
        println(numero)
    }
}
````
Nesse exemplo, declaramos um array chamado "numeros" que contém os números de 1 a 5. Podemos acessar os elementos do array usando o operador de indexação [], onde 0 é a primeira posição. Também é possível modificar o valor de um elemento do array atribuindo um novo valor a ele. Além disso, podemos iterar sobre os elementos do array usando um loop for-in.

### LISTAS:
As listas em Kotlin são semelhantes aos arrays, mas têm tamanho flexível e oferecem mais recursos de manipulação de elementos. Elas são implementadas pela classe List e podem armazenar elementos de tipos diferentes.
````kotlin
fun main() {
    // Declaração de uma lista de strings
    val frutas = listOf("Maçã", "Banana", "Laranja")

    // Acessando elementos da lista
    println("Elemento na posição 1: ${frutas[0]}")
    println("Tamanho da lista: ${frutas.size}")

    // Iterando sobre os elementos da lista
    for (fruta in frutas) {
        println(fruta)
    }
}
````
Nesse exemplo, declaramos uma lista chamada "frutas" que contém três elementos de tipo String. Podemos acessar os elementos da lista da mesma forma que em um array e também usar um loop for-in para iterar sobre eles. No entanto, como as listas têm tamanho flexível, não podemos modificar os elementos após a criação da lista.

### MAPAS (DICIONARIOS):
Os mapas em Kotlin são coleções de pares de chave-valor, onde cada chave é única e associada a um valor. Eles são implementados pela classe Map.
````kotlin
fun main() {
    // Declaração de um mapa de capitais
    val capitais = mapOf("Brasil" to "Brasília", "EUA" to "Washington D.C.", "França" to "Paris")

    // Acessando valores usando as chaves
    println("Capital do Brasil: ${capitais["Brasil"]}")
    println("Tamanho do mapa: ${capitais.size}")

    // Iterando sobre os pares chave-valor do mapa
    for ((pais, capital) in capitais) {
        println("$pais: $capital")
    }
}
````
Nesse exemplo, declaramos um mapa chamado "capitais" que mapeia nomes de países a suas respectivas capitais. Podemos acessar os valores do mapa usando as chaves correspondentes e também obter o tamanho do mapa. Além disso, podemos iterar sobre os pares chave-valor usando um loop for-in, onde cada par é desestruturado em variáveis separadas.

## 5) FUNÇÕES:
Em Kotlin, as funções são blocos de código que podem ser chamados e executados em determinados pontos do programa. Elas são definidas usando a palavra-chave fun. Vou mostrar um exemplo básico de uma função em Kotlin:
````kotlin
fun main() {
    // Chamando a função saudacao()
    saudacao()
}

// Definindo a função saudacao()
fun saudacao() {
    println("Olá, mundo!")
}
````
Neste exemplo, temos uma função chamada saudacao() que imprime a mensagem "Olá, mundo!". No main(), chamamos essa função para que seja executada. Ao executar o programa, a saída será "Olá, mundo!". As funções em Kotlin também podem receber argumentos e retornar valores. Vamos ver um exemplo mais completo:
````kotlin
fun main() {
    val resultado = somar(3, 5)
    println("Resultado da soma: $resultado")
}

fun somar(a: Int, b: Int): Int {
    return a + b
}
````
Neste exemplo, temos uma função somar() que recebe dois argumentos do tipo Int e retorna a soma desses valores como um Int. No main(), chamamos essa função passando os valores 3 e 5, e o resultado é atribuído à variável resultado. Em seguida, imprimimos o resultado na saída. É possível definir funções com parâmetros opcionais, permitindo que você chame a função com ou sem fornecer valores para esses parâmetros. Além disso, Kotlin suporta funções de extensão, que permitem adicionar novos comportamentos a classes existentes sem modificá-las. Existem muitos outros recursos e conceitos relacionados a funções em Kotlin, como funções de ordem superior, lambdas e recursividade. Esses recursos fornecem flexibilidade e poder ao desenvolver aplicativos Kotlin.

## 6) CLASS POO:
Class com todos os 4 pilares da programação orientada a objetos: encapsulamento, herança, polimorfismo e abstração:
````kotlin
// Classe base
open class Animal(val nome: String) {
    open fun fazerBarulho() {
        println("O animal faz algum barulho.")
    }
}

// Classe derivada que herda de Animal
class Cachorro(nome: String) : Animal(nome) {
    override fun fazerBarulho() {
        println("O cachorro faz au au!")
    }
}

// Classe derivada que herda de Animal
class Gato(nome: String) : Animal(nome) {
    override fun fazerBarulho() {
        println("O gato faz miau!")
    }
}

fun main() {
    val animal: Animal = Cachorro("Rex")
    animal.fazerBarulho()

    val animal2: Animal = Gato("Felix")
    animal2.fazerBarulho()
}
````
Neste exemplo, temos a classe base Animal que possui uma propriedade nome e um método fazerBarulho() que imprime uma mensagem genérica. As classes Cachorro e Gato são derivadas da classe Animal e substituem o método fazerBarulho() com implementações específicas para cada animal. No método main(), criamos uma instância de Cachorro e chamamos o método fazerBarulho(). Em seguida, criamos uma instância de Gato e também chamamos o método fazerBarulho(). O polimorfismo é evidente aqui, pois podemos tratar ambos os objetos como instâncias de Animal e chamar o método fazerBarulho(), mas cada um deles executa seu próprio comportamento específico. Esse exemplo demonstra o uso de herança, encapsulamento (por meio da propriedade nome), polimorfismo e abstração (ao definir a classe Animal como aberta e o método fazerBarulho() como abstrato). Esses pilares da programação orientada a objetos ajudam a criar um código mais modular, reutilizável e flexível.

# 💖CARACTERISTICAS DA LINGUAGEM:
## ❤POSITIVAS:
* **1 - Concisa e legível:** O Kotlin possui uma sintaxe concisa e expressiva, o que torna o código mais fácil de ler e escrever. Ele remove a necessidade de escrever código boilerplate, reduzindo a quantidade de código necessário para realizar uma tarefa.
* **2 - Compatibilidade com Java:** O Kotlin é 100% interoperável com Java, o que significa que você pode usar bibliotecas e frameworks Java existentes em seus projetos Kotlin. Isso facilita a migração de projetos Java para Kotlin e permite que você aproveite a vasta biblioteca Java disponível.
* **3 - Segurança nula:** O Kotlin possui um sistema de tipo seguro que ajuda a evitar erros de referência nula comuns em Java. O sistema de tipos do Kotlin permite que você especifique se uma variável pode ou não ser nula, reduzindo assim as exceções NullPointerException durante a execução do programa.
* **4 - Suporte a programação orientada a objetos:** O Kotlin oferece suporte completo a conceitos de programação orientada a objetos, como herança, polimorfismo, encapsulamento e abstração. Ele também introduz recursos adicionais, como classes data e classes sealed, que tornam o desenvolvimento orientado a objetos mais eficiente.
* **5 - Suporte a programação funcional:** O Kotlin suporta programação funcional, permitindo o uso de funções de alta ordem, lambdas e expressões lambda. Isso permite escrever código mais conciso e expressivo, especialmente ao trabalhar com coleções e realizar operações de transformação de dados.
* **6 - Ferramentas modernas:** O Kotlin é acompanhado de um conjunto de ferramentas modernas que facilitam o desenvolvimento, como o IntelliJ IDEA, um dos melhores ambientes de desenvolvimento integrado (IDE) disponíveis. O Kotlin também possui uma boa integração com outras ferramentas e frameworks populares, como o Android Studio e o Spring Framework.
* **7 - Coroutines:** O Kotlin oferece suporte nativo a coroutines, que são uma abstração poderosa para lidar com concorrência e tarefas assíncronas. As coroutines simplificam a escrita de código assíncrono, tornando-o mais fácil de entender e manter, sem a necessidade de callbacks ou gerenciamento manual de threads.

## 🖤NEGATIVAS:
* **1 - Curva de aprendizado:** Embora a sintaxe do Kotlin seja geralmente considerada mais concisa e legível do que a do Java, pode haver uma curva de aprendizado inicial para os desenvolvedores que estão migrando do Java para o Kotlin. Alguns conceitos e recursos do Kotlin podem exigir um tempo de adaptação e familiarização.
* **2 - Compilação mais lenta:** Em comparação com o Java, o processo de compilação do Kotlin pode ser mais lento. Isso ocorre porque o Kotlin usa uma análise mais sofisticada e realiza várias etapas de inferência de tipos. Embora a diferença de velocidade possa não ser significativa para projetos menores, pode ser perceptível em projetos maiores e mais complexos.
* **3 - Tamanho do arquivo de bytecode:** O Kotlin pode gerar arquivos de bytecode um pouco maiores em comparação com o Java. Isso ocorre devido à inclusão de algumas bibliotecas e recursos adicionais do Kotlin necessários para suportar recursos avançados da linguagem. Embora a diferença não seja geralmente significativa, pode impactar o tamanho final do aplicativo em alguns casos.
* **4 - Recursos avançados podem ser complexos:** Embora o Kotlin ofereça recursos avançados, como delegação de propriedades, classes data e coroutines, esses recursos podem ser complexos para desenvolvedores iniciantes. É importante entender bem a sintaxe e os conceitos subjacentes antes de utilizar esses recursos avançados de forma eficaz.
* **5 - Compatibilidade com bibliotecas e frameworks:** Embora o Kotlin seja compatível com a maioria das bibliotecas e frameworks Java existentes, pode haver casos em que a integração não seja perfeita. Algumas bibliotecas ou frameworks podem ter problemas de compatibilidade ou não aproveitar todos os recursos do Kotlin de maneira ideal. No entanto, a comunidade do Kotlin está ativamente trabalhando para resolver essas questões.
