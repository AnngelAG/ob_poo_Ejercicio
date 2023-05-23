package EjercicioPOOCocheCRUD;

import poo.herencia.Coche;

public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.findAll();
        cocheCRUD.save(new Coche());
        cocheCRUD.delete(cocheCRUD);
    }
}
