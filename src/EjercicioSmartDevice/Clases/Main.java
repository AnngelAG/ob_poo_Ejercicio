package EjercicioSmartDevice.Clases;

import EjercicioSmartDevice.Herencia.SmartPhone;
import EjercicioSmartDevice.Herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        //1.- Clases y Objetos
        SmartDevice iphone = new SmartPhone();
        iphone.Model = "iphone 11";
        iphone.year = 2015;
        iphone.Manufacturer = "Apple";
        iphone.voiceCommand = true;
        iphone.procesador = "A14 Bionic";

        SmartDevice applewatch = new SmartWatch();
        applewatch.Model = "Applewatch 2";
        applewatch.year = 2000;
        applewatch.Manufacturer = "Apple";
        applewatch.voiceCommand = false;
        applewatch.procesador = "S8";

        System.out.println("El " + iphone.Model +"\n" +
                "del año "+ iphone.year + "\n" +
                "Manufacturado por " + iphone.Manufacturer +"\n"+
                "Con procesador "+iphone.procesador + "\n");

        System.out.println("El " + applewatch.Model +"\n" +
                "del año "+ applewatch.year + "\n" +
                "Manufacturado por " + applewatch.Manufacturer +"\n"+
                "Con procesador "+applewatch.procesador + "\n");

        //2.-Herencia

        //3.-Polimorfismo

        //4. Clases Abstactas no se pueden instanciar, solo instancian las clases hijas

    }
}
