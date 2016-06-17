using System.Web.Mvc;
using cobiwsite.Models;

namespace cobiwsite.Controllers
{
    using System;
    using System.Configuration;

    using cobiwsite.EntireX;

    public class EntitiesController : Controller
    {
        // GET: Entities
        public ActionResult Query()
        {
            return this.View();
        }


        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Query(EntityEntrada entity)
        {
            var usuarioCookie = this.Request.Cookies["usuario"];
            var passwordCookie = this.Request.Cookies["clave"];

            var strUsr = usuarioCookie != null ? usuarioCookie.Value : string.Empty;
            var strPsw = passwordCookie != null ? passwordCookie.Value : string.Empty;
            var strCnfCics = ConfigurationManager.AppSettings["ConfigCICS"];

            var objEntirex = new clsEntireX("GE30", strUsr, strPsw, "GE", "075600");

            // Definición Campos Entrada
            objEntirex.AddCampoTexto("RD63-TRN", 4, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-TRN"].Valor = entity.TRN;
            objEntirex.AddCampoTexto("RD63-USUARIO", 13, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-USUARIO"].Valor = entity.USUARIO;
            objEntirex.AddCampoTexto("RD63-CLAVE", 8, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-CLAVE"].Valor = entity.CLAVE;
            objEntirex.AddCampoTexto("RD63-MONITOR", 2, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-MONITOR"].Valor = entity.MONITOR;
            objEntirex.AddCampoNumero("RD63-TRANSACCION", 6, 0, false, ebxIO.EntradaSalida);
            objEntirex.Campo["RD63-TRANSACCION"].Valor = entity.TRANSACCION;
            objEntirex.AddCampoTexto("FILLER1", 20, ebxIO.EntradaSalida);	
            objEntirex.Campo["FILLER1"].Valor = entity.FILLER1;
            objEntirex.AddCampoTexto("RD63-TIP-IDE", 1, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-TIP-IDE"].Valor = entity.TIP_IDE;
            objEntirex.AddCampoNumero("RD63-NUM-IDE", 16, 0, false, ebxIO.EntradaSalida);
            objEntirex.Campo["RD63-NUM-IDE"].Valor = entity.NUM_IDE;
            objEntirex.AddCampoNumero("RD63-NUM-OFI", 3, 0, false, ebxIO.EntradaSalida);
            objEntirex.Campo["RD63-NUM-OFI"].Valor = entity.NUM_OFI;
            objEntirex.AddCampoTexto("FILLER2", 4023, ebxIO.EntradaSalida);	
            objEntirex.Campo["FILLER2"].Valor = entity.FILLER2;

            // Definición Campos Salida
            objEntirex.AddCampoNumero("RD63-COD-RESP", 4, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoTexto("RD63-DES-RESP", 60, ebxIO.SoloSalida);	
            objEntirex.AddCampoTexto("RD63-PRI-APELLIDO", 20, ebxIO.SoloSalida);	
            objEntirex.AddCampoTexto("RD63-SEG-APELLIDO", 20, ebxIO.SoloSalida);	
            objEntirex.AddCampoTexto("RD63-PRI-NOMBRE", 20, ebxIO.SoloSalida);	
            objEntirex.AddCampoTexto("RD63-SEG-NOMBRE", 20, ebxIO.SoloSalida);	
            objEntirex.AddCampoNumero("RD63-FEC-NAC", 8, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoTexto("RD63-IND-SEX", 1, ebxIO.SoloSalida);	
            objEntirex.AddCampoNumero("RD63-COD-CIIU", 4, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoNumero("RD63-CIU-RES", 5, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoTexto("RD63-NOM-CIU-RES", 50, ebxIO.SoloSalida);	
            objEntirex.AddCampoNumero("RD63-COD-DPT", 5, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoTexto("RD63-NOM-COD-DPT", 50, ebxIO.SoloSalida);	
            objEntirex.AddCampoTexto("RD63-DIR-RES", 100, ebxIO.SoloSalida);	
            objEntirex.AddCampoNumero("RD63-TEL-RES", 10, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoNumero("RD63-OFI-FUN", 3, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoTexto("RD63-NOM-OFI", 50, ebxIO.SoloSalida);	
            objEntirex.AddCampoTexto("FILLER3", 1686, ebxIO.SoloSalida);	
            objEntirex.AddCampoNumero("RD63-NUM-TC", 16, 0, false, ebxIO.SoloSalida);
            objEntirex.AddCampoTexto("RD63-TIP-TC", 50, ebxIO.SoloSalida);	

            var returnEntry = new EntitySalida();

            try
            {
                //ejecuta la consulta y asigna los valores obtenidos
                objEntirex.consultaEntireX(strCnfCics);
                    returnEntry.COD_RESP = (int)objEntirex.Campo["RD63-COD-RESP"].Valor;
                    returnEntry.DES_RESP = (string)objEntirex.Campo["RD63-DES-RESP"].Valor;
                    returnEntry.PRI_APELLIDO = (string)objEntirex.Campo["RD63-PRI-APELLIDO"].Valor;
                    returnEntry.SEG_APELLIDO = (string)objEntirex.Campo["RD63-SEG-APELLIDO"].Valor;
                    returnEntry.PRI_NOMBRE = (string)objEntirex.Campo["RD63-PRI-NOMBRE"].Valor;
                    returnEntry.SEG_NOMBRE = (string)objEntirex.Campo["RD63-SEG-NOMBRE"].Valor;
                    returnEntry.FEC_NAC = (int)objEntirex.Campo["RD63-FEC-NAC"].Valor;
                    returnEntry.IND_SEX = (string)objEntirex.Campo["RD63-IND-SEX"].Valor;
                    returnEntry.COD_CIIU = (int)objEntirex.Campo["RD63-COD-CIIU"].Valor;
                    returnEntry.CIU_RES = (int)objEntirex.Campo["RD63-CIU-RES"].Valor;
                    returnEntry.NOM_CIU_RES = (string)objEntirex.Campo["RD63-NOM-CIU-RES"].Valor;
                    returnEntry.COD_DPT = (int)objEntirex.Campo["RD63-COD-DPT"].Valor;
                    returnEntry.NOM_COD_DPT = (string)objEntirex.Campo["RD63-NOM-COD-DPT"].Valor;
                    returnEntry.DIR_RES = (string)objEntirex.Campo["RD63-DIR-RES"].Valor;
                    returnEntry.TEL_RES = (int)objEntirex.Campo["RD63-TEL-RES"].Valor;
                    returnEntry.OFI_FUN = (int)objEntirex.Campo["RD63-OFI-FUN"].Valor;
                    returnEntry.NOM_OFI = (string)objEntirex.Campo["RD63-NOM-OFI"].Valor;
                    returnEntry.FILLER3 = (string)objEntirex.Campo["FILLER3"].Valor;
                    returnEntry.NUM_TC = (int)objEntirex.Campo["RD63-NUM-TC"].Valor;
                    returnEntry.TIP_TC = (string)objEntirex.Campo["RD63-TIP-TC"].Valor;
  
                
                this.ModelState.Clear();
            }
            catch (Exception)
            {
                return View("Error");
            }
            
            return this.View("Edit", returnEntry);
        }


        // GET: Entities/Create
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(EntityEntrada entity)
        {
            if (this.ModelState.IsValid)
            {
                var usuarioCookie = this.Request.Cookies["usuario"];
                var passwordCookie = this.Request.Cookies["clave"];

                var strUsr = usuarioCookie != null ? usuarioCookie.Value : string.Empty;
                var strPsw = passwordCookie != null ? passwordCookie.Value : string.Empty;
                var strCnfCics = ConfigurationManager.AppSettings["ConfigCICS"];

                var objEntirex = new clsEntireX("GE30", strUsr, strPsw, "GE", "075600");

                // Definición Campos Entrada
            objEntirex.AddCampoTexto("RD63-TRN", 4, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-TRN"].Valor = entity.TRN;
            objEntirex.AddCampoTexto("RD63-USUARIO", 13, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-USUARIO"].Valor = entity.USUARIO;
            objEntirex.AddCampoTexto("RD63-CLAVE", 8, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-CLAVE"].Valor = entity.CLAVE;
            objEntirex.AddCampoTexto("RD63-MONITOR", 2, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-MONITOR"].Valor = entity.MONITOR;
            objEntirex.AddCampoNumero("RD63-TRANSACCION", 6, 0, false, ebxIO.EntradaSalida);
            objEntirex.Campo["RD63-TRANSACCION"].Valor = entity.TRANSACCION;
            objEntirex.AddCampoTexto("FILLER1", 20, ebxIO.EntradaSalida);	
            objEntirex.Campo["FILLER1"].Valor = entity.FILLER1;
            objEntirex.AddCampoTexto("RD63-TIP-IDE", 1, ebxIO.EntradaSalida);	
            objEntirex.Campo["RD63-TIP-IDE"].Valor = entity.TIP_IDE;
            objEntirex.AddCampoNumero("RD63-NUM-IDE", 16, 0, false, ebxIO.EntradaSalida);
            objEntirex.Campo["RD63-NUM-IDE"].Valor = entity.NUM_IDE;
            objEntirex.AddCampoNumero("RD63-NUM-OFI", 3, 0, false, ebxIO.EntradaSalida);
            objEntirex.Campo["RD63-NUM-OFI"].Valor = entity.NUM_OFI;
            objEntirex.AddCampoTexto("FILLER2", 4023, ebxIO.EntradaSalida);	
            objEntirex.Campo["FILLER2"].Valor = entity.FILLER2;

                try
                {
                    objEntirex.consultaEntireX(strCnfCics);
                }
                catch (Exception)
                {
                    return View("Error");
                }

                return this.View("Details", entity);
            }

            return this.View(entity);
        }

        // GET: Entities/Edit/5
        public ActionResult Edit(string id)
        {
            return this.View();
        }
    }
}