       IDENTIFICATION DIVISION.                                         
       PROGRAM-ID.   RDK08301.                                          
      * AUTOR    :   ANGEL DANIEL BARRERA P.                            
      * OBJETIVO :   CONSULTAR Y VALIDAR CLIENTE PARA SEGUROS VOLUNTARIO
      *              PARA TARJETAS DE CREDITO
      *              FORMATEADOR PARA INTRANET HAC
      *              COPIA DEL RDK08301.
      *----------------------------------------------------------------
      * NRO SOL: REQPR00172661
      * FECHA  : MARZO DE 2015
      * AUTOR  : ANGEL DANIEL BARRERA P.
      * DESCRIP: CONSULTAR Y VALIDAR CLIENTE PARA SEGUROS VOLUNTARIO TC
      *----------------------------------------------------------------
      * REQ    :
      * FECHA  :
      * AUTOR  :
      * DESCR  :
      *----------------------------------------------------------------
       ENVIRONMENT DIVISION.                                            
       CONFIGURATION SECTION.                                           
       SOURCE-COMPUTER.        IBM-9672.                                
       OBJECT-COMPUTER.        IBM-9672.                                
       DATA DIVISION.                                                   
       WORKING-STORAGE SECTION.                                         
                                                                        
      * ------ PARAMETROS RUTINA MANEJO DE ERRORES -----
       01  SOC300-SALIDA.
           COPY 'SOY300'.


       01 NUM-USU PIC X(13) JUSTIFIED RIGHT.

       01 AREA-RD64.                                                    
           02 RD64-ENTRADA.
              03 RD64-USUARIO                PIC  9(13).
              03 RD64-TIP-IDE                PIC  X(01).
              03 RD64-NUM-IDE                PIC  9(16).
              03 RD64-NUM-OFI                PIC  9(03).
              03 RD64-TIP-OPE                PIC  9(01).
                 88 RD64-VAL-SEG VALUE 1.
                 88 RD64-SOL-DAT VALUE 2.
              03 FILLER                      PIC  X(4062).

           02 RD64-SALIDA.
              03 RD64-COD-RESP               PIC 9(04).
              03 RD64-DES-RESP               PIC X(60).
              03 RD64-PRI-APELLIDO           PIC X(20).
              03 RD64-SEG-APELLIDO           PIC X(20).
              03 RD64-PRI-NOMBRE             PIC X(20).
              03 RD64-SEG-NOMBRE             PIC X(20).
              03 RD64-FEC-NAC                PIC 9(08).
              03 RD64-IND-SEX                PIC X(01).
              03 RD64-COD-CIIU               PIC 9(04).
              03 RD64-CIU-RES                PIC 9(05).
              03 RD64-NOM-CIU-RES            PIC X(50).
              03 RD64-COD-DPT                PIC 9(05).
              03 RD64-NOM-COD-DPT            PIC X(50).
              03 RD64-DIR-RES                PIC X(100).
              03 RD64-TEL-RES                PIC 9(10).
              03 RD64-OFI-FUN                PIC 9(03).
              03 RD64-NOM-OFI                PIC X(50).
              03 RD64-TC.
                 04 RD64-TARJETAS OCCURS 30  TIMES.
                    05 RD64-NUM-TC           PIC 9(16).
                    05 RD64-TIP-TC           PIC X(50).
              03 FILLER                      PIC X(1686).

       01  WK-ERRORES.
           02 WK-ERR-NORMAL PIC X(6) VALUE X'000000000000'.
           02 WK-ERR-NOTFND PIC X(6) VALUE X'810000000000'.
           02 WK-ERR-NOTOPE PIC X(6) VALUE X'0F0000000000'.
           02 WK-ERR-PROERR PIC X(6) VALUE X'270000000000'.
           02 WK-ERR-NOTOPE PIC X(6) VALUE X'0C0000000000'.
           02 WK-ERR-INVREQ PIC X(6) VALUE X'080000000000'.
           02 WK-ERR-DUPREC PIC X(6) VALUE X'820000000000'.


       LINKAGE SECTION.                                                 
       01  DFHCOMMAREA.                                                 
           02 RD63-ENTRADA.
              03 RD63-TRN                    PIC  X(04).
              03 RD63-USUARIO                PIC  X(13).
              03 RD63-CLAVE                  PIC  X(08).
              03 RD63-MONITOR                PIC  X(02).
              03 RD63-TRANSACCION            PIC  9(06).
              03 FILLER                      PIC  X(20).
              03 RD63-TIP-IDE                PIC  X(01).
              03 RD63-NUM-IDE                PIC  9(16).
              03 RD63-NUM-OFI                PIC  9(03).
              03 FILLER                      PIC  X(4023).

           02 RD63-SALIDA.
              03 RD63-COD-RESP               PIC 9(04).
              03 RD63-DES-RESP               PIC X(60).
              03 RD63-PRI-APELLIDO           PIC X(20).
              03 RD63-SEG-APELLIDO           PIC X(20).
              03 RD63-PRI-NOMBRE             PIC X(20).
              03 RD63-SEG-NOMBRE             PIC X(20).
              03 RD63-FEC-NAC                PIC 9(08).
              03 RD63-IND-SEX                PIC X(01).
              03 RD63-COD-CIIU               PIC 9(04).
              03 RD63-CIU-RES                PIC 9(05).
              03 RD63-NOM-CIU-RES            PIC X(50).
              03 RD63-COD-DPT                PIC 9(05).
              03 RD63-NOM-COD-DPT            PIC X(50).
              03 RD63-DIR-RES                PIC X(100).
              03 RD63-TEL-RES                PIC 9(10).
              03 RD63-OFI-FUN                PIC 9(03).
              03 RD63-NOM-OFI                PIC X(50).
              03 RD63-TC.
                 04 RD63-TARJETAS OCCURS 30  TIMES.
                    05 RD63-NUM-TC           PIC 9(16).
                    05 RD63-TIP-TC           PIC X(50).
              03 FILLER                      PIC X(1686).

       PROCEDURE DIVISION.

           PERFORM 010-INICIALIZAR     THRU 010-FIN.
           PERFORM 020-PROCESO         THRU 020-FIN.
           PERFORM 030-TERMINAR        THRU 030-FIN.

       010-INICIALIZAR.

           EXEC CICS HANDLE ABEND
                    LABEL(990-ERROR-SISTEMA)
           END-EXEC.

           INITIALIZE RD63-SALIDA.

       010-FIN.
           EXIT.

       020-PROCESO.
           INITIALIZE AREA-RD64
           UNSTRING RD63-USUARIO DELIMITED BY ' '
                                 INTO NUM-USU
           INSPECT NUM-USU REPLACING ALL ' ' BY '0'

           MOVE NUM-USU      TO RD64-USUARIO
           MOVE RD63-TIP-IDE TO RD64-TIP-IDE
           MOVE RD63-NUM-IDE TO RD64-NUM-IDE
           MOVE RD63-NUM-OFI TO RD64-NUM-OFI
           MOVE 1            TO RD64-TIP-OPE

           EXEC CICS LINK
                     PROGRAM('RDK08401')
                     COMMAREA(AREA-RD64)
                     LENGTH(LENGTH OF AREA-RD64)
           END-EXEC.

           MOVE RD64-SALIDA TO RD63-SALIDA.

       020-FIN.
           EXIT.


       990-ERROR-SISTEMA.                                               
           CALL 'SOC300' USING DFHEIBLK RETURNING SOC300-SALIDA.
           MOVE 999                           TO RD63-COD-RESP.         
           MOVE SOC300-SALIDA                 TO RD63-DES-RESP.         
           PERFORM 030-TERMINAR THRU 030-FIN.                           
       990-FIN.                                                         
           EXIT.                                                        
                                                                        
       030-TERMINAR.                                                    
           EXEC CICS RETURN END-EXEC.                                   
       030-FIN.                                                         
           EXIT.                                                        