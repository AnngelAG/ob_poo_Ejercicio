package poo.clases;

public class Motor {
    //1. atributes
    String model;
    int horses;
    double parNm;
    int numCilindros;
    //2. Contructores
    public Motor(){
    }
    public Motor(String model, int horses, double parNm, int numCilindros) {
        this.model = model;
        this.horses = horses;
        this.parNm = parNm;
        this.numCilindros = numCilindros;
    }
}
