Al igual que aprendimos en Ruby, la clase abstracta nos da ciertas ventajas:

* Podemos explicitar qué métodos deben implementar las clases que heredan de la superclase. Por ejemplo, todos los empleados deben saber decirnos su `genteACargo` y su `sueldoPorHora`
* Podemos definir los métodos cuyo comportamiento es igual para todas las subclases, sin repetir lógica. En nuestro caso, tanto los jefes como los pasantes saben `trabajar` y decirnos su `dinero` de la misma forma.