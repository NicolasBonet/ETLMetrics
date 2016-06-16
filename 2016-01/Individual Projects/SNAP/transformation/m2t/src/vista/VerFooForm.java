package vista;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class VerFooForm extends JFrame
{	
	public JLabel lbTitulo;
 public JLabel lbtipodecuenta;
		   public JTextField txttipodecuenta;
 public JLabel lbprimernombre;
		   public JTextField txtprimernombre;
 public JLabel lbprimerapellido;
		   public JTextField txtprimerapellido;
 public JLabel lbsegundonombre;
		   public JTextField txtsegundonombre;
 public JLabel lbformadepago;
		   public JTextField txtformadepago;
 public JLabel lbtipoidentificacion;
		   public JTextField txttipoidentificacion;
 public JLabel lbdireccion;
		   public JTextField txtdireccion;
 public JLabel lbcorreoelectronico;
		   public JTextField txtcorreoelectronico;
 public JLabel lbentidadbancaria;
		   public JTextField txtentidadbancaria;
 public JLabel lbnumeroidentificacion;
		   public JTextField txtnumeroidentificacion;
 public JLabel lbcelular;
		   public JTextField txtcelular;
 public JLabel lbnumerodecuenta;
		   public JTextField txtnumerodecuenta;
 public JLabel lbsegundoapellido;
		   public JTextField txtsegundoapellido;
 public JLabel lbtelefono;
		   public JTextField txttelefono;
	public JButton cmdConfirmar;
	public JButton cmdRegresar;
	
	public JPanel panelDetalle ;
	public JPanel panelBotones;
	
	public VerFooForm (int modo)
 
	{
	JFrame ventana = new JFrame("terceros_pensiones");
	ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
	ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
	ventana.setLayout(new GridBagLayout());
	JPanel panelDetalle = new JPanel();
	JPanel panelBotones = new JPanel();
	lbTitulo = new JLabel("terceros_pensiones");
    Font fuente = new Font ("Times-Roman", Font.BOLD + Font.ITALIC, 36);
    lbTitulo.setFont(fuente);
   fuente = new Font ("Times-Roman", Font.BOLD + Font.ITALIC, 16);
 lbtipodecuenta = new JLabel ("tipodecuenta");
		   txttipodecuenta= new JTextField("", 20) ;
		   lbtipodecuenta.setFont(fuente);
		   txttipodecuenta.setFont(fuente);
 lbprimernombre = new JLabel ("primernombre");
		   txtprimernombre= new JTextField("", 20) ;
		   lbprimernombre.setFont(fuente);
		   txtprimernombre.setFont(fuente);
 lbprimerapellido = new JLabel ("primerapellido");
		   txtprimerapellido= new JTextField("", 20) ;
		   lbprimerapellido.setFont(fuente);
		   txtprimerapellido.setFont(fuente);
 lbsegundonombre = new JLabel ("segundonombre");
		   txtsegundonombre= new JTextField("", 20) ;
		   lbsegundonombre.setFont(fuente);
		   txtsegundonombre.setFont(fuente);
 lbformadepago = new JLabel ("formadepago");
		   txtformadepago= new JTextField("", 20) ;
		   lbformadepago.setFont(fuente);
		   txtformadepago.setFont(fuente);
 lbtipoidentificacion = new JLabel ("tipoidentificacion");
		   txttipoidentificacion= new JTextField("", 20) ;
		   lbtipoidentificacion.setFont(fuente);
		   txttipoidentificacion.setFont(fuente);
 lbdireccion = new JLabel ("direccion");
		   txtdireccion= new JTextField("", 20) ;
		   lbdireccion.setFont(fuente);
		   txtdireccion.setFont(fuente);
 lbcorreoelectronico = new JLabel ("correoelectronico");
		   txtcorreoelectronico= new JTextField("", 20) ;
		   lbcorreoelectronico.setFont(fuente);
		   txtcorreoelectronico.setFont(fuente);
 lbentidadbancaria = new JLabel ("entidadbancaria");
		   txtentidadbancaria= new JTextField("", 20) ;
		   lbentidadbancaria.setFont(fuente);
		   txtentidadbancaria.setFont(fuente);
 lbnumeroidentificacion = new JLabel ("numeroidentificacion");
		   txtnumeroidentificacion= new JTextField("", 20) ;
		   lbnumeroidentificacion.setFont(fuente);
		   txtnumeroidentificacion.setFont(fuente);
 lbcelular = new JLabel ("celular");
		   txtcelular= new JTextField("", 20) ;
		   lbcelular.setFont(fuente);
		   txtcelular.setFont(fuente);
 lbnumerodecuenta = new JLabel ("numerodecuenta");
		   txtnumerodecuenta= new JTextField("", 20) ;
		   lbnumerodecuenta.setFont(fuente);
		   txtnumerodecuenta.setFont(fuente);
 lbsegundoapellido = new JLabel ("segundoapellido");
		   txtsegundoapellido= new JTextField("", 20) ;
		   lbsegundoapellido.setFont(fuente);
		   txtsegundoapellido.setFont(fuente);
 lbtelefono = new JLabel ("telefono");
		   txttelefono= new JTextField("", 20) ;
		   lbtelefono.setFont(fuente);
		   txttelefono.setFont(fuente);
		this.cmdConfirmar= new JButton("Confirmar");
		this.cmdRegresar = new JButton("Regresar");
	
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.insets = new Insets(5,10,10,10);
	panelDetalle.setLayout(new GridBagLayout());
	gbc.gridx=0;
	gbc.gridy=0;
	
	panelDetalle.add(lbTitulo, gbc);


	ventana.add(panelDetalle,gbc);
	gbc.gridy=1;
	ventana.add(panelBotones,gbc);
	ventana.setVisible(true);
	
	}
}
