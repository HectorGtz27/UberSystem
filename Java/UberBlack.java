import java.util.ArrayList;
import java.util.Map;

//extends: herencia 
class UberBlack extends Car {
    //Eso representa la marca y la coleccion de 2 datos representara el modelo
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    //clase constructor
    public UberBlack(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}

