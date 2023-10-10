# EXECUTANDO CODIGOS
Você gostaria de aprender como executar código Kotlin? A seguir, vou explicar como você pode fazer isso em diferentes ambientes, como IDEs (Ambientes de Desenvolvimento Integrado), usando o REPL (Read-Eval-Print Loop) ou compilando e executando seu código em linha de comando.

**1. Utilizando uma IDE (IntelliJ IDEA):**

A maneira mais comum de desenvolver e executar código Kotlin é através de uma IDE, como o IntelliJ IDEA. Aqui está um guia passo a passo:

**Passo 1:** Abra o IntelliJ IDEA ou a IDE de sua preferência, crie um novo projeto Kotlin ou abra um projeto existente.

**Passo 2:** Crie um arquivo Kotlin (.kt) no projeto. Se você estiver criando um novo projeto, o arquivo principal Kotlin é criado automaticamente.

**Passo 3:** Escreva o código Kotlin no arquivo.

**Passo 4:** Para executar o código, clique com o botão direito do mouse no arquivo Kotlin e escolha "Run" (Executar) no menu de contexto. Você verá a saída no console.

**2. Utilizando o REPL (Read-Eval-Print Loop):**

O REPL é uma ótima maneira de experimentar rapidamente código Kotlin sem a necessidade de criar um projeto completo. Você pode seguir estes passos:

**Passo 1:** Abra um terminal ou prompt de comando.

**Passo 2:** Digite `kotlin` e pressione Enter. Você entrará no ambiente REPL do Kotlin.

**Passo 3:** Digite o código Kotlin diretamente no REPL e pressione Enter para ver os resultados imediatamente.

**Passo 4:** Quando terminar, digite `:quit` para sair do REPL.

**3. Compilando e Executando a partir da Linha de Comando:**

Você também pode compilar e executar seu código Kotlin diretamente da linha de comando usando o compilador Kotlin (`kotlinc`) e o interpretador Java (`java`). Siga estes passos:

**Passo 1:** Crie um arquivo Kotlin com extensão `.kt` e escreva seu código nele.

**Passo 2:** Abra um terminal ou prompt de comando.

**Passo 3:** Compile o código Kotlin usando o comando `kotlinc`:

```
kotlinc SeuArquivo.kt -include-runtime -d SeuArquivo.jar
```

**Passo 4:** Execute o código compilado usando o comando `java`:

```
java -jar SeuArquivo.jar
```

Isso irá compilar seu código Kotlin em um arquivo JAR executável e depois executá-lo.

Lembre-se de que para qualquer um desses métodos, é importante ter o ambiente de desenvolvimento do Kotlin e o JDK (Java Development Kit) instalados em seu sistema. Além disso, certifique-se de que o código Kotlin esteja corretamente escrito para evitar erros durante a execução.