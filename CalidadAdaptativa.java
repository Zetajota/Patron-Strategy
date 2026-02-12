

// 2. Estrategia Concreta: Calidad Adaptativa
public class CalidadAdaptativa implements EstrategiaCalidad {

    @Override
    public void configurarCalidad(Reproductor context) {
        double velocidad = context.getVelocidadRed();

        if (velocidad > 15) {
            context.aplicarConfiguracion("1080p (Full HD)", "5 Mbps");
        } else if (velocidad > 5) {
            context.aplicarConfiguracion("720p (HD)", "2.5 Mbps");
        } else {
            context.aplicarConfiguracion("360p (SD)", "300 Kbps");
        }
    }
}
