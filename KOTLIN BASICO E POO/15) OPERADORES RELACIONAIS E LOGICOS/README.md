# OPERADORES RELACIONAIS E LOGICOS
Os operadores relacionais e lógicos são utilizados em Kotlin para realizar comparações entre valores e controlar o fluxo de um programa com base em condições. Abaixo estão os principais operadores relacionais e lógicos em Kotlin:

**Operadores Relacionais:**

1. **Igual a (==):** Verifica se dois valores são iguais.

   Exemplo:
   ```kotlin
   val a = 5
   val b = 5
   val igual = (a == b) // igual é true
   ```

2. **Diferente de (!=):** Verifica se dois valores são diferentes.

   Exemplo:
   ```kotlin
   val a = 5
   val b = 3
   val diferente = (a != b) // diferente é true
   ```

3. **Maior que (>):** Verifica se o valor da esquerda é maior que o valor da direita.

   Exemplo:
   ```kotlin
   val a = 7
   val b = 5
   val maior = (a > b) // maior é true
   ```

4. **Menor que (<):** Verifica se o valor da esquerda é menor que o valor da direita.

   Exemplo:
   ```kotlin
   val a = 3
   val b = 5
   val menor = (a < b) // menor é true
   ```

5. **Maior ou igual a (>=):** Verifica se o valor da esquerda é maior ou igual ao valor da direita.

   Exemplo:
   ```kotlin
   val a = 5
   val b = 5
   val maiorOuIgual = (a >= b) // maiorOuIgual é true
   ```

6. **Menor ou igual a (<=):** Verifica se o valor da esquerda é menor ou igual ao valor da direita.

   Exemplo:
   ```kotlin
   val a = 3
   val b = 5
   val menorOuIgual = (a <= b) // menorOuIgual é true
   ```

**Operadores Lógicos:**

1. **E lógico (&&):** Retorna verdadeiro (`true`) se ambas as expressões forem verdadeiras.

   Exemplo:
   ```kotlin
   val x = true
   val y = false
   val resultado = x && y // resultado é false
   ```

2. **OU lógico (||):** Retorna verdadeiro (`true`) se pelo menos uma das expressões for verdadeira.

   Exemplo:
   ```kotlin
   val x = true
   val y = false
   val resultado = x || y // resultado é true
   ```

3. **NÃO lógico (!):** Inverte o valor de verdadeiro para falso ou de falso para verdadeiro.

   Exemplo:
   ```kotlin
   val x = true
   val resultado = !x // resultado é false
   ```

**Combinando Operadores Relacionais e Lógicos:**

Você pode combinar operadores relacionais e lógicos para criar expressões condicionais mais complexas.

Exemplo:
```kotlin
val idade = 25
val temCarteiraDeMotorista = true

val podeDirigir = (idade >= 18) && temCarteiraDeMotorista // true
```

Neste exemplo, `podeDirigir` será verdadeiro se a idade for maior ou igual a 18 e a pessoa tiver uma carteira de motorista.

Operadores relacionais e lógicos são fundamentais para criar lógica condicional em programas Kotlin. Eles são usados em declarações condicionais (como `if`, `else`, `when`) e em avaliações de expressões booleanas em geral.