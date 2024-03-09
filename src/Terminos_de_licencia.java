
public class Terminos_de_licencia extends javax.swing.JFrame {

  
    public Terminos_de_licencia() {
        initComponents();
        setSize(673, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        
        jTextArea1.setText("  EL SOFTWARE A CONTINUACIÓN SERÁ UTILIZADO CON FINES EDUCATIVOS\n"
                + "  O DE PRÁCTICA; LO QUE SIGNIFICA QUE CUALQUIERA QUE DESEE HACER USO DEL \n"
                + "  MISMO Y POSTERIORMENTE QUISIERA MODIFICAR EL CÓDIGO FUENTE DEL SOFTWARE\n"
                + "  TIENE TOTAL AUTONOMÍA PARA REALIZAR CAMBIOS EN ESTE.\n"
                + "  TENIENDO EN CUENTA LO ANTERIOR ES NECESARIO CONTAR CON SU PERMISO PARA PODER\n"
                + "  ACCEDER AL SOFTWARE; TENER EN CUENTA QUE ESTE SOFTWARE NO GUARDARA NINGUNO DE\n"
                + "  SUS DATOS PERSONALES, SOLO SERÁ UTILIZADO CON FINES EDUCATIVOS\n"
                + "  O DE PRÁCTICA. ENTENDIDO A LO ANTERIOR PUEDE PROCEDER CON LA AUTORIZACIÓN PARA INGRESAR AL SOFTWARE.\n");

        
        jButton_acepto.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton_acepto = new javax.swing.JButton();
        jButton_noacepto = new javax.swing.JButton();
        WallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("TERMINOS Y CONDICIONES DE LICENCIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 640, 250));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setText(" Acepta los Terminos y condiciones");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jButton_acepto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_acepto.setText("Acepto");
        jButton_acepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_aceptoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_acepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jButton_noacepto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_noacepto.setText("No acepto");
        jButton_noacepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_noaceptoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_noacepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, -1));
        getContentPane().add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 673, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected() == true) {
            jButton_acepto.setEnabled(true);
            jButton_noacepto.setEnabled(false);
        }else{
            jButton_acepto.setEnabled(false);
            jButton_noacepto.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton_noaceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_noaceptoActionPerformed
       Principal principal = new Principal();
        
        principal.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton_noaceptoActionPerformed

    private void jButton_aceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_aceptoActionPerformed
        Registrar_usuario regis = new Registrar_usuario();
        regis.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_aceptoActionPerformed

   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton jButton_acepto;
    private javax.swing.JButton jButton_noacepto;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
