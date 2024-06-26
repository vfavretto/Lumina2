/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lumina.View;

import lumina.Controller.Controller;
import javax.swing.JOptionPane;


/**
 *
 * @author sooar
 */
public class Login2 extends javax.swing.JFrame {
Controller controle;
    public Login2() {
        initComponents();
        controle = new Controller();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldUsuario = new javax.swing.JTextField();
        txtUser = new javax.swing.JLabel();
        txtLogin = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        panelVerdeDecorativo = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        fieldSenha = new javax.swing.JPasswordField();
        panelVerdeDecorativo1 = new javax.swing.JPanel();
        txtAdm = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fieldUsuario1 = new javax.swing.JTextField();
        txtUser1 = new javax.swing.JLabel();
        txtLogin1 = new javax.swing.JLabel();
        txtSenha1 = new javax.swing.JLabel();
        panelVerdeDecorativo2 = new javax.swing.JPanel();
        btnLogin1 = new javax.swing.JButton();
        fieldSenha1 = new javax.swing.JPasswordField();
        panelVerdeDecorativo3 = new javax.swing.JPanel();
        txtAdm1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldUsuario.setBackground(new java.awt.Color(102, 102, 102));
        fieldUsuario.setToolTipText("");
        fieldUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        fieldUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        fieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuarioActionPerformed(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setText("Usuário");

        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(204, 204, 204));
        txtLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogin.setText("Login");

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setText("Senha");

        panelVerdeDecorativo.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout panelVerdeDecorativoLayout = new javax.swing.GroupLayout(panelVerdeDecorativo);
        panelVerdeDecorativo.setLayout(panelVerdeDecorativoLayout);
        panelVerdeDecorativoLayout.setHorizontalGroup(
            panelVerdeDecorativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelVerdeDecorativoLayout.setVerticalGroup(
            panelVerdeDecorativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Entrar");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        fieldSenha.setBackground(new java.awt.Color(102, 102, 102));
        fieldSenha.setForeground(new java.awt.Color(255, 255, 255));
        fieldSenha.setText("jPasswordField1");
        fieldSenha.setBorder(new javax.swing.border.MatteBorder(null));

        panelVerdeDecorativo1.setBackground(new java.awt.Color(0, 102, 102));

        txtAdm.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtAdm.setForeground(new java.awt.Color(255, 255, 255));
        txtAdm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdm.setText("Adminstrador Lumina");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        fieldUsuario1.setBackground(new java.awt.Color(102, 102, 102));
        fieldUsuario1.setToolTipText("");
        fieldUsuario1.setBorder(new javax.swing.border.MatteBorder(null));
        fieldUsuario1.setCaretColor(new java.awt.Color(255, 255, 255));
        fieldUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUsuario1ActionPerformed(evt);
            }
        });

        txtUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUser1.setForeground(new java.awt.Color(255, 255, 255));
        txtUser1.setText("Usuário");

        txtLogin1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLogin1.setForeground(new java.awt.Color(204, 204, 204));
        txtLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogin1.setText("Login");

        txtSenha1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSenha1.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha1.setText("Senha");

        panelVerdeDecorativo2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout panelVerdeDecorativo2Layout = new javax.swing.GroupLayout(panelVerdeDecorativo2);
        panelVerdeDecorativo2.setLayout(panelVerdeDecorativo2Layout);
        panelVerdeDecorativo2Layout.setHorizontalGroup(
            panelVerdeDecorativo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelVerdeDecorativo2Layout.setVerticalGroup(
            panelVerdeDecorativo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnLogin1.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Entrar");
        btnLogin1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogin1MouseClicked(evt);
            }
        });

        fieldSenha1.setBackground(new java.awt.Color(102, 102, 102));
        fieldSenha1.setForeground(new java.awt.Color(255, 255, 255));
        fieldSenha1.setText("jPasswordField1");
        fieldSenha1.setBorder(new javax.swing.border.MatteBorder(null));

        panelVerdeDecorativo3.setBackground(new java.awt.Color(0, 102, 102));

        txtAdm1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        txtAdm1.setForeground(new java.awt.Color(255, 255, 255));
        txtAdm1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdm1.setText("Adminstrador Lumina");

        javax.swing.GroupLayout panelVerdeDecorativo3Layout = new javax.swing.GroupLayout(panelVerdeDecorativo3);
        panelVerdeDecorativo3.setLayout(panelVerdeDecorativo3Layout);
        panelVerdeDecorativo3Layout.setHorizontalGroup(
            panelVerdeDecorativo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdm1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        panelVerdeDecorativo3Layout.setVerticalGroup(
            panelVerdeDecorativo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerdeDecorativo3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAdm1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerdeDecorativo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVerdeDecorativo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtLogin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser1)
                    .addComponent(txtSenha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(fieldSenha1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelVerdeDecorativo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLogin1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha1)
                    .addComponent(fieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelVerdeDecorativo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelVerdeDecorativo1Layout = new javax.swing.GroupLayout(panelVerdeDecorativo1);
        panelVerdeDecorativo1.setLayout(panelVerdeDecorativo1Layout);
        panelVerdeDecorativo1Layout.setHorizontalGroup(
            panelVerdeDecorativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelVerdeDecorativo1Layout.setVerticalGroup(
            panelVerdeDecorativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerdeDecorativo1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerdeDecorativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser)
                    .addComponent(txtSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(fieldSenha)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLogin)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelVerdeDecorativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuarioActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if (controle.login(fieldUsuario.getText(), new String(fieldSenha.getPassword()))) {
            // Se o login for efetuado, abre a TelaAdm e feche a janela de Login
            TelaAdm telaAdm = new TelaAdm();
            telaAdm.setVisible(true);
            this.dispose();
        } else {
            // Exibe uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos");
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void fieldUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUsuario1ActionPerformed

    private void btnLogin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogin1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1MouseClicked

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
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JPasswordField fieldSenha1;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JTextField fieldUsuario1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelVerdeDecorativo;
    private javax.swing.JPanel panelVerdeDecorativo1;
    private javax.swing.JPanel panelVerdeDecorativo2;
    private javax.swing.JPanel panelVerdeDecorativo3;
    private javax.swing.JLabel txtAdm;
    private javax.swing.JLabel txtAdm1;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtLogin1;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtSenha1;
    private javax.swing.JLabel txtUser;
    private javax.swing.JLabel txtUser1;
    // End of variables declaration//GEN-END:variables
}
