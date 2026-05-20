package gestion;

public class MontanaRusa extends Atraccion {
    private double velocidadMaxima;
    private double longitudVia;

    public MontanaRusa(String nombre, int capacidadMaxima, double velocidadMaxima, double longitudVia) {
        super(nombre, capacidadMaxima);
        this.velocidadMaxima = velocidadMaxima;
        this.longitudVia = longitudVia;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando " + nombre + ": Encendiendo motores de cadena y verificando frenos magnéticos.");
        this.abierta = true;
    }

    @Override
    public double calcularIndiceRiesgo() {
        return velocidadMaxima * 0.5;
    }

    @Override
    public String generarReporteSeguridad() {
        return "Reporte Montaña Rusa - Frenos OK. Riesgo: " + calcularIndiceRiesgo();
    }
}
