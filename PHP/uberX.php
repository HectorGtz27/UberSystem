<?php
//UberX y UberPool son parecidos
require_once('car.php');

class UberX extends Car {
    public $brand;
    public $model;

    public function __constrcut($license, $driver, $brand, $model){
        //El parent equivale al super de java
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }

    public function printDataCar(){
        echo 
        "
        License: $this->license
        Name: 1this->driver->name}
        Document: 1this->driver->document}
        Brand: $this->brand
        Model: $this->model
        
        ";
    }

}
?>