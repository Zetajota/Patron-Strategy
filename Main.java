

// 4. Clase Cliente / Main
public class Main {
    public static void main(String[] args) {
        Reproductor miReproductor = new Reproductor(10.0);

        System.out.println(" MODO AHORRO");
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
