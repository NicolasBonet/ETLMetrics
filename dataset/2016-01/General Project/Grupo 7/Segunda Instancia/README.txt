/*******************************************************************************************
* README: REALIZADO POR DIEGO PRIETO Y DAVID SAAVEDRA                                      *
*******************************************************************************************/

1.) Importe los launch
->En eclipse seleccione file
->Seleccione Import
->Seleccione Run/debug
->Seleccion launch configurations
->Seleccione Browse y busque la carpeta LaunchConfig del proyecto
->Seleccione finish

2.)Ejecucion del generador
->seleccione en la carpeta M2M  SQL2JAVA.etl de click derecho
->seleccione run As 
->Seleccione run configurations
->En ETLTransformation seleccione SQL2JAVA
->Seleccione Run
->En la carpeta M2T seleccione main.egl de click derecho y seleccione run As
-> Seleccione EGL Template JAVA2TEXT 
->Click en run

3.) En la carpeta generated observara el código generado


/**************************************************************************************************
* CONSIDERACIONES Y PENDIENTES                                                                                 *
***************************************************************************************************
-> Faltan por generar los getEntity del MarcketPlace (uno por cada entidad)
-> Falta generar correctamente el método editar 
-> verificacion del test editar(ya que no está bien realizado)

/************************************************************************************************
*CONCLUSIONES Y DUDAS TÉCNICAS                                                                    *
************************************************************************************************/
-> ¿Existe una metodología para definir de manera más clara los mappings entre modelos?
->¿Hasta que punto es necesario un M2M y un M2T para la generacion de código teniendo en cuenta que la complejidad de los metodos al momento de 
  la generación del M2T es mucho mayor y por esta razon la transformacion no está reduciendo la complejidad?