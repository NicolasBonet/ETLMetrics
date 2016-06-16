CREATE TABLE Client (
  id int NOT NULL,
  password varchar(255),
  name varchar(255),
  PRIMARY KEY (id)
)

CREATE TABLE Producto (
  name varchar(255),
  id int NOT NULL,
  PRIMARY KEY (id)
)

CREATE TABLE Carrito (
  id int NOT NULL,
  name varchar(255),
  clientId int,
  PRIMARY KEY (id),
  FOREIGN KEY (clientId) REFERENCES Client(id)
)

CREATE TABLE CarritoItem (
  carritoId int NOT NULL,
  itemId int NOT NULL,
  PRIMARY KEY (carritoId , itemId),
  FOREIGN KEY (carritoId) REFERENCES Carrito(id),
  FOREIGN KEY (itemId) REFERENCES Item(id)
)

CREATE TABLE Item (
  id int NOT NULL,
  cantidad int,
  name varchar(255),
  productoId int,
  PRIMARY KEY (id),
  FOREIGN KEY (productoId) REFERENCES Producto(id)
)
