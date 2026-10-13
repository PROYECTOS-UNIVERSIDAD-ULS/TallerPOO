package Herencia;
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;


    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void encender() {
        System.out.println("El vehículo está encendido.");
    }
    public void mostrarMarca() {
        System.out.println("La marca del carro es " + getMarca());
    }
}
