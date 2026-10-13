package Herencia;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(null, null, 0);
        carro.marca = "Hyundai";

        carro.encender();
        carro.abrirMaletero();
        carro.mostrarMarca();

    }
}
