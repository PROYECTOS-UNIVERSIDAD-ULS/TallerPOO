package Herencia;
public class Carro extends Vehiculo {
    private int puertas;

    public Carro(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public void abrirMaletero() {
        System.out.println("El maletero del auto está abierto.");
    }
}
