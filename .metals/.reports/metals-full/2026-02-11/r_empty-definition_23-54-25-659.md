error id: file:///D:/!PATRONES2/Reproductor.java:_empty_/EstrategiaCalidad#configurarCalidad().
file:///D:/!PATRONES2/Reproductor.java
empty definition using pc, found symbol in pc: _empty_/EstrategiaCalidad#configurarCalidad().
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 801
uri: file:///D:/!PATRONES2/Reproductor.java
text:
```scala


// 3. El Contexto (Context)
public class Reproductor {
    private EstrategiaCalidad estrategia;
    private String resolucionActual;
    private String bitrateActual;
    private double velocidadRedSimulada;

    public Reproductor(double velocidadInicial) {
        this.velocidadRedSimulada = velocidadInicial;
        this.resolucionActual = "Desconocida";
        this.bitrateActual = "0 Kbps";
    }

    public void setEstrategia(EstrategiaCalidad nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public void ejecutar() {
        if (estrategia == null) {
            System.out.println("Error: Sin estrategia definida.");
            return;
        }

        System.out.println("--- Iniciando Reproducción ---");
        estrategia.configu@@rarCalidad(this);

        System.out.println("   [Reproductor] " + resolucionActual + " | " + bitrateActual);
        System.out.println("");
    }

    // Helper para simplificar estrategias
    public void aplicarConfiguracion(String resolucion, String bitrate) {
        this.resolucionActual = resolucion;
        this.bitrateActual = bitrate;
        System.out.println("   [Config] " + resolucion + " @ " + bitrate);
    }

    public double getVelocidadRed() {
        return velocidadRedSimulada;
    }

    // Solo para pruebas
    public void simularCambioRed(double nuevaVelocidad) {
        this.velocidadRedSimulada = nuevaVelocidad;
        System.out.println("\n[Simulación] Nueva velocidad: " + nuevaVelocidad + " Mbps");
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/EstrategiaCalidad#configurarCalidad().