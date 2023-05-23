package EjercicioPOOCocheCRUD;

import poo.herencia.Coche;

import java.util.List;

public interface CocheCRUD {
        void save(Coche coche);

        List<Coche> findAll();

        void delete(CocheCRUD coche);
}

