      *----------------------------------------------------------------*
      * COPY    : CN255K                                               *
      * ARCHIVO : ARCHIVO DE TRANSACCIONES DE CNBS                     *
      * LONGITUD: 2000                                                 *
      * CREACION: 18 DE JUNIO DE 2014                                  *
      * AUTOR   : ANGEL DANIEL BARRERA                                 *
      *----------------------------------------------------------------*
       02 CNF255K.
           03 CN25-LLAVE.
              05 CN25-NUM-CTA             PIC 9(16).
              05 CN25-NUM-TRANSAC         PIC 9(16).
              05 CN25-TIP-TRANSAC         PIC X(03).
           03 CN25-NOTIFICACION           PIC X(100).
           03 CN25-DESCRP-TRANSAC         PIC X(100).
           03 CN25-NOMB-ARCH-CARG         PIC X(100).
           03 CN25-NOMBRE-RED             PIC X(100).
           03 FILLER                      PIC X(1565).