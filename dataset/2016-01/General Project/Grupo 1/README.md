Java Cruds Con MDE
=========================================================

Esta es una combinación de proyectos basados en MDE ([Model-Driven Engineering](https://en.wikipedia.org/wiki/Model-driven_engineering)])
utilizando las herramientas gratuitas que proporciona [Eclipse Modeling Framework](https://eclipse.org/modeling/emf/),
para generar un CRUD sencillo a partir de la definición de una base de datos SQL.

### Requisitos

* [Eclipse Modeling Tools] (http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/mars1)
* [Epsilon] (http://download.eclipse.org/epsilon/updates/)
* [Xtext] (http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/)

### Transformación Texto A Modelo

La transformación T2M se realiza a través de una gramática [XText](https://eclipse.org/Xtext/) que interpreta un
archivo SQL y genera un metamodelo que describe la base de datos.

![Metamodelo SQL](https://raw.githubusercontent.com/MaxCruz/crud_maker/master/sQL%20class%20diagram.jpg)

Importe los siguientes proyectos Xtext en Eclipse.

File->Import->General->Existing Projects Into Workspace

- org.uniandes.xtext
- org.uniandes.xtext.ide
- org.uniandes.xtext.tests
- org.uniandes.xtext.ui
- org.uniandes.xtext.ui.tests

La gramática XText del generador se encuentra definida en el archivo __org.uniandes.xtext/src/org.uniandes.xtext/SQL.xtext__

Luego hacer click derecho en el metamodelo de la gramática __org.uniandes.xtext/model/generated/SQL.ecore__ y seleccionar la opción __Register EPackage__

### Transformación Modelo A Modelo

A través de [ETL](http://www.eclipse.org/epsilon/doc/etl/) se realiza la transformación del
metamodelo de SQL a un metamodelo minimalista de Java que facilita la generación del Crud

![Metamodelo Java Minimalista](https://raw.githubusercontent.com/MaxCruz/crud_maker/master/mmJavaMinimalista%20class%20diagram.jpg)

Ejecute una segunda instancia de Eclipse, utiliando el launch __CrudGenerator.launch__ almacenado en el proyecto __org.uniandes.xtext__

En la segunda instancia de Eclipse, importar el proyecto "GeneradorCruds".

Luego hacer click derecho en el metamodelo minimalista de Java __mmJavaMinimalista.ecore__ y seleccionar __Register EPackages__

Correr la transformacion masterSql2Java.etl descrita por el launch masterSql2Java.launch

Esto va a generar un modelo en la carpeta __models__ llamado __java.xmi__, el cual es conforme al metamodelo descrito anteriormente

### Generación Modelo A Texto

La generación del crud se hace a través de una transformación [EGL](http://www.eclipse.org/epsilon/doc/egl/)
la cual utiliza como entrada el modelo __java.xmi__ para crea unas entidades JPA básicas y sus pruebas unitarias


Si existe, eiminar la carpeta __co.edu.uniandes.sqlcrud__ dentro de la carpeta /generado que representa el proyecto java.
(solo eliminar la sub carpeta y dejar __generado__)

Correr la transformacion masterSql2Java.etl descrita por archivo materJava2Text.launch

Esto debe crear una carpeta llamada __generado__ dentro del proyecto, la cual contiene todo el código del crud

### Probar el código generado

Para probar el código que genramos, podemos utilizar una nueva ejecución de [Eclipse JEE](http://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/mars2)

Importar la carpeta co.edu.uniandes.sqlcrud como proyecto dentro del Workspace

Maven se encargá de construir y descargar todas las dependencias que necesitemos

Click derecho sobre el proyecto y correr __maven Test__ junto con __jUnit Tests__ para probar los resultados

### Referencias

[The Epsilon Book] (http://www.eclipse.org/epsilon/doc/book/)
