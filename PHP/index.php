<?php

require_once('Car.php');
require_once('uberX.php');
require_once('Account.php');
require_once('uberVan.php')

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"), "Chevrolet", "Spark");
//Sintaxis para llamar un metodo
$uberX->PrintDataCar();

$uberPool = new UberPool("TYU567", new Account("Andrea Ferran", "ANDA765"), "Dodge", "Attitude");
$uberPool->PrintDataCar();

$uberVan = new UberVan("OJL395", new Account("Raul Ramirez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(4);
$uberVan->PrintDataCar();

?>