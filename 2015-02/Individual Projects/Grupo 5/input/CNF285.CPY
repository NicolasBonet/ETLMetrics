      *----------------------------------------------------------------*
      * COPY    : CN285K                                               *
      * ARCHIVO : ARCHIVO DE PARAMETRIZACION DE MOVIMIENTOS (CNBS)     *
      * LONGITUD: 2000                                                 *
      * CREACION: 19 DE JUNIO DE 2014                                  *
      * AUTOR   : ANGEL DANIEL BARRERA                                 *
      *----------------------------------------------------------------*
       02 CNF285K.
           03 CN28-LLAVE.
              05 CN28-NUM-CTA             PIC 9(16).
           03 CN28-DATOS-TRX.
              05 CN28-DISP                PIC X(03).
              05 CN28-LOCALIZACION        PIC X(01).
              05 CN28-ORIGEN              PIC X(03).
              05 CN28-APLIC-ORIGEN        PIC X(02).
              05 CN28-APLIC-DEST          PIC X(02).
           03 CN28-RED-ADQUIR             PIC X(02).
           03 CN28-COD-ADQUI              PIC 9(02).
           03 CN28-NUM-DISPOSITIVO        PIC X(04).
           03 CN28-DESCRIPCION            PIC X(100).
           03 CN28-IND-ENCRIPCION         PIC X(01).
           03 CN28-LLAVE-ENCRP            PIC X(09).
           03 FILLER                      PIC X(1855).
