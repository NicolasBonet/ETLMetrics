 
package tercerospensiones;
import modelo.*;
import vista.*;
import controlador.*;
public class AppTercerospensiones {
 	


	public static void main(String[] args) {
		VerPersonasGrid verPersonas = new VerPersonasGrid();
		ControladorPersonas ctlPersonas = new ControladorPersonas(verPersonas);
	}

}
