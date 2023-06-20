
class Main{

    public static void main(String[] args) {
        //Asi se imprime en Java 
        System.out.println("Hola Mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123")); //Con esto ya tiene vida Car
        //Con el (.) nos muestra los atributos
        //Estos ya no se usan porque ya existe un constructor con parametros
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera ";
        //car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567",new Account("Andrea Herrera", "ANDA876") );
        //car2.license = "QWE567";
        //car2.driver = "Andrea Herrera ";
        //car2.passenger = 3;
        car2.printDataCar();

        System.out.println("UberX....");
        //Encapsulamiento
        UberX uberx = new UberX("SDW213", new Account("Herbierto","WERT23"),"Bugatti", "Tsuru");
        //Si quito lo de abajo da error porque el atributo passenger no esta visible para la clase main
        //uberx.passenger = 4;
        uberx.setPassenger(4);
        uberx.printDataCar();

        System.out.println("UberVan");
        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera","WERT23"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}