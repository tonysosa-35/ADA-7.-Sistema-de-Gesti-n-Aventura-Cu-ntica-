package gestion;

import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombre;
    private List<SectorTematico> sectores;

    public Parque(String nombre) {
        this.nombre = nombre;
        this.sectores = new ArrayList<>(); 
    }

    public void agregarSector(SectorTematico sector) {
        sectores.add(sector);
    }

    public void arrancarTodoElParque() {
        System.out.println("Iniciando secuencia de arranque general en " + nombre + "...");
        for (SectorTematico sector : sectores) {
            for (Atraccion atraccion : sector.getAtracciones()) {
                atraccion.arrancar(); 
            }
        }
    }
}
