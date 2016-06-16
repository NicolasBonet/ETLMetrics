package vista;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class VerPersonasForm extends JFrame
{	
	public JLabel lbTitulo;
 public JLabel lbabonos;
		   public JTextField txtabonos;
 public JLabel lbnumeroidentificacion;
		   public JTextField txtnumeroidentificacion;
 public JLabel lbsegundonombre;
		   public JTextField txtsegundonombre;
 public JLabel lbprimernombre;
		   public JTextField txtprimernombre;
 public JLabel lbprimerapellido;
		   public JTextField txtprimerapellido;
 public JLabel lbsegundoapellido;
		   public JTextField txtsegundoapellido;
 public JLabel lbtipoidentificacion;
		   public JTextField txttipoidentificacion;
 public JLabel lbid;
		   public JTextField txtid;
	public JButton cmdConfirmar;
	public JButton cmdRegresar;
	
	public JPanel panelDetalle ;
	public JPanel panelBotones;
	
	public VerPersonasForm (int modo)
 
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
 lbabonos = new JLabel ("abonos");
		   txtabonos= new JTextField("", 20) ;
		   lbabonos.setFont(fuente);
		   txtabonos.setFont(fuente);
 lbnumeroidentificacion = new JLabel ("numeroidentificacion");
		   txtnumeroidentificacion= new JTextField("", 20) ;
		   lbnumeroidentificacion.setFont(fuente);
		   txtnumeroidentificacion.setFont(fuente);
 lbsegundonombre = new JLabel ("segundonombre");
		   txtsegundonombre= new JTextField("", 20) ;
		   lbsegundonombre.setFont(fuente);
		   txtsegundonombre.setFont(fuente);
 lbprimernombre = new JLabel ("primernombre");
		   txtprimernombre= new JTextField("", 20) ;
		   lbprimernombre.setFont(fuente);
		   txtprimernombre.setFont(fuente);
 lbprimerapellido = new JLabel ("primerapellido");
		   txtprimerapellido= new JTextField("", 20) ;
		   lbprimerapellido.setFont(fuente);
		   txtprimerapellido.setFont(fuente);
 lbsegundoapellido = new JLabel ("segundoapellido");
		   txtsegundoapellido= new JTextField("", 20) ;
		   lbsegundoapellido.setFont(fuente);
		   txtsegundoapellido.setFont(fuente);
 lbtipoidentificacion = new JLabel ("tipoidentificacion");
		   txttipoidentificacion= new JTextField("", 20) ;
		   lbtipoidentificacion.setFont(fuente);
		   txttipoidentificacion.setFont(fuente);
 lbid = new JLabel ("id");
		   txtid= new JTextField("", 20) ;
		   lbid.setFont(fuente);
		   txtid.setFont(fuente);
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
