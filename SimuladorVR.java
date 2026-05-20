package gestion;

public class SimuladorVR extends Atraccion {
    private String versionSoftware;

    public SimuladorVR(String nombre, int capacidadMaxima, String versionSoftware) {
        super(nombre, capacidadMaxima);
        this.versionSoftware = versionSoftware;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando " + nombre + ": Reiniciando computadoras y calibrando cascos VR.");
        this.abierta = true;
    }

    @Override
    public double calcularIndiceRiesgo() {
        return 2.0;
    }

    @Override
    public String generarReporteSeguridad() {
        return "Reporte Simulador - Software " + versionSoftware + " OK.";
    }
}
