package EjercicioPOOCocheCRUD;

import poo.herencia.Coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save(Coche coche) {
        System.out.println("coche saved");
    }
    @Override
    public List<Coche> findAll() {
        System.out.println("coche found");
        return null;
    }

    @Override
    public void delete(CocheCRUD coche) {
        System.out.println("coche deleted");
    }
}
