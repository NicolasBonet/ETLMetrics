namespace cobiwsite.Models
{
    using System;
    using System.Collections.Generic;
    
    public class ReportSalida
    {
    
		public int COD_RESP { get; set; }
		public string DES_RESP { get; set; }
		public string PRI_APELLIDO { get; set; }
		public string SEG_APELLIDO { get; set; }
		public string PRI_NOMBRE { get; set; }
		public string SEG_NOMBRE { get; set; }
		public int FEC_NAC { get; set; }
		public string IND_SEX { get; set; }
		public int COD_CIIU { get; set; }
		public int CIU_RES { get; set; }
		public string NOM_CIU_RES { get; set; }
		public int COD_DPT { get; set; }
		public string NOM_COD_DPT { get; set; }
		public string DIR_RES { get; set; }
		public int TEL_RES { get; set; }
		public int OFI_FUN { get; set; }
		public string NOM_OFI { get; set; }
		public string FILLER3 { get; set; }
		public int NUM_TC { get; set; }
		public string TIP_TC { get; set; }
  
    }
}