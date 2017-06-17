package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import controller.App;

public class MenuManager extends JPanel implements TreeSelectionListener{

        public MenuManager() {
			
        	arbol=new JTree();
			crearArbol();
			this.setBackground(Color.white);
			setPreferredSize(new Dimension(120,0));		//this.setBounds(0, 0, 1000, 100);
			add(BorderLayout.WEST, arbol);			//this.add(arbol);
		}

private void crearArbol() {
		
		/*Construimos los nodos del arbol que seran ramas u hojas*/
        DefaultMutableTreeNode carpetaRaiz = new DefaultMutableTreeNode("Laboratorio");
        /*Definimos el modelo donde se agregaran los nodos*/
        DefaultTreeModel modelo = new DefaultTreeModel(carpetaRaiz);
        /*agregamos el modelo al arbol, donde previamente establecimos la raiz*/
        arbol = new JTree(modelo);
        /*definimos los eventos*/
        arbol.getSelectionModel().addTreeSelectionListener(this);
        
        /*Definimos mas nodos del arbol y se lo agregamos al modelo*/
        DefaultMutableTreeNode carpetaS = new DefaultMutableTreeNode("Suelos");
        DefaultMutableTreeNode carpetaA = new DefaultMutableTreeNode("Aguas");
        DefaultMutableTreeNode carpetaC = new DefaultMutableTreeNode("Compost");
        ;
        /*Definimos donde se agrega el nodo, dentro de que rama y que posicion*/
        modelo.insertNodeInto(carpetaS, carpetaRaiz, 0);
        modelo.insertNodeInto(carpetaA, carpetaRaiz, 1);
        modelo.insertNodeInto(carpetaC, carpetaRaiz, 2);

        /*Creamos las hojas del arbol*/
         opcion1 = new DefaultMutableTreeNode("Crear");
         opcion2 = new DefaultMutableTreeNode("Editar");
         opcion3 = new DefaultMutableTreeNode("Informes");
        
         opciona1 = new DefaultMutableTreeNode("Crear");
         opciona2 = new DefaultMutableTreeNode("Editar");
         opciona3 = new DefaultMutableTreeNode("Informes");
        
         opcionc1 = new DefaultMutableTreeNode("Crear");
         opcionc2 = new DefaultMutableTreeNode("Editar");
         opcionc3 = new DefaultMutableTreeNode("Informes");
        
        modelo.insertNodeInto(opcion1, carpetaS, 0);
        modelo.insertNodeInto(opcion2, carpetaS, 1);
        modelo.insertNodeInto(opcion3, carpetaS, 2);
        
        modelo.insertNodeInto(opciona1, carpetaA, 0);
        modelo.insertNodeInto(opciona2, carpetaA, 1);
        modelo.insertNodeInto(opciona3, carpetaA, 2);
        
        modelo.insertNodeInto(opcionc1, carpetaC, 0);
        modelo.insertNodeInto(opcionc2, carpetaC, 1);
        modelo.insertNodeInto(opcionc3, carpetaC, 2);
       
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
		if (nodoSeleccionado==opcion1){
			App.getInstance().mframe.actualizar(new RegistroNuevo("SUELOS"));
		}
		if (nodoSeleccionado==opciona1){
			App.getInstance().mframe.actualizar(new RegistroNuevo("AGUAS"));
		}
		if (nodoSeleccionado==opcionc1){
			App.getInstance().mframe.actualizar(new RegistroNuevo("PASTOS"));
		}
		
	}
	
	
	
	private JTree arbol;
	DefaultMutableTreeNode opcion1;
    DefaultMutableTreeNode opcion2;
    DefaultMutableTreeNode opcion3;
    
    DefaultMutableTreeNode opciona1;
    DefaultMutableTreeNode opciona2;
    DefaultMutableTreeNode opciona3;
    
    DefaultMutableTreeNode opcionc1;
    DefaultMutableTreeNode opcionc2;
    DefaultMutableTreeNode opcionc3;
    
	
}
