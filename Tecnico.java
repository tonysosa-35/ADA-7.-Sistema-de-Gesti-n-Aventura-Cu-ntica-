package gestion;

public class Tecnico extends Trabajador {
    private String especialidad;

    public Tecnico(String nombre, String id, double salarioBase, String especialidad) {
        super(nombre, id, salarioBase);
        this.especialidad = especialidad;
    }
}
