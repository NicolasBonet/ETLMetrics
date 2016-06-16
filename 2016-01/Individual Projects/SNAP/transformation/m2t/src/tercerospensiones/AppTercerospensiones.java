 
package tercerospensiones;
import modelo.*;
import vista.*;
import controlador.*;
public class AppTercerospensiones {
 	


	public static void main(String[] args) {
		VerTercerosGrid verTerceros = new VerTercerosGrid();
		ControladorTerceros ctlTerceros = new ControladorTerceros(verTerceros);
	}

}
