package Dependencia;

public class ejemplo {
    class Auto {
    public void encender() {
        System.out.println("Auto encendido.");
    }
}

class Conductor {
    // Dependencia: El auto se pasa como argumento en el método
    public void conducir(Auto auto) {
        auto.encender();
        System.out.println("El conductor está manejando.");
    }
}
}
