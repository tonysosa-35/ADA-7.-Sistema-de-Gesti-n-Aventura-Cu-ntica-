package gestion;

public class CarritoGolf implements Auditable {
    private int nivelBateria;
    private String numeroSerie;

    public CarritoGolf(int nivelBateria, String numeroSerie) {
        this.nivelBateria = nivelBateria;
        this.numeroSerie = numeroSerie;
    }

    @Override
    public double calcularIndiceRiesgo() {
        return nivelBateria < 20 ? 5.0 : 1.0;
    }

    @Override
    public String generarReporteSeguridad() {
        return "Reporte Carrito " + numeroSerie + " - Batería al " + nivelBateria + "%";
    }
}
