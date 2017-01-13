      *==============================================================*
      * AUTHOR    : Grupo 5 COBIW.                         *
      * TEMA      : Tramsformaciones ETL y EGL.                          *
      * OBJETIVO  : Generar Codigo Cobol.                      *
      *           :									                 *
      * FECHA     : 30 DE NOVIEMBRE DE 2015                          *
      * NRO REQ   : Req00001.                     *
      *==============================================================*

      *==============================================================*
      * REMARKS           LOG DE MODIFICACIONES                      *
      *==============================================================*
      * NRO REQ:                                                     *
      * FECHA  :                                                     *
      * AUTOR  :                                                     *
      * DESCRIP:                                                     *
      *==============================================================*
       IDENTIFICATION DIVISION.
       PROGRAM-ID.   RDB457.
       AUTHOR.       Grupo 5 COBIW
       DATE-WRITTEN.  30 DE NOVIEMBRE DE 2015           
      *---------------------------------------------------------------*
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.

           SELECT  CN255SE     ASSIGN TO SYS001-CN255SE
                               FILE STATUS ES-CN255SE.

           SELECT  CN285SE     ASSIGN TO SYS002-CN285SE
                               FILE STATUS ES-CN285SE.

           SELECT  RD457SS     ASSIGN TO SYS003-RD457SS
                               FILE STATUS ES-RD457SS.

       DATA DIVISION.
       FILE SECTION.

       FD  CN255SE.
       01  REG-CN255SE.
		   03 LLAVE.
			  05 CN255SE-NUM-CTA		PIC 9(16).
			  05 CN255SE-NUM-TRANSAC		PIC 9(16).
			  05 CN255SE-TIP-TRANSAC		PIC X(3).
		   03 CN255SE-NOTIFICACION		PIC X(100).
		   03 CN255SE-DESCRP-TRANSAC		PIC X(100).
		   03 CN255SE-NOMB-ARCH-CARG		PIC X(100).
		   03 CN255SE-NOMBRE-RED		PIC X(100).
		   
   
       FD  CN285SE.
       01  REG-CN285SE.
       	   03 LLAVE.
			  05 CN285SE-NUM-CTA		PIC 9(16).
       	   03 DATOS-TRX.
			  05 CN285SE-DISP		PIC X(3).
			  05 CN285SE-LOCALIZACION		PIC X(1).
			  05 CN285SE-ORIGEN		PIC X(3).
			  05 CN285SE-APLIC-ORIGEN		PIC X(2).
			  05 CN285SE-APLIC-DEST		PIC X(2).
       	   03 CN285SE-RED-ADQUIR		PIC X(2).
       	   03 CN285SE-COD-ADQUI		PIC 9(2).
       	   03 CN285SE-NUM-DISPOSITIVO		PIC X(4).
       	   03 CN285SE-DESCRIPCION		PIC X(100).
       	   03 CN285SE-IND-ENCRIPCION		PIC X(1).
       	   03 CN285SE-LLAVE-ENCRP		PIC X(9).
       	   

       FD  RD457SS.
       01  REG-RD457SS.
		   03 RD457SS-NUM-CTA	PIC 9(16).
		   03 RD457SS-NUM-TRANSAC	PIC 9(16).
		   03 RD457SS-TIP-TRANSAC	PIC X(3).
		   03 RD457SS-NOMB-ARCH-CARG	PIC X(100).
		   03 RD457SS-NOMBRE-RED	PIC X(100).
		   03 RD457SS-RED-ADQUIR	PIC X(2).
	   
	   WORKING-STORAGE SECTION.

       01  WK-VARIABLES.
           03  ES-CN255SE                   PIC   X(02).
           03  ES-CN285SE                   PIC   X(02).
           03  ES-RD457SS                   PIC   X(02).
           03  SW-FINAL                     PIC   9(01).
           03  SW-FIN                       PIC   9(01).
           03  ST-PROGRAMA                  PIC   9(01).
           03  WK-LEIDOS                    PIC   9(10).
           03  WK-LEIDOS-CIFIN              PIC   9(10).
           03  WK-GRABADOS                  PIC   9(10).
           03  WK-LLAVE1.
		   		05 WK-CN25-NUM-CTA		PIC 9(16).
		   03  WK-LLAVE2.
		   		05 WK-CN28-NUM-CTA		PIC 9(16).

       01  WK-FECHA                         PIC       9(8).
       01  WK-HORA                          PIC       9(8).
       01  WK-FECHA-SISTEMA                 PIC       9(8).
       01  WK-FECHA-SISTEMA-R               REDEFINES WK-FECHA-SISTEMA.
           05  WK-SISTEMA-ANO               PIC       9(4).
           05  WK-SISTEMA-MES               PIC       9(2).
           05  WK-SISTEMA-DIA               PIC       9(2).

      *------------------*
       PROCEDURE DIVISION.
      *------------------*

           PERFORM 100-INICIALIZAR THRU 100-FIN.
           PERFORM 200-PROCESO     THRU 200-FIN
                   UNTIL SW-FINAL = 1 OR SW-FIN = 1.
           MOVE 1                  TO   ST-PROGRAMA.
           PERFORM 990-FINALIZAR   THRU 990-FIN.

       100-INICIALIZAR.

           CALL    'GEC002'    USING     WK-FECHA
           MOVE    WK-FECHA    TO        WK-FECHA-SISTEMA
           ACCEPT  WK-HORA     FROM      TIME
           DISPLAY 'FECHA  : ' WK-FECHA
           DISPLAY 'HORA   : ' WK-HORA

           OPEN INPUT  CN255SE.
           IF   ES-CN255SE = '97'
                MOVE '00'  TO ES-CN255SE.
           IF   ES-CN255SE NOT = '00'
                DISPLAY 'ERROR AL ABRIR ARCHIVO CN255SE ' ES-CN255SE
                MOVE    999  TO RETURN-CODE
                PERFORM  990-FINALIZAR THRU 990-FIN.

           OPEN INPUT  CN285SE.
           IF   ES-CN285SE = '97'
                MOVE '00'  TO ES-CN285SE.
           IF   ES-CN285SE NOT = '00'
                DISPLAY 'ERROR AL ABRIR ARCHIVO CN285SE ' ES-CN285SE
                MOVE     999  TO RETURN-CODE
                PERFORM  990-FINALIZAR THRU 990-FIN.

           OPEN OUTPUT RD457SS.
           IF  ES-RD457SS NOT = '00' AND '97'
               DISPLAY 'ERROR AL ABRIR ARCHIVO RD457SS ' ES-RD457SS
               MOVE     999           TO   RETURN-CODE
               PERFORM  990-FINALIZAR THRU 990-FIN.

           INITIALIZE  WK-VARIABLES.
           PERFORM 210-LEER-CN255SE   THRU 210-FIN.
           PERFORM 220-LEER-CN285SE   THRU 220-FIN.

       100-FIN.
           EXIT.

       200-PROCESO.

           IF WK-LLAVE1 = WK-LLAVE2 
		   		MOVE CN255SE-NUM-CTA		 TO RD457SS-NUM-CTA
				MOVE CN255SE-NUM-TRANSAC		 TO RD457SS-NUM-TRANSAC
				MOVE CN255SE-TIP-TRANSAC		 TO RD457SS-TIP-TRANSAC
		   		MOVE CN255SE-NOMB-ARCH-CARG		 TO RD457SS-NOMB-ARCH-CARG
		   		MOVE CN255SE-NOMBRE-RED		 TO RD457SS-NOMBRE-RED
		   		MOVE CN285SE-RED-ADQUIR		 TO RD457SS-RED-ADQUIR
             
              PERFORM 300-GRABAR-RD457SS      THRU 300-FIN
              PERFORM 210-LEER-CN255SE                THRU 210-FIN
              PERFORM 220-LEER-CN285SE                THRU 220-FIN
           ELSE
              IF WK-LLAVE1 < WK-LLAVE2
                 PERFORM 210-LEER-CN255SE     THRU 210-FIN
              ELSE
                IF WK-LLAVE1 > WK-LLAVE2
                   PERFORM 220-LEER-CN285SE   THRU 220-FIN
                END-IF
              END-IF
           END-IF.

       200-FIN.
           EXIT.

       210-LEER-CN255SE.

           READ CN255SE

           IF ES-CN255SE = '00'
		   		MOVE CN255SE-NUM-CTA		 TO WK-CN25-NUM-CTA
              ADD 1 TO WK-LEIDOS-CIFIN
           ELSE
            IF ES-CN255SE = '10' OR '46'
              MOVE 1 TO SW-FINAL
            ELSE
               DISPLAY 'ERROR AL LEER ARCHIVO CN255SE ' ES-CN255SE
               MOVE     999           TO   RETURN-CODE
               PERFORM  990-FINALIZAR THRU 990-FIN.

       210-FIN.
           EXIT.

       220-LEER-CN285SE.

           READ CN285SE

           IF ES-CN285SE = '00'
		   		MOVE CN285SE-NUM-CTA		 TO WK-CN28-NUM-CTA
              ADD 1 TO WK-LEIDOS
           ELSE
            IF ES-CN285SE = '10'
              MOVE 1   TO SW-FIN
            ELSE
               DISPLAY 'ERROR AL LEER ARCHIVO CN285SE ' ES-CN285SE
               MOVE     999           TO   RETURN-CODE
               PERFORM  990-FINALIZAR THRU 990-FIN.

       220-FIN.
           EXIT.

       300-GRABAR-RD457SS.

           WRITE REG-RD457SS.

           IF ES-RD457SS = '00'
              ADD  1 TO WK-GRABADOS
           ELSE
              DISPLAY 'ERROR AL GRABAR RD457SS ' ES-RD457SS
              MOVE     999            TO   RETURN-CODE
              PERFORM  990-FINALIZAR  THRU 990-FIN.

       300-FIN.
           EXIT.

       990-FINALIZAR.

              DISPLAY '--------------------------------------'
              DISPLAY '     PROG. RDB457 TERMINO NORMAL      '                     
              DISPLAY '--------------------------------------'
              DISPLAY 'REGS. LEIDOS EN CN255SE    : ' WK-LEIDOS-CIFIN
              DISPLAY 'REGS. LEIDOS EN CN285SE    : ' WK-LEIDOS
              DISPLAY 'REGS. ACTUALIZADOS RD457SS : ' WK-GRABADOS
              DISPLAY '--------------------------------------'.

           CLOSE CN255SE.
           CLOSE CN285SE.
           CLOSE RD457SS.
           STOP      RUN.

       990-FIN.
           EXIT.
