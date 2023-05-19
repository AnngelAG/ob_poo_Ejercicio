package poo.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUDV1 empeladoCRUD = new EmpleadoCRUDV1();

        Empleado Juanito = new Empleado("Juanito",30,40000,true);
        Empleado Eduardo = new Empleado("Eduardo",30,40000,true);
        Empleado Emilio = new Empleado("Emilio",30,40000,true);
        //Guardar empleados
        empeladoCRUD.guardar(Juanito);
        empeladoCRUD.guardar(Eduardo);
        empeladoCRUD.guardar(Emilio);

        //Consultar empleados
        List<Empleado> empleados = empeladoCRUD.findAll();
        System.out.println(empleados);

    }
}
