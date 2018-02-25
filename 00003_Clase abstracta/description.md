Al menos hasta ahora, las similitudes entre nuestros dos tipos de empleados son evidentes: ambos entienden los mensajes `genteACargo`, `sueldoPorHora` y `trabajar`. Esto significa que comparten una interfaz compuesta por esos tres mensajes.

:thought_balloon: Entonces... ¿qué hacemos? ¿Que `Jefe` y `Pasante` implementen la interfaz `Empleado`?

Podría ser, ¡pero es una oportunidad perdida! :frowning: Como los dos tipos de empleado saben `trabajar` de la misma forma, podemos extraer ese comportamiento en la superclase `Empleado`. ¡En las interfaces no se puede definir comportamiento!

Además, `Empleado` será una clase abstracta, porque nunca instanciaremos objetos de su tipo: sólo de las clases concretas `Jefe` y `Pasante`.

Las clases abstractas se definen utilizando la palabra clave `abstract`. Lo mismo para los métodos abstractos:

```java
abstract class Felino
{
  abstract void alimentarse();
  
  abstract void correr();
}
```

Luego, las subclases *heredan* de la superclase utilizando la palabra clave `extends`:

```java
class Gato extends Felino
{
  void alimentarse() {
    //define el comportamiento para alimentarse...
  }
  
  void correr() {
    //define el comportamiento para correr...
  }
}
```

> ¡Repasemos la idea de clase abstracta! Marcá las respuestas correctas: