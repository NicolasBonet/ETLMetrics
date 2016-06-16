CREATE TABLE Bodega(
	id int NOT NULL,
	nombre varchar(255),
	PRIMARY KEY (id)
)

CREATE TABLE Producto(
	id int NOT NULL,
	nombre varchar(255),
	descripcion varchar(255),
	PRIMARY KEY (id)
)

CREATE TABLE SaldoBodega(
	id int NOT NULL,
	idBodega int,
	idProducto int,
	cantidad int,
	PRIMARY KEY (id),
	FOREIGN KEY (idBodega) REFERENCES Bodega(id),
	FOREIGN KEY (idProducto) REFERENCES Producto(id)
)

CREATE TABLE Cliente(
	id int NOT NULL,
	nombre varchar(255),
	PRIMARY KEY (id)
)
