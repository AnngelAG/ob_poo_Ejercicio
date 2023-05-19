package poo.sinInterfaces;

import java.util.ArrayList;
import java.util.List;
/**
 * Create
 * Retrieve/Read
 * Update
 * Delete
**/
public class EmpleadoCRUDV1 {
    // Estructura de datos
    private List<Empleado> empleados = new ArrayList<>();
    // Operaciones CRUD
    // CREATE- Guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }
    public List<Empleado> findAll(){
        return empleados;
    }

}
