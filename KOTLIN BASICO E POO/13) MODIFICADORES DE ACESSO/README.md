# MODIFICADORES DE ACESSO
Em Kotlin, os modificadores de acesso são utilizados para controlar a visibilidade dos membros de classes (propriedades, métodos, etc.) e das próprias classes. Eles ajudam a definir quais partes do código podem acessar ou modificar esses membros. Kotlin oferece quatro principais modificadores de acesso:

1. **public:**
   - Este é o modificador de acesso padrão.
   - Membros marcados como `public` podem ser acessados de qualquer lugar, tanto dentro da classe que os contém quanto em qualquer outro lugar do código.
   - É o nível de acesso mais permissivo.

```kotlin
class Exemplo {
    public val valorPublico = 42
}
```

2. **private:**
   - Membros marcados como `private` só podem ser acessados dentro da classe que os contém.
   - Isso garante um alto nível de encapsulamento e oculta os detalhes de implementação.

```kotlin
class Exemplo {
    private val valorPrivado = 42
}
```

3. **protected:**
   - Membros marcados como `protected` são visíveis apenas dentro da classe que os contém e nas subclasses dessa classe.
   - Isso é útil quando você deseja fornecer acesso somente para subclasses, mas não fora delas.

```kotlin
open class Superclasse {
    protected val valorProtegido = 42
}

class Subclasse : Superclasse() {
    fun acessarValor() {
        println(valorProtegido) // Pode acessar valorProtegido da superclasse
    }
}
```

4. **internal:**
   - Membros marcados como `internal` são visíveis em todo o módulo em que estão definidos.
   - Um módulo é um conjunto de arquivos Kotlin compilados juntos (por exemplo, um projeto ou um módulo Gradle).
   - Essa é uma maneira de restringir o acesso a um escopo maior do que apenas dentro da classe ou subclasse.

```kotlin
internal val valorInterno = 42
```

**Observações Importantes:**

- A ausência de um modificador de acesso equivale a `public` por padrão.
- Um membro `protected` não pode ser acessado fora da subclasse, mesmo se o objeto da subclasse estiver sendo referenciado a partir da superclasse.
- Quando você cria uma classe interna (uma classe dentro de outra classe), a classe interna pode acessar membros privados da classe externa.

Os modificadores de acesso são importantes para o encapsulamento e a segurança de código. Eles ajudam a controlar o acesso aos membros da classe e a limitar a exposição indevida de detalhes de implementação. Escolha o modificador de acesso apropriado com base nas necessidades de segurança e encapsulamento do seu código.