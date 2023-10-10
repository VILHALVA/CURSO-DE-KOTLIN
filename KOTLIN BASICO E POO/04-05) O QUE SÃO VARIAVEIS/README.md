# O QUE SÃO VARIAVEIS (TEORIA)?
Variáveis em Kotlin são elementos fundamentais para armazenar e manipular dados em um programa. Elas representam espaços na memória onde valores podem ser armazenados e recuperados. Em Kotlin, você pode declarar variáveis com diferentes tipos de dados, e a linguagem é projetada para ser segura quanto a nulos, o que ajuda a evitar erros comuns relacionados a referências nulas. Aqui estão os principais conceitos relacionados a variáveis em Kotlin:

1. **Declaração de Variáveis**:

   Para declarar uma variável em Kotlin, você usa as palavras-chave `val` ou `var`, seguidas pelo nome da variável e, opcionalmente, seu tipo. A diferença principal entre `val` e `var` está na mutabilidade da variável:

   - `val`: Declara uma variável imutável (não pode ser reatribuída após a inicialização). É usado para valores que não mudam ao longo do tempo.
   
   - `var`: Declara uma variável mutável (pode ser reatribuída após a inicialização). É usado para valores que podem mudar.

   Exemplo:
   
   ```kotlin
   val nome: String = "Alice"  // Uma variável imutável
   var idade: Int = 30        // Uma variável mutável
   ```

2. **Inferência de Tipo**:

   Kotlin suporta a inferência de tipo, o que significa que você pode omitir explicitamente o tipo da variável quando o compilador pode deduzir automaticamente o tipo com base no valor atribuído. Por exemplo:

   ```kotlin
   val sobrenome = "Silva"    // Kotlin infere que sobrenome é uma String
   var contador = 0           // Kotlin infere que contador é um Int
   ```

3. **Segurança Quanto a Nulos**:

   Em Kotlin, os tipos de dados são seguros quanto a nulos por padrão. Isso significa que você deve especificar se uma variável pode conter um valor nulo usando o operador `?`. Por exemplo:

   ```kotlin
   var nome: String? = null  // A variável nome pode ser nula
   ```

   Isso ajuda a evitar exceções de "NullPointerException" comuns em outras linguagens.

4. **Tipos Primitivos vs. Tipos de Referência**:

   Em Kotlin, os tipos de dados são objetos. Por exemplo, `Int` é uma classe que representa um número inteiro. Isso é diferente de algumas outras linguagens onde existem tipos primitivos separados para números inteiros, como `int`. Kotlin otimiza automaticamente o armazenamento de tipos primitivos quando possível.

5. **Inicialização Tardia**:

   Em Kotlin, você pode declarar uma variável sem atribuir um valor imediatamente. Nesse caso, você deve especificar seu tipo ou torná-lo uma variável nula.

   ```kotlin
   var salario: Double   // Variável não inicializada
   salario = 1000.0     // Inicialização posterior
   ```

6. **Escopo de Variável**:

   A disponibilidade de uma variável depende de seu escopo. As variáveis podem ser locais (disponíveis apenas dentro de um bloco de código específico) ou globais (disponíveis em todo o programa). Em Kotlin, as variáveis locais geralmente têm escopo em funções ou blocos delimitados por chaves `{}`.

Esses são os conceitos fundamentais relacionados a variáveis em Kotlin. Variáveis são uma parte essencial de qualquer linguagem de programação e são usadas para armazenar e manipular dados durante a execução de um programa.