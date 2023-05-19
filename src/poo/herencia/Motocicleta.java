package poo.herencia;

import poo.clases.Vehiculo;

public class Motocicleta extends Vehiculo {
    boolean baul;
    public Motocicleta(){

    }
        public Motocicleta(String manufacturer, String model, double cc, int year, boolean sport, boolean baul) {
        super(manufacturer, model, cc, year, sport);
        this.baul = baul;
    }
}
