//UberX y UberPool son parecidos
//Aqui se aplica la herencia
class UberX extends Car{
    String brand;
    String model;

    //Constructor que recibe 4 parsmetros
    public UberX(String License, Account driver, String brand, String model){
        //super significa que tu no lo ves pero esta definido, es como si llamaras al metodo constructor de la clase car.
        //si coloca el cursor te va aparecer con mas detalle  
        //si coloco (super.) se ven los atributos de la clase padre
        //super hara referncia a los datos o los atrubutos y a los metodos de la super clase
        //this hara referencia a los atrbutos de la clase hija

        super(License, driver);
        this.brand = brand;
        this.model = model;
        
        
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + model + " Brand: " + brand);

    }

}