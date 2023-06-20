class Car {
    //Estas son variables globales de la clase Car
    //Si no tiene nada de public y asi toma el default
    private Integer id;
    private String license;
    private Account driver;
    //Private es para esconderlo, es solo parte de la clase de car
    private Integer passenger;

    //Metodo constructor(parametros locales)
    public Car(String license, Account driver){
        //derecha a izquierda y se usa this porque se usan 2 variables con el mismo nombre. .this representa la clase en cuestion
        this.license = license;
        this.driver = driver;

        //passenger = 3;
        //Esto se tiene que poner ya que el atributo passenger esta privado
        //System.out.println("Passenger: " + passenger );
    }

    //Metodo
    void printDataCar(){
        if(passenger != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passenger: " + passenger);
        }
        
    }
    //Estos son los getters y los setters
    //Este es el tipo de dato que estoy devolviendo
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger == 4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
