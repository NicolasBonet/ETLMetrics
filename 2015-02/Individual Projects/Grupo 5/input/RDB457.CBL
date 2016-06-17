      *==============================================================*
      * AUTHOR    : ANGEL DANIEL BARRERA P.                          *
      * TEMA      : MATRICULA DE MANDATARIOS (CNBS)                  *
      * OBJETIVO  : SELECCIONA DEL ARCHIVO DE MOVIMIENTOS DE CUENTAS *
      *           : EL CANAL ASOCIADO A CADA CUENTA                  *
      * FECHA     : 27 DE JUNIO DE 2014                              *
      * NRO REQ   : REQPR00147770                                    *
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
       AUTHOR.       ANGEL DANIEL BARRERA P.
       DATE-WRITTEN. 27 DE JUNIO 2014.
      *---------------------------------------------------------------*
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       INPUT-OUTPUT SECTION.
       FILE-CONTROL.

           SELECT  RD285SE     ASSIGN TO SYS001-RD285SE
                               FILE STATUS ES-RD285SE.

           SELECT  RD255SE     ASSIGN TO SYS002-RD255SE
                               FILE STATUS ES-RD255SE.

           SELECT  RD160SS     ASSIGN TO SYS003-RD160SS
                               FILE STATUS ES-RD160SS.

       DATA DIVISION.
       FILE SECTION.

       FD  RD285SE.
       01  REG-RD285SE.
           03 RD285E-NRO-CUENTA             PIC 9(16).
           03 RD285E-RED-ADQUIRIENTE        PIC X(2).

       FD  RD255SE.
       01  REG-RD255SE.
           03 RD255E-NRO-CUENTA             PIC 9(16).
           03 RD255E-NRO-TRANSACCION        PIC X(04).
           03 RD255E-TIPO-TRANSACCION       PIC X(01).
           03 RD255E-NOM-ARCHIVO-CARG       PIC X(100).
           03 RD255E-NOM-ARCHIVO-RED        PIC X(100).

       FD  RD160SS.
       01  REG-RD160SS.
           03 RD160S-NRO-CUENTA             PIC 9(16).
           03 RD160S-NRO-TRANSACCION        PIC X(04).
           03 RD160S-TIPO-TRANSACCION       PIC X(01).
           03 RD160S-NOM-ARCHIVO-CARG       PIC X(100).
           03 RD160S-RED-ADQUIRIENTE        PIC X(2).
           03 RD160S-NOM-ARCHIVO-RED        PIC X(100).

       WORKING-STORAGE SECTION.

       01  WK-VARIABLES.
           03  ES-RD285SE                   PIC   X(02).
           03  ES-RD255SE                   PIC   X(02).
           03  ES-RD160SS                   PIC   X(02).
           03  SW-FINAL                     PIC   9(01).
           03  SW-FIN                       PIC   9(01).
           03  ST-PROGRAMA                  PIC   9(01).
           03  WK-LEIDOS                    PIC   9(10).
           03  WK-LEIDOS-CIFIN              PIC   9(10).
           03  WK-GRABADOS                  PIC   9(10).

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

           OPEN INPUT  RD285SE.
           IF   ES-RD285SE = '97'
                MOVE '00'  TO ES-RD285SE.
           IF   ES-RD285SE NOT = '00'
                DISPLAY 'ERROR AL ABRIR ARCHIVO RD285SE ' ES-RD285SE
                MOVE    999  TO RETURN-CODE
                PERFORM  990-FINALIZAR THRU 990-FIN.

           OPEN INPUT  RD255SE.
           IF   ES-RD255SE = '97'
                MOVE '00'  TO ES-RD255SE.
           IF   ES-RD255SE NOT = '00'
                DISPLAY 'ERROR AL ABRIR ARCHIVO RD255SE ' ES-RD255SE
                MOVE     999  TO RETURN-CODE
                PERFORM  990-FINALIZAR THRU 990-FIN.

           OPEN OUTPUT RD160SS.
           IF  ES-RD160SS NOT = '00' AND '97'
               DISPLAY 'ERROR AL ABRIR ARCHIVO RD160SS ' ES-RD160SS
               MOVE     999           TO   RETURN-CODE
               PERFORM  990-FINALIZAR THRU 990-FIN.

           INITIALIZE  WK-VARIABLES.
           PERFORM 210-LEER-RD285SE   THRU 210-FIN.
           PERFORM 220-LEER-RD255SE   THRU 220-FIN.

       100-FIN.
           EXIT.

       200-PROCESO.

           IF RD285E-NRO-CUENTA = RD255E-NRO-CUENTA
              MOVE RD285E-RED-ADQUIRIENTE     TO RD160S-RED-ADQUIRIENTE
              MOVE RD255E-NRO-CUENTA          TO RD160S-NRO-CUENTA
              MOVE RD255E-NRO-TRANSACCION     TO RD160S-NRO-TRANSACCION
              MOVE RD255E-TIPO-TRANSACCION    TO RD160S-TIPO-TRANSACCION
              MOVE RD255E-NOM-ARCHIVO-CARG    TO RD160S-NOM-ARCHIVO-CARG
              MOVE RD255E-NOM-ARCHIVO-RED     TO RD160S-NOM-ARCHIVO-RED

              PERFORM 300-GRABAR-RD160SS      THRU 300-FIN
              PERFORM 220-LEER-RD255SE        THRU 220-FIN
           ELSE
              IF RD285E-NRO-CUENTA < RD255E-NRO-CUENTA
                 PERFORM 210-LEER-RD285SE     THRU 210-FIN
              ELSE
                IF RD285E-NRO-CUENTA > RD255E-NRO-CUENTA
                   PERFORM 220-LEER-RD255SE   THRU 220-FIN
                END-IF
              END-IF
           END-IF.

       200-FIN.
           EXIT.

       210-LEER-RD285SE.

           READ RD285SE

           IF ES-RD285SE = '00'
              ADD 1 TO WK-LEIDOS-CIFIN
           ELSE
            IF ES-RD285SE = '10' OR '46'
              MOVE 1 TO SW-FINAL
            ELSE
               DISPLAY 'ERROR AL LEER ARCHIVO RD285SE ' ES-RD285SE
               MOVE     999           TO   RETURN-CODE
               PERFORM  990-FINALIZAR THRU 990-FIN.

       210-FIN.
           EXIT.

       220-LEER-RD255SE.

           READ RD255SE

           IF ES-RD255SE = '00'
              ADD 1 TO WK-LEIDOS
           ELSE
            IF ES-RD255SE = '10'
              MOVE 1   TO SW-FIN
            ELSE
               DISPLAY 'ERROR AL LEER ARCHIVO RD255SE ' ES-RD255SE
               MOVE     999           TO   RETURN-CODE
               PERFORM  990-FINALIZAR THRU 990-FIN.

       220-FIN.
           EXIT.

       300-GRABAR-RD160SS.

           WRITE REG-RD160SS.

           IF ES-RD160SS = '00'
              ADD  1 TO WK-GRABADOS
           ELSE
              DISPLAY 'ERROR AL GRABAR RD160SS ' ES-RD160SS
              MOVE     999            TO   RETURN-CODE
              PERFORM  990-FINALIZAR  THRU 990-FIN.

       300-FIN.
           EXIT.

       990-FINALIZAR.

              DISPLAY '--------------------------------------'
              DISPLAY '     PROG. RDB457 TERMINO NORMAL      '
              DISPLAY '--------------------------------------'
              DISPLAY 'REGS. LEIDOS EN RD285SE    : ' WK-LEIDOS-CIFIN
              DISPLAY 'REGS. LEIDOS EN RD255SE    : ' WK-LEIDOS
              DISPLAY 'REGS. ACTUALIZADOS RD160SS : ' WK-GRABADOS
              DISPLAY '--------------------------------------'.

           CLOSE RD285SE.
           CLOSE RD255SE.
           CLOSE RD160SS.
           STOP      RUN.

       990-FIN.
           EXIT.