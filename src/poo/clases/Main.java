package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {

        //1.- Clases y Objetos
        // Clase identificador = new clase();
        // Crear un objeto utilizando el contructor vacío
        Vehiculo toyotaPrius = new Vehiculo();
        Motor motorGTI = new Motor("GTI",190,459.0,6);


        // Crear un objeto utilizando el contructor con parámetros
        Vehiculo fordMondeo = new Vehiculo("FORD","Modeo",2.1,2010,false,0,motorGTI);
        System.out.println("El carro de manufactura de " + fordMondeo.manufacturer+ " " +
                "modelo: "+fordMondeo.model+ " del año: ");
        System.out.println(fordMondeo.year);
        System.out.println("El carro acelero de  "+fordMondeo.speed+" Km/hr");
        fordMondeo.speedUp(50.00);
        System.out.println("A  "+fordMondeo.speed+" Km/hr en 1 seg");

        //2.-Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.manufacturer = "Kawasaki";

        System.out.println("fin del programa");

        //3.-Polimorfismo
        Vehiculo vehiculo;
        vehiculo = new Motocicleta();
        vehiculo.speedUp(50);

        vehiculo = new Coche();
        vehiculo.speedUp(50);

        vehiculo = new Camion();
        vehiculo.speedUp(50);

        //4. Clases Abstactas no se pueden instanciar, solo instancian las clases hijas


    }

}
