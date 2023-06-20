<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    protected $passenger;

    public function __constrcut($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function PrintDataCar(){
        echo "Licencia: $this->license Driver:  {$this->driver->name} Numero de pasajeros: $this->passenger";
    }
    //Getter
    public function getPassenger(){
        return $this->passenger;
    }

    //Setter
    public functiin setPassenger($passenger){
        if ($passnger == 4){
            $this.passenger = $passenger; 
        }
        else{
            echo "Necesitas asignar 4 pasajeros"
        }
    }

}
?>