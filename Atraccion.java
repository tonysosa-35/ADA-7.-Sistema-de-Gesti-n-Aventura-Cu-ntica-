package gestion;

public abstract class Atraccion implements Auditable {
    protected String nombre;
    protected int capacidadMaxima;
    protected boolean abierta;

    public Atraccion(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.abierta = false;
    }

    public abstract void arrancar();
}
