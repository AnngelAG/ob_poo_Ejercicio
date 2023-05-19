package EjercicioSmartDevice.Clases;

public class SmartDevice {
    //1. atributos
    protected String Manufacturer;
    protected String Model;

    protected String procesador;

    protected int year;
    protected boolean voiceCommand;


    //2. Contructores
    public SmartDevice(){

    }
    public SmartDevice(String manufacturer, String model, String procesador, int year, boolean voiceCommand) {
        Manufacturer = manufacturer;
        Model = model;
        this.procesador = procesador;
        this.year = year;
        this.voiceCommand = voiceCommand;
    }
    //3. Metodos (comportamiento)

    // Getter y Setter

}
