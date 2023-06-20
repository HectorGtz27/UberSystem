from account import Account
#MUCHO OJO aqui TODO se pone en el super porque todos los parametros los hereda de la clase de Account
class Driver(Account):
    def __init__(self,name, document, email, pasword):
        super().__init__(id,name,document, email, pasword)
    