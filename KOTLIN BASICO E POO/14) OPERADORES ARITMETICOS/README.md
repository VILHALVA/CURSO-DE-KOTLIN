# OPERADORES ARITMETICOS
Os operadores aritméticos são utilizados para realizar operações matemáticas básicas em números em Kotlin. Eles incluem adição, subtração, multiplicação, divisão e outros operadores relacionados à matemática. Abaixo estão os principais operadores aritméticos em Kotlin:

**1. Adição (+):** Utilizado para somar dois valores.

Exemplo:
```kotlin
val resultado = 5 + 3 // resultado é igual a 8
```

**2. Subtração (-):** Utilizado para subtrair um valor de outro.

Exemplo:
```kotlin
val resultado = 10 - 3 // resultado é igual a 7
```

**3. Multiplicação (*):** Utilizado para multiplicar dois valores.

Exemplo:
```kotlin
val resultado = 4 * 5 // resultado é igual a 20
```

**4. Divisão (/):** Utilizado para dividir um valor por outro. O resultado da divisão é um valor de ponto flutuante, mesmo que os operandos sejam inteiros.

Exemplo:
```kotlin
val resultado = 15.0 / 2 // resultado é igual a 7.5
```

**5. Módulo (%):** Utilizado para obter o resto da divisão de um número pelo outro. O resultado é o valor restante após a divisão.

Exemplo:
```kotlin
val resultado = 15 % 4 // resultado é igual a 3 (resto da divisão)
```

**6. Incremento (++) e Decremento (--):** São operadores unários que aumentam ou diminuem o valor de uma variável em 1, respectivamente.

Exemplo:
```kotlin
var numero = 5
numero++ // Incrementa número em 1, agora numero é igual a 6
numero-- // Decrementa número em 1, agora numero é igual a 5 novamente
```

**7. Operadores de Atribuição Combinada:** São utilizados para realizar uma operação e atribuição em uma única expressão.

Exemplo:
```kotlin
var valor = 10
valor += 5 // Equivalente a valor = valor + 5, agora valor é igual a 15
valor -= 3 // Equivalente a valor = valor - 3, agora valor é igual a 12
valor *= 2 // Equivalente a valor = valor * 2, agora valor é igual a 24
valor /= 4 // Equivalente a valor = valor / 4, agora valor é igual a 6
```

Lembre-se de que a ordem de precedência dos operadores aritméticos segue as regras padrão da matemática, com multiplicação e divisão tendo precedência sobre adição e subtração. Você pode usar parênteses para controlar a ordem de avaliação das expressões, se necessário.

```kotlin
val resultado = (5 + 3) * 2 // resultado é igual a 16 (primeiro a soma, depois a multiplicação)
```

Esses são os operadores aritméticos mais comuns em Kotlin. Eles são amplamente utilizados em cálculos matemáticos e manipulação de números em programas Kotlin.