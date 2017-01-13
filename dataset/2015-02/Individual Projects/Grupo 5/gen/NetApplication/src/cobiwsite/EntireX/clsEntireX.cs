namespace cobiwsite.EntireX
{
    using System;
    using System.Collections.Generic;

    class clsEntireX
    {
        private int records = 10;
        public string Programa { get; set; }
        public string Usuario { get; set; }
        public string Clave { get; set; }
        public string Monitor { get; set; }
        public string CodTransaccion { get; set; }

        private List<string> CamposString = new List<string>();

        private List<string> CamposInteger = new List<string>();

        public clsEntireX(string programa, string usuario, string clave, string monitor, string codTransaccion)
        {
            this.Programa = programa;
            this.Usuario = usuario;
            this.Clave = clave;
            this.Monitor = monitor;
            this.CodTransaccion = codTransaccion;
            this.Campo = new IndexerCampo(this.CamposInteger, this.CamposString);
        }

        public void AddCampoNumero(string nombre, int tamano, int decimales, bool requerido, ebxIO tipo)
        {
            this.CamposString.Add(nombre);
        }

        public void AddCampoTexto(string nombre, int tamano, ebxIO tipo)
        {
            this.CamposInteger.Add(nombre);
        }

        public IndexerCampo Campo { get; set; }



        public void consultaEntireX(string config)
        {
            
        }

        public bool MoreRecords
        {
            get
            {
                return --this.records > 0;
            }
        }
    }


    class IndexerCampo
    {

        private List<string> CamposString;

        private List<string> CamposInteger;

        public IndexerCampo(List<string> CamposString, List<string> CamposInteger)
        {
            this.CamposInteger = CamposInteger;
            this.CamposString = CamposString;
        }


        public FieldValue this[string index]
        {
            get
            {
                object valor;

                if (this.CamposInteger.Contains(index))
                {
                    valor = 7362;
                }
                else
                {
                    valor = "test value";
                }

                return new FieldValue() { Valor = valor };
            }
            set
            {
            }
        }
    }
    
    class FieldValue
    {
        public object Valor { get; set; } 
    }


    enum ebxIO
    {
        SoloSalida,
        SoloEntrada,
        EntradaSalida
    }

}
