class Account:
    id           = int
    name         = str
    document     = str
    email        = str
    password     = str

    #self es como el .this. Hace referencia a los datos que componen la clase
    def __init__(self, name, document):
        self.name      = name
        self.document  = document