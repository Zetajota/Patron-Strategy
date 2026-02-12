error id: file:///D:/!PATRONES2/Main.java:java/lang/System#
file:///D:/!PATRONES2/Main.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 170
uri: file:///D:/!PATRONES2/Main.java
text:
```scala


// 4. Clase Cliente / Main
public class Main {
    public static void main(String[] args) {
        Reproductor miReproductor = new Reproductor(10.0);

        S@@ystem.out.println(" MODO AHORRO");
        miReproductor.setEstrategia(new CalidadAhorro());
        miReproductor.ejecutar();

        System.out.println(" MODO ULTRA HD");
        miReproductor.setEstrategia(new CalidadUltraHD());
        miReproductor.ejecutar();

        System.out.println(" MODO ADAPTATIVO (Red: 10 Mbps)");
        miReproductor.setEstrategia(new CalidadAdaptativa());
        miReproductor.ejecutar();

        // Cambio de condiciones
        miReproductor.simularCambioRed(2.0); // Cae a 2 Mbps
        System.out.println("  Re-evaluando (Red cae)...");
        miReproductor.ejecutar();

        miReproductor.simularCambioRed(50.0); // Sube a 50 Mbps
        System.out.println("  Re-evaluando (Red mejora)...");
        miReproductor.ejecutar();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#