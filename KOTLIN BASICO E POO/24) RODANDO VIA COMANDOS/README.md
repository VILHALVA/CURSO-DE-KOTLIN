# RODANDO KOTLIN VIA LINHAS DE COMANDOS
Para rodar código Kotlin via linha de comando, você precisará do compilador Kotlin instalado em seu sistema. O compilador Kotlin, chamado de "kotlinc," permite que você compile e execute programas Kotlin diretamente do terminal. A seguir, estão os passos básicos para executar código Kotlin via linha de comando:

1. **Instale o Kotlin (se ainda não estiver instalado)**:

   Certifique-se de ter o Kotlin instalado em seu sistema. Você pode verificar se o Kotlin está instalado executando o seguinte comando no terminal:

   ```bash
   kotlinc -version
   ```

   Se o Kotlin estiver instalado, você verá a versão do compilador. Caso contrário, siga as instruções de instalação no site oficial do Kotlin em [kotlinlang.org](https://kotlinlang.org/docs/command-line.html).

2. **Crie um arquivo Kotlin**:

   Crie um arquivo com extensão ".kt" contendo seu código Kotlin. Por exemplo, você pode criar um arquivo chamado "MeuPrograma.kt" e inserir o seguinte código de exemplo:

   ```kotlin
   fun main() {
       println("Olá, mundo!")
   }
   ```

3. **Compile o Código Kotlin**:

   Use o comando `kotlinc` para compilar seu arquivo Kotlin em um arquivo de bytecode (arquivo ".class"). O comando básico é o seguinte:

   ```bash
   kotlinc MeuPrograma.kt -include-runtime -d MeuPrograma.jar
   ```

   - `MeuPrograma.kt`: O nome do arquivo Kotlin que você deseja compilar.
   - `-include-runtime`: Indica ao compilador que ele deve incluir a biblioteca de tempo de execução Kotlin padrão no arquivo JAR gerado.
   - `-d MeuPrograma.jar`: Especifica o nome do arquivo JAR de saída que conterá seu código compilado.

4. **Execute o Programa Kotlin**:

   Após a compilação bem-sucedida, você pode executar o programa Kotlin usando o comando `java`. Certifique-se de especificar o nome do arquivo JAR gerado:

   ```bash
   java -jar MeuPrograma.jar
   ```

   O programa imprimirá "Olá, mundo!" no terminal.

Isso é tudo! Agora você pode criar, compilar e executar programas Kotlin via linha de comando em seu sistema. Lembre-se de que essas são instruções básicas e que você pode personalizá-las de acordo com suas necessidades, como adicionar mais arquivos ao projeto ou incluir bibliotecas externas, conforme necessário.