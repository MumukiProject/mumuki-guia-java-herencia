¡Las plantas han evolucionado! :eyes: Al hacer `fotosintesis`, ahora liberan 100 puntos más de oxígeno que antes.

¡Esto nos pone en un punto medio! Ahora las plantas sólo coinciden en **parte** de la lógica de `fotosintesis`. Si bien suman 100 al cálculo original, siguen comportándose igual que los árboles al usar la cantidad de hojas en su cálculo. Recordemos el uso de **super**:

```java
class Despedida {
  string despedirse() {
    return "Adiós"
  }
}

class DespedidaAmistosa {
  string despedirse() {
    return super.despedirse() + " amigos"
  }
}
```

Esto significa que al realizar las siguientes consultas...

```java
ム despedida.despedirse();
=> "Adiós"
ム despedidaAmistosa.despedirse();
=> "Adiós amigos"
```

**super** permite reutilizar parte de la lógica de la superclase a la vez que se agrega comportamiento propio de la subclase.

> ¡Último uso de herencia! Agregá el método `fotosintesis` a `Planta` sin repetir lógica con `Arbol`.