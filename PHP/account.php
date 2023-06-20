<?php

class Account {
public $id;
public $name;
public $document;
public $email;
public $password;
              #nombre de la funcion
    public function _construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }

} 

?>
