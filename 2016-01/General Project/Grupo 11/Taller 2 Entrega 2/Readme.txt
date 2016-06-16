


1. La gramática del ciclo 3 del Taller 1 se encuentra en la carpeta Gramatica Xtext SQL.

2. El metamodelo de Java se encuentra en la carpeta Metamodelo Java.

3. Los ETL que corresponden a la transformación M2M se encuentran en la carpeta ETL Transformacion.

4. Los EGL que corresponde a la transformación M2T se encuentran en la carpeta EGL Transformacion.

5. El launch config para ejecutar la transformacione M2M se encuentra en la carpeta ETL Transformacion. El launch config para ejecutar la transformacione M2T se encuentra en la carpeta EGL Transformacion.

6. El proyecto generado se crea en la siguiente ruta: C:\Proyecto\co.edu.uniandes.sqlcrud

7. Si al importar el proyecto generado no le aparecen las Maven dependencies de click derecho sobre el proyecto, seleccione la opción Maven y seleccione la opción Update Project. Si aparecen las Maven dependencies, ignore este punto.


Nota: El archivo de entrada de la gramatica SQL fue modificado para que correspondiera con las clases del proyecto de ejemplo ya que este tiene algunos errores:


	-> La línea: FOREIGN KEY (productoId) REFERENCES Product(id)   la palabra Product debe ser Producto

	-> la línea: CREATE TABLE Carritoitem   la palabra Carritoitem debe ser CarritoItem

	-> En la tabla Carritoitem le falta la columna id


