package gestion;

public abstract class Trabajador {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Trabajador(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }
}
