

// 2. Estrategia Concreta: Calidad Ahorro
public class CalidadAhorro implements EstrategiaCalidad {
    @Override
    public void configurarCalidad(Reproductor context) {
        System.out.println("   [Estrategia] Modo AHORRO...");
        context.aplicarConfiguracion("480p", "500 Kbps");
    }
}
