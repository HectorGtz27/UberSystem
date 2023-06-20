<?php
//UberVan y UberBlack son parecidos
require_once('car.php');
class UberVan extends Car{
    public $typeCarAccepted;
    public $seatsmaterial;

    public function __construct($license, $driver, $typeCarAccepted, $seatsmaterial){
        parent::__construct($license, $driver);
        $this->typeCarAcceptedc= $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    } 
    
    public function setPassenger($passenger){
        if($passenger == 6){
            $this->passenger = $passenger;
        }
        else{
            echo "Necesitas asiganar 6 pasajeros";
        }
    }
   
}


?>