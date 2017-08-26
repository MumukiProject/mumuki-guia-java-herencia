Ahora que `super` es una referencia, podríamos hacer cosas como ésta...

```java
class GuitarraElectrica extends Guitarra {
  
}
```

...¡pero eso está mal! :rage:

Nunca, nunca, nunca uses `super` para enviar un mensaje distinto del que estás redefiniendo. No seguir este consejo te puede llevar a código muy difícil de entender :cold_sweat:. 

Así que la próxima vez que estés pensando en hacer algo así, pensalo dos veces porque casi seguro se puede hacer más fácil :smile:. 