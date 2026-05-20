package gestion;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos el parque
        Parque miParque = new Parque("Aventura Cuántica");

        // 2. Creamos sectores
        SectorTematico zonaCiberpunk = new SectorTematico("Zona Ciberpunk");
        SectorTematico zonaJurasica = new SectorTematico("Zona Jurásica");

        // 3. Creamos atracciones
        SimuladorVR sim1 = new SimuladorVR("Cyber-Escape", 15, "v2.4.1");
        MontanaRusa mt1 = new MontanaRusa("T-Rex Express", 30, 120.5, 1500.0);

        // 4. Agregamos las atracciones a sus sectores
        zonaCiberpunk.agregarAtraccion(sim1);
        zonaJurasica.agregarAtraccion(mt1);

        // 5. Agregamos los sectores al parque
        miParque.agregarSector(zonaCiberpunk);
        miParque.agregarSector(zonaJurasica);

        // 6. Prueba final: Arrancar todo
        miParque.arrancarTodoElParque();
    }
}
