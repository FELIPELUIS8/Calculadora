
import java.awt.Color;


public class Gestionar_usuario extends javax.swing.JFrame {
    
    String nombre = "", apellido = "", email = "", sexo = "";
    int edad =0;
    String telefono="";
    float estatura = 0;

    public Gestionar_usuario() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.CYAN);
        
    }

    public void Mostrar() {
        Registrar_usuario registro = new Registrar_usuario();
       nombre = registro.nombre;
       apellido = registro.apellido;
       email = registro.correo;
       sexo = registro.sexo;
       edad = registro.edad;
       telefono = registro.telefono;
       estatura = registro.estatura;
        txt_nom.setText((nombre));
        txt_apell.setText(apellido);
        txt_ema.setText(email);
        txt_telef.setText(String.valueOf(telefono));
        txt_ed.setText(String.valueOf(edad));
        txt_est.setText(String.valueOf(estatura));
        txt_sex.setText(String.valueOf(sexo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        txt_apell = new javax.swing.JTextField();
        txt_ema = new javax.swing.JTextField();
        txt_telef = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ed = new javax.swing.JTextField();
        txt_est = new javax.swing.JTextField();
        txt_sex = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Gestionar Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        txt_nom.setEditable(false);
        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, -1));

        txt_apell.setEditable(false);
        txt_apell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 190, -1));

        txt_ema.setEditable(false);
        getContentPane().add(txt_ema, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 190, -1));

        txt_telef.setEditable(false);
        getContentPane().add(txt_telef, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Edad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Estatura");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        txt_ed.setEditable(false);
        txt_ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 110, -1));

        txt_est.setEditable(false);
        getContentPane().add(txt_est, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, -1));

        txt_sex.setEditable(false);
        getContentPane().add(txt_sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 110, -1));

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 225, 110, 50));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 301));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed


    }//GEN-LAST:event_txt_nomActionPerformed

    private void txt_apellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellActionPerformed

    private void txt_edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       Registrar_usuario registrar = new Registrar_usuario();
       registrar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_apell;
    private javax.swing.JTextField txt_ed;
    private javax.swing.JTextField txt_ema;
    private javax.swing.JTextField txt_est;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_sex;
    private javax.swing.JTextField txt_telef;
    // End of variables declaration//GEN-END:variables
}
