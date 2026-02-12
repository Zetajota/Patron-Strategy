

// 2. Estrategia Concreta: Calidad Ultra HD
public class CalidadUltraHD implements EstrategiaCalidad {
    @Override
    public void configurarCalidad(Reproductor context) {
        System.out.println("   Estrategia: Modo ULTRA HD");
        context.aplicarConfiguracion("2160p (4K)", "25 Mbps");
    }
}