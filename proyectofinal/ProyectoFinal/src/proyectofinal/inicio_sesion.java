/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.Font;
import static javafx.scene.text.Font.font;

/**
 *
 * @author Jorge
 */
public class Inicio_Sesion extends javax.swing.JFrame {
    
  
    
    
    public Inicio_Sesion() {
        initComponents();
        setLocationRelativeTo(this);
    }
    boolean a=true;
        Menu m=new Menu();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TipoUsuario = new javax.swing.JComboBox<>();
        NombreText = new javax.swing.JTextField();
        ContraText = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/UsuarioIcono1.0.png"))); // NOI18N

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Padres", "Maestro" }));

        NombreText.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        NombreText.setForeground(new java.awt.Color(153, 153, 153));
        NombreText.setText("Alguien@correo.com");
        NombreText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreTextMouseClicked(evt);
            }
        });
        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });

        ContraText.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        ContraText.setForeground(new java.awt.Color(153, 153, 153));
        ContraText.setText("Putoelquelolee");
        ContraText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraTextMouseClicked(evt);
            }
        });

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar Sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(148, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(NombreText)
                            .addComponent(ContraText))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContraText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    char i='\u25cf';
    if (a==true) {  // a es una variable boolean en true
    ContraText.setEchoChar((char)0); // este método es el que hace visible el texto del jPasswordField
    a = false;
   
    } else {
    ContraText.setEchoChar(i); // i es el char
    a = true;
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
     
 
   
    }//GEN-LAST:event_NombreTextActionPerformed

    private void NombreTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTextMouseClicked
        NombreText.setText("");
        NombreText.setFont(new Font("Tahoma",Font.PLAIN,12));
        NombreText.setForeground(Color.BLACK);
    }//GEN-LAST:event_NombreTextMouseClicked

    private void ContraTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraTextMouseClicked
        ContraText.setText("");
        ContraText.setFont(new Font("Tahoma",Font.PLAIN,12));
        ContraText.setForeground(Color.BLACK);
    }//GEN-LAST:event_ContraTextMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        m.setVisible(true);
        
    Menu.Wachear.setText(NombreText.getText());
    Menu.TipoText.setText(TipoUsuario.getItemAt(TipoUsuario.getSelectedIndex()));
               
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ContraText;
    public static javax.swing.JTextField NombreText;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}