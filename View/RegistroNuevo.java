package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class RegistroNuevo extends JPanel {

	
	
	public RegistroNuevo(String tipo) {
		super();
                numRows=1;
		initComponents();
		jLabel1.setText("REPORTES DE "+tipo+" - FACULTAD DE AGRONOM�A");
                setTabla(tipo);
		 
		
	}
        private void setTabla(String tipo){
            String[] columnas=null;
            //Class[] tiposColumnas=null;
            switch (tipo) {
                    case "SUELOS":
                        columnas = new String[]{
                            "Finca",
                            "Propietario",
                            "Municipio",
                            "Departamento",
                            "Cultivo",
                            "Referencia (Lote)",
                            "Fecha de muestreo",
                            "Fecha de recibo ",
                            "Fecha de Reporte",
                            "No. Recibo",
                            "Tipo de Ensayo",
                            "Observaciones",
                            "Costo"
                        };
                        final Class[] tiposColumnas = new Class[]{
                            java.lang.String.class,
                            java.lang.String.class,
                            java.lang.String.class,
                            java.lang.String.class,
                            java.lang.String.class,
                            java.lang.String.class,
                            com.toedter.calendar.JDateChooser.class,
                            com.toedter.calendar.JDateChooser.class,
                            com.toedter.calendar.JDateChooser.class,
                            int.class,
                            int.class,
                            java.lang.String.class,
                            int.class
                            
                        };
                        
                        Object[][] datos = new Object[][]{
                        {null,null,null,null,null,null,new com.toedter.calendar.JDateChooser(),new com.toedter.calendar.JDateChooser(),new com.toedter.calendar.JDateChooser(),null},
                        };
                        model = new javax.swing.table.DefaultTableModel(datos,columnas) {
                            Class[] tipos = tiposColumnas;

                            @Override
                            public Class getColumnClass(int columnIndex) {
                                return tipos[columnIndex];
                            }

                            @Override
                            public boolean isCellEditable(int row, int column) {
                                 return !(this.getColumnClass(column).equals(JButton.class));
                            }
                        };
                         jTableDatos.setModel(model);
                         jTableDatos.setDefaultRenderer(com.toedter.calendar.JDateChooser.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                    return (Component) objeto;
            }
        });
                        break;
                 } 
            
           
        }
        
        private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {                                       
        if ((int)this.jSpinner1.getValue()>numRows){
            model.addRow(new Object[]{null,null,null,null,null,null,new com.toedter.calendar.JDateChooser(),new com.toedter.calendar.JDateChooser(),new com.toedter.calendar.JDateChooser(),null});
        }
        else{
            model.removeRow(numRows-1);
        }
            numRows=(int)this.jSpinner1.getValue();
            // TODO add your handling code here:
    } 
        
        
         private void initComponents() {
        jTableDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setViewportView(jTableDatos);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REPORTES DE SUELOS - FACULTAD DE AGRONOMÍA");

        jLabel2.setText("Remitente (*):");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("E-mail:");

        jLabel4.setText("Dirección:");

        jLabel6.setText("Ciudad Remitente (*):");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel9.setText("Teléfono (*):");

        jLabel10.setText("Teléfono2 :");

        jLabel13.setText("Cédula");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 0, 999, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel17.setText("Numero de pruebas:");

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField5)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        JFormattedTextField tf = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf.setEditable(false);
        tf.setBackground(Color.white);
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Direccion direccion = new Direccion(this);
        direccion.setVisible(true);
   
        //System.out.println("direccion");
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable jTableDatos;
    private int numRows;
    private DefaultTableModel model;
    // End of variables declaration 
}
