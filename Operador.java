package gestion;

public class Operador extends Trabajador {
    private int nivelCertificacion;

    public Operador(String nombre, String id, double salarioBase, int nivelCertificacion) {
        super(nombre, id, salarioBase);
        this.nivelCertificacion = nivelCertificacion;
    }
}
