package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	public MainFrame(String title) throws HeadlessException {
		
		super(title);
		setLayout(new BorderLayout());
		menuMgr=new MenuManager();
		//RegistroNuevo rn= new RegistroNuevo();		
		//actual = rn;
		actual=null;
		add(BorderLayout.WEST, menuMgr);
		//add(BorderLayout.CENTER, actual);
	

	}
	public void actualizar(JPanel nuevo)
	{	if (actual!=null){
			this.remove(actual);
			this.add(BorderLayout.CENTER,nuevo);}
		else{
			this.add(BorderLayout.CENTER,nuevo);
		}
	}
	private MenuManager menuMgr;
	public JPanel actual;

}
