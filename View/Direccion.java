package view;

public class Direccion extends javax.swing.JFrame {
	 public Direccion() {
	        initComponents();
	    }
	 Direccion(RegistroNuevo padre) {
	        this.padre=padre;
	        initComponents(); //To change body of generated methods, choose Tools | Templates.
	    }
	 
	 private void initComponents() {

	        jComboBox1 = new javax.swing.JComboBox<>();
	        jTextField1 = new javax.swing.JTextField();
	        jComboBox2 = new javax.swing.JComboBox<>();
	        jComboBox4 = new javax.swing.JComboBox<>();
	        jComboBox5 = new javax.swing.JComboBox<>();
	        jLabel1 = new javax.swing.JLabel();
	        jTextField2 = new javax.swing.JTextField();
	        jComboBox3 = new javax.swing.JComboBox<>();
	        jComboBox6 = new javax.swing.JComboBox<>();
	        jLabel2 = new javax.swing.JLabel();
	        jTextField3 = new javax.swing.JTextField();
	        jComboBox7 = new javax.swing.JComboBox<>();
	        jLabel3 = new javax.swing.JLabel();
	        jButton1 = new javax.swing.JButton();

	        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Avenida", "AvenidaCalle", "AvenidaCarrera", "Autopista", "Bulevar", "Calle", "Carrera", "Carretera", "Circular", "Circunvalar", "CuentasCorridas", "Diagonal", "Kilómetro", "Manzana", "Pasaje", "Paseo", "Peatonal", "Transversal", "Troncal", "Variante", "Vía" }));

	        jTextField1.setText("Ej:50");
	        jTextField1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField1ActionPerformed(evt);
	            }
	        });

	        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej:A", "-", "A", "AE", "AN", "B", "C", "D", "DN", "E", "F", "FN", "G", "GN", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

	        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej:Bis", "-", "Bis" }));

	        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej:Sur", "-", "NORTE", "SUR", "ESTE", "OESTE" }));

	        jLabel1.setText("#");

	        jTextField2.setText("Ej:50");
	        jTextField2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField2ActionPerformed(evt);
	            }
	        });

	        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej:A", "-", "A", "AE", "AN", "B", "C", "D", "DN", "E", "F", "FN", "G", "GN", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

	        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej:Bis", "-", "Bis" }));

	        jLabel2.setText("       -");

	        jTextField3.setText("Ej:50");
	        jTextField3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jTextField3ActionPerformed(evt);
	            }
	        });

	        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ej:Sur", "-", "NORTE", "SUR", "ESTE", "OESTE" }));

	        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
	        jLabel3.setText("Editar dirección");

	        jButton1.setText("Aceptar");
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(21, 21, 21)
	                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addContainerGap()
	                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGap(9, 9, 9)
	                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(10, 10, 10)
	                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addGap(130, 130, 130)
	                        .addComponent(jLabel3)
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap(25, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(6, 6, 6)
	                .addComponent(jLabel3)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel1)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jLabel2)
	                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(18, 18, 18)
	                .addComponent(jButton1)
	                .addContainerGap(55, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        // TODO add your handling code here:
	    }                                           

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        padre.jTextField3.setText("Vengo de direccion");
	        this.dispose();        // TODO add your handling code here:
	    }                                        


	 	private RegistroNuevo padre;   
	    private javax.swing.JButton jButton1;
	    private javax.swing.JComboBox<String> jComboBox1;
	    private javax.swing.JComboBox<String> jComboBox2;
	    private javax.swing.JComboBox<String> jComboBox3;
	    private javax.swing.JComboBox<String> jComboBox4;
	    private javax.swing.JComboBox<String> jComboBox5;
	    private javax.swing.JComboBox<String> jComboBox6;
	    private javax.swing.JComboBox<String> jComboBox7;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JTextField jTextField2;
	    private javax.swing.JTextField jTextField3;
}
