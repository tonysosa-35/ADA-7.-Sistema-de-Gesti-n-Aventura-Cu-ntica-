package gestion;

import java.util.ArrayList;
import java.util.List;

public class SectorTematico {
    private String nombre;
    private List<Trabajador> trabajadores;
    private List<Atraccion> atracciones;

    public SectorTematico(String nombre) {
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
        this.atracciones = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador t) { 
        trabajadores.add(t); 
    }
    
    public void agregarAtraccion(Atraccion a) { 
        atracciones.add(a); 
    }
    
    public List<Atraccion> getAtracciones() { 
        return atracciones; 
    }
}
