

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
        estrategia.configurarCalidad(this);

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
