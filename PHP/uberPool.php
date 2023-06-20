<?php
//UberX y UberPool son parecidos
require_once('car.php');

class UberPool extends Car {
    public $brand;
    public $model;

    public function __constrcut($license, $driver, $brand, $model){
        //El parent equivale al super de java
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }


}
?>