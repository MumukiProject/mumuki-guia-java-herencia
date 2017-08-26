¿Y si queremos definir un método en términos de otro? ¿Podemos usar `super` en Java tal como lo hacíamos en Ruby? 

¡Exactamente! Peeeero, cuidado, que hay una pequeña diferencia: `super` ahora es una _referencia_ y no un _mensaje_: 

```java
class GuitarraElectrica extends Guitarra {
  
}
```

> Sabiendo ésto, redefiní ahora el peso máximo de la alpaca como un 10% más que el de la vicuña. 