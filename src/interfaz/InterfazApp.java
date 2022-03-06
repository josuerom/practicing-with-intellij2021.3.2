package interfaz;

import mundo.Carro;

public class InterfazApp {

    public static void main(String[] args) {
        Carro carro1 = new Carro("MW", "2022", "Azul abismo");
        Carro carro2 = new Carro("Nissan", "2021", "Rojo");
        carro1.setMarca("Toyota");

        System.out.println("Carro No. 1 = Marca: " + carro1.getMarca() + " Modelo: " + carro1.getModelo() + " Color: " + carro1.getColor());
        System.out.println("Carro No. 2 = Marca: " + carro2.getMarca() + " Modelo: " + carro2.getModelo() + " Color: " + carro2.getColor());
    }
}