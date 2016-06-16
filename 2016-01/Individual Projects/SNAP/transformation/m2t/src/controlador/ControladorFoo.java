package controlador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import vista.*;
import modelo.*;


public class ControladorFoo implements ActionListener
{
	static int ROW;
	VerTercerosGrid verTercerosGrid= null;
	VerTercerosForm verTercerosForm = null;
	VerPagosGrid verPagosGrid = null;
		
	public ControladorFoo(VerTercerosGrid verTercero)
	{
		this.verTercerosGrid= verTercero;
		this.verTercerosGrid.cmdCrear.addActionListener(this);
		this.verTercerosGrid.cmdActualizar.addActionListener(this);
		this.verTercerosGrid.cmdConsultar.addActionListener(this);
		this.verTercerosGrid.cmdEliminar.addActionListener(this);
		
		this.verTercerosGrid.tabla.addMouseListener(new MouseAdapter() 
		{	 
	        @Override
	        public void mouseClicked(MouseEvent e) 
	        {
	        	tablaMouseClicked(e);
	        }
	        });

		llenarGridTerceros();
		
	}	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int opcion=0;
		String funcion="";
		//JOptionPane.showMessageDialog(null, ROW);
		if (e.getSource() == this.verTercerosGrid.cmdCrear)
		{funcion="F6";}
		else if(e.getSource() == this.verTercerosGrid.cmdEliminar)
		{opcion=4;}
		else if(e.getSource() == this.verTercerosGrid.cmdActualizar)
		{opcion=2;}
		else if(e.getSource() == this.verTercerosGrid.cmdConsultar)
		{opcion=5;}
		else if(e.getSource() == this.verTercerosForm.cmdConfirmar)
		{}
		ValidarOpcionesyFunciones(opcion, funcion);
	}

	private void llenarGridTerceros()
	{
		String[] columnas = {"Tipo", "Identificación","Primer Nombre", "Segundo Nombre", "Primer Apellido", 
				"Segundo Apellido", "Dirección","Teléfono","Email","Celular","Forma de pago","Banco","Cuenta","Tipo de cuenta"};
		BDTercero bdTerceros = new BDTercero();
		Third[] terceros = bdTerceros.consultarTerceros();
		Object[][] datos = new Object[terceros.length][15];
		DefaultTableModel dtm = new DefaultTableModel(columnas, terceros.length-1);
		verTercerosGrid.tabla.setModel(dtm);

		for ( int i=0; i<terceros.length;i++) 
		{
			datos[i][0]=terceros[i].getTipoidentificacion();  
			datos[i][1]=terceros[i].getNumeroidentificacion();
			datos[i][2]=terceros[i].getPrimerapellido();
			datos[i][3]=terceros[i].getSegundoapellido();
			datos[i][4]=terceros[i].getPrimernombre();
			datos[i][5]=terceros[i].getSegundonombre();
			datos[i][6]=terceros[i].getDireccion();
			datos[i][7]=terceros[i].getTelefono();
			datos[i][8]=terceros[i].getCorreoelectronico();
			datos[i][9]=terceros[i].getCelular();
			datos[i][10]=terceros[i].getFormadepago();
			datos[i][11]=terceros[i].getEntidadbancaria();
			datos[i][12]=terceros[i].getNumerodecuenta();
			datos[i][13]=terceros[i].getTipodecuenta();
			datos[i][14]=terceros[i].getId();
			dtm.addRow(datos[i]);
		}
	}
	
	private void ValidarOpcionesyFunciones(int opcion, String funcion)
	{
		int modo = 0;
		if(opcion!=0)
		{
			switch (opcion) 
			{
			case 2:
				modo = 3;
				llamarVerTercerosForm(modo);
				break;
			case 4:
				modo=2;
				llamarVerTercerosForm(modo);
				break;
			case 5:
				modo=4;
				llamarVerTercerosForm(modo);
				break;
			} 
		}
		else if(funcion !="")
		{
			switch (funcion) 
			{
				case "F6":
				modo = 1;
				llamarVerTercerosForm(modo);
				break;
			} 		
		}		
	}
	
	private void llamarVerTercerosForm(int modo)
	{
		verTercerosForm = new VerTercerosForm(modo);
		if(modo!= 1)
		{
			llenarCampos();
		}
		this.verTercerosForm.cmdConfirmar.addActionListener(this);
		this.verTercerosForm.cmdRegresar.addActionListener(this);
	}
	
	private void llamarVerPagosGrid(int modo)
	{
		verPagosGrid = new VerPagosGrid();
		ControladorPagos controladorPagos = new ControladorPagos(verPagosGrid);
	}
	
	private void tablaMouseClicked(MouseEvent evt) 
	{
		 ROW= verTercerosGrid.tabla.rowAtPoint(evt.getPoint());
    }

	public void llenarCampos()
	{
		verTercerosForm.txttipoidentificacion.setText(verTercerosGrid.tabla.getValueAt(ROW,0).toString());
		verTercerosForm.txtnumeroidentificacion.setText(verTercerosGrid.tabla.getValueAt(ROW,1).toString());
		verTercerosForm.txtprimerapellido.setText(verTercerosGrid.tabla.getValueAt(ROW,2).toString());
		verTercerosForm.txtsegundoapellido.setText(verTercerosGrid.tabla.getValueAt(ROW,3).toString());
		verTercerosForm.txtprimernombre.setText(verTercerosGrid.tabla.getValueAt(ROW,4).toString());
		verTercerosForm.txtsegundonombre.setText(verTercerosGrid.tabla.getValueAt(ROW,5).toString());
		verTercerosForm.txtdireccion.setText(verTercerosGrid.tabla.getValueAt(ROW,6).toString());
		verTercerosForm.txttelefono.setText(verTercerosGrid.tabla.getValueAt(ROW,7).toString());
		verTercerosForm.txtcorreoelectronico.setText(verTercerosGrid.tabla.getValueAt(ROW,8).toString());
		verTercerosForm.txtcelular.setText(verTercerosGrid.tabla.getValueAt(ROW,9).toString());
		verTercerosForm.txtformadepago.setText(verTercerosGrid.tabla.getValueAt(ROW,10).toString());
		verTercerosForm.txtnumerodecuenta.setText(verTercerosGrid.tabla.getValueAt(ROW,12).toString());
	}
}
