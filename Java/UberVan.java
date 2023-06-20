import java.util.ArrayList;
import java.util.Map;

//extends: herencia 
class UberVan extends Car {
    //Eso representa la marca y la coleccion de 2 datos representara el modelo
    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    //Esto se agrega para poder usar passengr
    private Integer passenger;

    //clase constructor
    public UberVan(String license, Account driver){
        super(license, driver);
        
        
    }

    public UberVan(String license, Account driver, 
    Map<String, Map<String,Integer>> typeCarAccepted,
    ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    //Esto signifca que estamos sobrescribiendo este metodo que proviende la clase padre Car
    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}