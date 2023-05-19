package poo.herencia;

import poo.clases.Vehiculo;

public class Coche extends Vehiculo {
    int numPuertas;

    public Coche(){

    }
    public Coche(String manufacturer, String model, double cc, int year, boolean sport, int numPuertas) {
        super(manufacturer, model, cc, year, sport);
        this.numPuertas = numPuertas;
    }
}
