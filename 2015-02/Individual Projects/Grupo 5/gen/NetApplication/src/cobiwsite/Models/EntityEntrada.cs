namespace cobiwsite.Models
{
    using System.ComponentModel.DataAnnotations;
    public class EntityEntrada
    {
    
        [Required]
		public string TRN { get; set; }
        [Required]
		public string USUARIO { get; set; }
        [Required]
		public string CLAVE { get; set; }
        [Required]
		public string MONITOR { get; set; }
        [Required]
		public int TRANSACCION { get; set; }
		public string FILLER1 { get; set; }
        [Required]
		public string TIP_IDE { get; set; }
        [Required]
		public int NUM_IDE { get; set; }
        [Required]
		public int NUM_OFI { get; set; }
		public string FILLER2 { get; set; }
      

    }
}