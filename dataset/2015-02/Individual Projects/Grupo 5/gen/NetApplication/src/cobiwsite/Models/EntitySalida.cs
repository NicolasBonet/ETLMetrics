namespace cobiwsite.Models
{
    using System.ComponentModel.DataAnnotations;
    public class EntitySalida
    {
    
        [Required]
		public int COD_RESP { get; set; }
        [Required]
		public string DES_RESP { get; set; }
        [Required]
		public string PRI_APELLIDO { get; set; }
        [Required]
		public string SEG_APELLIDO { get; set; }
        [Required]
		public string PRI_NOMBRE { get; set; }
        [Required]
		public string SEG_NOMBRE { get; set; }
        [Required]
		public int FEC_NAC { get; set; }
        [Required]
		public string IND_SEX { get; set; }
        [Required]
		public int COD_CIIU { get; set; }
        [Required]
		public int CIU_RES { get; set; }
        [Required]
		public string NOM_CIU_RES { get; set; }
        [Required]
		public int COD_DPT { get; set; }
        [Required]
		public string NOM_COD_DPT { get; set; }
        [Required]
		public string DIR_RES { get; set; }
        [Required]
		public int TEL_RES { get; set; }
        [Required]
		public int OFI_FUN { get; set; }
        [Required]
		public string NOM_OFI { get; set; }
		public string FILLER3 { get; set; }
        [Required]
		public int NUM_TC { get; set; }
        [Required]
		public string TIP_TC { get; set; }
      

    }
}