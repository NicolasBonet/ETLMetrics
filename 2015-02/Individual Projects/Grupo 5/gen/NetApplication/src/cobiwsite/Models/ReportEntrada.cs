namespace cobiwsite.Models
{
    using System;
    using System.Collections.Generic;
    
    public class ReportEntrada
    {
    
		public string TRN { get; set; }
		public string USUARIO { get; set; }
		public string CLAVE { get; set; }
		public string MONITOR { get; set; }
		public int TRANSACCION { get; set; }
		public string FILLER1 { get; set; }
		public string TIP_IDE { get; set; }
		public int NUM_IDE { get; set; }
		public int NUM_OFI { get; set; }
		public string FILLER2 { get; set; }
  
    }
}