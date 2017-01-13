=========================================================
Readme GeneradorCruds
=========================================================

¿Cómo ejecutar el generador?

1. Importar los proyectos de la gramatica en Eclipse.
	*Luego hacer "Register EPackage" del metamodelo de la gramatica "SQL.ecore"

2. Ejecutar una segunda instancia de eclipse a partir del proyceto de la gramatica.
Dando clic derecho sobre la gramatica importada >>Run As>> Eclipse aplication ( de acuerdo al tutorial de correr la segunda instancia)

3. En la segunda instancia de eclipse importar el proyecto "GeneradorCruds".  
	*Luego hacer "Register EPackages" del metamodelo "mmJavaMinimalista.ecore" en la carpeta /metamodels 

4.Utilizar los archivos .launch incluidos en el "GeneradorCruds" para ejecutar:
	4.1. Primero la transformacion M2M llamada masterSql2Java.etl
	4.2. Luego la transformacion M2T llamada masterJava2Text.egl


Cómo probar lo generado

1. Eliminar la carpeta "co.edu.uniandes.sqlcrud" dentro de la carpeta /generado que representa el proyecto java. (sin eliminar la carpeta llamada "generado")

2. Correr la transformacion masterSql2Java.etl descrita por el launch masterSql2Java.launch

3. Correr la transformacion masterSql2Java.etl descrita por el launch materJava2Text.launch

4. Importar en un eclipse (tal vez con otro workspace) el contenido de la carpeta /generado/co.edu.uniandes.sqlcrud y provar mavenTest y junitTests

Nota: 
- Los contenidos de los metamodelos utlizados estan en la carpeta /metamodels (ademas del metamodelo de la gramatica)
- Los contenidos de los modelos utlizados para las transformaciones estan en la carpeta /models 

