from car import Car
from account import Account
from UberX import UberX
from user import User

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    #Aqui se imprime en formato json
    print(vars(car))
    print(vars(car.driver))

    
    print("UberX")
    uberX = UberX("QWE123", Account("Hector Gutierrez", "WHAT654" ), "Toyota", "Corrolla")
    print(vars(uberX))
    print(vars(uberX.driver))
    
    print("User")
    user = User("Camila Rodriguez", "CEHN22ZA02", "alan.gtz51@gmail.com", "1234")
    print(vars(user))