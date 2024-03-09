
import java.awt.Color;
import java.awt.Window;
import javax.swing.JOptionPane;

public class Registrar_usuario extends javax.swing.JFrame {

    Principal principal = new Principal();
    Gestionar_usuario gestionar = new Gestionar_usuario();
    public static String nombre = "", apellido = "", correo = "", sexo = "";
    public static int edad = 0;
    public static String telefono = "";
    public static float estatura = 0;

    public Registrar_usuario() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        for (int i = 1; i <= 120; i++) {
            jComboEdad.addItem(String.valueOf(i));
        }
    }

    public void PedirDatos() {
        nombre = txt_nombre.getText();
        apellido = txt_apellido.getText();
        correo = txt_email.getText().trim();
        edad = Integer.parseInt(jComboEdad.getSelectedItem().toString());
        telefono = txt_telefono.getText();
        estatura = Float.parseFloat(txt_estatura.getText());
        sexo = jCombo_sexo.getSelectedItem().toString();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton_registrar = new javax.swing.JButton();
        jCombo_sexo = new javax.swing.JComboBox<>();
        jComboEdad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton_Solido = new javax.swing.JButton();
        jButton_RGB = new javax.swing.JButton();
        txt_estatura = new javax.swing.JTextField();
        WallPaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu_nuevo = new javax.swing.JMenuItem();
        jMenu_fondo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrar usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 230, 30));

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 230, 30));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 230, 30));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 230, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Edad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estatura");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 40, -1));

        jButton_registrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_registrar.setForeground(new java.awt.Color(0, 153, 51));
        jButton_registrar.setText("Registrar");
        jButton_registrar.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 150, 60));

        jCombo_sexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCombo_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Masculino", "Femenino" }));
        getContentPane().add(jCombo_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 120, 30));

        jComboEdad.setToolTipText("\n\n");
        getContentPane().add(jComboEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Gestionar Usuario");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 150, 60));

        jButton_Solido.setForeground(new java.awt.Color(204, 0, 204));
        jButton_Solido.setText("MODIFICAR SOLIDO");
        jButton_Solido.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_Solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SolidoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Solido, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 150, 60));

        jButton_RGB.setForeground(new java.awt.Color(0, 0, 204));
        jButton_RGB.setText("MODIFICAR RGB");
        jButton_RGB.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_RGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RGBActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 150, 60));
        getContentPane().add(txt_estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, 30));
        getContentPane().add(WallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 420));

        jMenu1.setText("Opciones");

        jMenu_nuevo.setText("Ingresar de nuevo");
        jMenu_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_nuevo);

        jMenu_fondo.setText("Fondo de la interfaz");
        jMenu_fondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_fondoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu_fondo);

        jMenuItem1.setText("Salir de la interfaz");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed

        PedirDatos();
        gestionar.Mostrar();

        if (nombre.equals("") || apellido.equals("") || correo.equals("") || telefono.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");

        } else {

            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            limpiar();
        }

    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        gestionar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_nuevoActionPerformed
        limpiar();
        txt_nombre.requestFocus();
        txt_nombre.selectAll();

    }//GEN-LAST:event_jMenu_nuevoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        principal.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void RGB() {
        int rojo, verde, azul;
        Color_Interfaz colorinterfaz = new Color_Interfaz();
       

        rojo = colorinterfaz.rojo;
        verde = colorinterfaz.verde;
        azul = colorinterfaz.azul;

        Color color = new Color(rojo, verde, azul);
        getContentPane().setBackground(color);

    }

    public void Solidos() {
        Color_Interfaz solido = new Color_Interfaz();
        String solid = "";

        solid = solido.Solido;

        if (solid.equals("Vacio")) {
            JOptionPane.showMessageDialog(null, "No a selecionado ningun color para su interfaz");

        } else {
            if (solid.equals("Amarillo")) {
                getContentPane().setBackground(Color.YELLOW);
                jLabel1.setForeground(Color.BLACK);
                jLabel2.setForeground(Color.BLACK);
                jLabel3.setForeground(Color.BLACK);
                jLabel4.setForeground(Color.BLACK);
                jLabel5.setForeground(Color.BLACK);
                jLabel6.setForeground(Color.BLACK);
                jLabel7.setForeground(Color.BLACK);
                jLabel8.setForeground(Color.BLACK);
                jLabel9.setForeground(Color.BLACK);

            } else if (solid.equals("Azul")) {
                getContentPane().setBackground(Color.BLUE);
                jLabel1.setForeground(Color.WHITE);
                jLabel2.setForeground(Color.WHITE);
                jLabel3.setForeground(Color.WHITE);
                jLabel4.setForeground(Color.WHITE);
                jLabel5.setForeground(Color.WHITE);
                jLabel6.setForeground(Color.WHITE);
                jLabel7.setForeground(Color.WHITE);
                jLabel8.setForeground(Color.WHITE);
                jLabel9.setForeground(Color.WHITE);
            } else if (solid.equals("Rojo")) {
                getContentPane().setBackground(Color.RED);
            } else if (solid.equals("Verde")) {
                getContentPane().setBackground(Color.GREEN);
            } else if (solid.equals("Negro")) {
                getContentPane().setBackground(Color.BLACK);
            } else if (solid.equals("Rosado")) {
                getContentPane().setBackground(Color.PINK);
            } else if (solid.equals("Blanco")) {
                getContentPane().setBackground(Color.WHITE);
                jLabel1.setForeground(Color.BLACK);
                jLabel2.setForeground(Color.BLACK);
                jLabel3.setForeground(Color.BLACK);
                jLabel4.setForeground(Color.BLACK);
                jLabel5.setForeground(Color.BLACK);
                jLabel6.setForeground(Color.BLACK);
                jLabel7.setForeground(Color.BLACK);
                jLabel8.setForeground(Color.BLACK);
                jLabel9.setForeground(Color.BLACK);
            } else if (solid.equals("Gris")){
             getContentPane().setBackground(Color.darkGray);
                jLabel1.setForeground(Color.WHITE);
                jLabel2.setForeground(Color.WHITE);
                jLabel3.setForeground(Color.WHITE);
                jLabel4.setForeground(Color.WHITE);
                jLabel5.setForeground(Color.WHITE);
                jLabel6.setForeground(Color.WHITE);
                jLabel7.setForeground(Color.WHITE);
                jLabel8.setForeground(Color.WHITE);
                jLabel9.setForeground(Color.WHITE);
        }
            
           
        }

    }
    private void jMenu_fondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_fondoActionPerformed
        Color_Interfaz color = new Color_Interfaz();
        color.setVisible(true);
    }//GEN-LAST:event_jMenu_fondoActionPerformed

    private void jButton_RGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RGBActionPerformed
        RGB(); 
    }//GEN-LAST:event_jButton_RGBActionPerformed

    private void jButton_SolidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SolidoActionPerformed
        Solidos();
        
    }//GEN-LAST:event_jButton_SolidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WallPaper;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_RGB;
    private javax.swing.JButton jButton_Solido;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JComboBox<String> jComboEdad;
    private javax.swing.JComboBox<String> jCombo_sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenu_fondo;
    private javax.swing.JMenuItem jMenu_nuevo;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_estatura;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {

        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_email.setText("");
        txt_telefono.setText("");
        jComboEdad.setSelectedItem("1");
        jCombo_sexo.setSelectedItem("");
        txt_estatura.setText("");
    }

}
