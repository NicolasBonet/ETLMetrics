package vista;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class VerAbonosGrid extends JFrame
{	
	public JLabel lbTitulo;
	public JButton cmdCrear;
	public JButton cmdConsultar;
	public JButton cmdActualizar;
	public JButton cmdEliminar;
	public JTable tabla;
	public DefaultTableModel dtm;
	
	public JPanel panelDetalle ;
	public JPanel panelBotones;
	
	public VerAbonosGrid ()
 
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
	this.cmdCrear = new JButton("Crear");
	this.cmdConsultar = new JButton("Consultar");
	this.cmdActualizar = new JButton("Actualizar");
	this.cmdEliminar = new JButton("Eliminar");
    
 	cmdCrear.setFont(fuente);
	cmdConsultar.setFont(fuente);
	cmdActualizar.setFont(fuente);
	cmdEliminar.setFont(fuente);
	
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.insets = new Insets(5,10,10,10);
	panelDetalle.setLayout(new GridBagLayout());
	gbc.gridx=0;
	gbc.gridy=0;
	
	panelDetalle.add(lbTitulo, gbc);
	String[] columnas = {};
	DefaultTableModel dtm = new DefaultTableModel(columnas,20);
	tabla = new JTable(dtm);

	tabla.setPreferredScrollableViewportSize(tabla.getPreferredSize());
	tabla.setAutoscrolls(true);
	tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	JScrollPane scroll = new JScrollPane(tabla);
	panelDetalle.setFont(fuente);
    gbc.gridy=1;
	panelDetalle.add(scroll, gbc);
	

	gbc.anchor=GridBagConstraints.WEST;
	gbc.fill  = GridBagConstraints.HORIZONTAL;
	gbc.insets = new Insets(3,10,3,10);
	
	gbc.gridx=0;
	gbc.gridy=0;
	gbc.gridwidth = 3;

	gbc.fill = GridBagConstraints.BOTH;

	panelBotones.add(this.cmdCrear,gbc);
	panelBotones.add(this.cmdConsultar,gbc);
	panelBotones.add(this.cmdActualizar,gbc);
	panelBotones.add(this.cmdEliminar,gbc);
	gbc.gridx=1;
	gbc.gridx=0;
	gbc.gridy=0;


	ventana.add(panelDetalle,gbc);
	gbc.gridy=1;
	ventana.add(panelBotones,gbc);
	ventana.setVisible(true);
	
	}
}
