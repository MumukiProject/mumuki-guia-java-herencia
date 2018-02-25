Lo que hiciste recién es lo mismo que en Ruby conocíamos como **redefinición**: una subclase que reimplementa un método que hereda cuyo comportamiento es distinto.

De esta forma logramos lo siguiente:

* Unificar `trabajar` y `faltarAlTrabajo` en `Empleado`, porque es igual tanto para pasantes como para jefes - y así no repetimos esa lógica;
* Redefinir ambos métodos en `Gerente`, porque su lógica es distinta a la del resto de los empleados. Sin embargo, no deja de heredar de `Empleado`: por eso debe proveer la implementación de los métodos abstractos `sueldoPorHora` y `genteACargo`.