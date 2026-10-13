package Interfaz;

public class ejemplo2 {
    // Definición de la Interfaz
interface Volador {
    void volar(); // Método abstracto implícito
}

// Clase que implementa la interfaz
class Pato implements Volador {
    @Override
    public void volar() {
        System.out.println("El pato está volando bajo.");
    }
}

class Avion implements Volador {
    @Override
    public void volar() {
        System.out.println("El avión vuela a alta velocidad con turbinas.");
    }
}
}
