//this hace una simulación al objeto en cuestión, a pesar de que en ese momento visualmente sigue siendo una clase.

class Car{
    //(Aqui se coloca lo que quiero poner)
    constructor(license, driver){
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    
    }
    
    //Metodo
    printDataCar(){
        //Esto es para imprimir
        console.log(this.driver)
        console.log(this.driver.name)
        console.log(this.driver.document)
    }
}
