package poo.clases;

public class Vehiculo {
    //1. atributos
    protected String manufacturer;
    protected String model;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed = 0;
    protected Motor motor;

    //2. Contructores
    public Vehiculo(){

    }
    public Vehiculo(String manufacturer,String model,double cc,int year,boolean sport){
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = 0;
    }
    public Vehiculo(String manufacturer,String model){
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Vehiculo(String manufacturer, int year) {
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public Vehiculo(String manufacturer, String model, double cc, int year, boolean sport, int speed, Motor motor) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    //3. Metodos (comportamiento)
    public void speedUp(double quantity){

        this.speed += quantity;
    }
    // Getter y Setter



}
