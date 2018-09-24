Repasemos qué ocurrió en este ejercicio:

* `Arbusto` hereda de `Arbol` para poder aprovechar el comportamiento que es igual a ambas clases, como `daFrutos`, `fotosintesis` y `cantidadDeHojas`.
* `Arbusto` redefine los métodos cuyo comportamiento es distinto, como `crecer`.
* Por otro lado, `Arbol` no podría heredar de `Arbusto` porque, en ese caso, un árbol también heredaría el método `marchitarse`. Sin embargo, sólo los arbustos se marchitan (¡al menos en nuestro sistema! :stuck_out_tongue:).

¿En qué se diferencia esta herencia de la que utilizamos con `Empleado`? Aquí, tanto `Arbol` como `Arbusto` son concretas. ¡Podemos tener instancias de ambas clases! :grin: