
import java.awt.Color;
import java.awt.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis Felipe Cantero
 */
public class Color_Interfaz extends javax.swing.JFrame {

  public static int rojo,verde,azul;
  public static String Solido="";
    public Color_Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(450, 350);
        setTitle("Interfaz de colores");
        

        for (int i = 0; i <= 255; i++) {

            jComboBox_rojo.addItem(String.valueOf(i));
        }

        for (int i = 0; i <= 255; i++) {

            jComboBox_verde.addItem(String.valueOf(i));
        }

        for (int i = 0; i <= 255; i++) {

            jComboBox_azul.addItem(String.valueOf(i));
        }
        
        getContentPane().setBackground(Color.black);
    }

    public void ColoresRGB() {
        String color1 = "";
        String color2 = "";
        String color3 = "";

        color1 = jComboBox_rojo.getSelectedItem().toString();
        color2 = jComboBox_verde.getSelectedItem().toString();
        color3 = jComboBox_azul.getSelectedItem().toString();

          rojo = Integer.parseInt(color1);
          verde = Integer.parseInt(color2);
          azul = Integer.parseInt(color3);
        
       
        
        
    }
    
    public void Solido(){
         Solido = jComboBox_solido.getSelectedItem().toString();
         
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox_solido = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_rojo = new javax.swing.JComboBox<>();
        jComboBox_verde = new javax.swing.JComboBox<>();
        jComboBox_azul = new javax.swing.JComboBox<>();
        jButton_RGB = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_wallPaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ELECION DE FONDE DE INTERFAZ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jComboBox_solido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacio", "Amarillo", "Azul", "Rojo", "Verde", "Negro", "Blanco", "Rosado", "Gris", " " }));
        jComboBox_solido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox_solido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_solidoActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_solido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Colores solidos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Colores en RGB ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jComboBox_rojo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jComboBox_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 70, -1));

        jComboBox_verde.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jComboBox_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 70, -1));

        jComboBox_azul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jComboBox_azul, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 70, -1));

        jButton_RGB.setText("Aplicar ");
        jButton_RGB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton_RGB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RGBActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 195, 100, 40));

        jButton_salir.setText("Exit");
        jButton_salir.setBorder(new javax.swing.border.MatteBorder(null));
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 100, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Rojo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Verde");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Azul");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel_wallPaper.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jLabel_wallPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RGBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RGBActionPerformed
       ColoresRGB();
       this.setVisible(false);
     
      
    }//GEN-LAST:event_jButton_RGBActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jComboBox_solidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_solidoActionPerformed
        
        Solido();
        this.setVisible(false);
        
        
       
        
    }//GEN-LAST:event_jComboBox_solidoActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_RGB;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JComboBox<String> jComboBox_azul;
    private javax.swing.JComboBox<String> jComboBox_rojo;
    private javax.swing.JComboBox<String> jComboBox_solido;
    private javax.swing.JComboBox<String> jComboBox_verde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallPaper;
    // End of variables declaration//GEN-END:variables
}
