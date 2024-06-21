
package lumina.View;
import javax.swing.JOptionPane;
import lumina.Controller.*;

public class Login extends javax.swing.JFrame {


    Controller controle;
    public Login() {
        initComponents();
        controle = new Controller();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        fieldUsuario = new javax.swing.JTextField();
        txtUser = new javax.swing.JLabel();
        txtLogin = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        panelVerdeDecorativo = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        fieldSenha = new javax.swing.JPasswordField();
        panelVerdeDecorativo1 = new javax.swing.JPanel();
        txtAdm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(60, 60, 60));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);

        Login.setBackground(new java.awt.Color(51, 51, 51));

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
            .addGap(0, 382, Short.MAX_VALUE)
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

        javax.swing.GroupLayout panelVerdeDecorativo1Layout = new javax.swing.GroupLayout(panelVerdeDecorativo1);
        panelVerdeDecorativo1.setLayout(panelVerdeDecorativo1Layout);
        panelVerdeDecorativo1Layout.setHorizontalGroup(
            panelVerdeDecorativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtAdm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelVerdeDecorativo1Layout.setVerticalGroup(
            panelVerdeDecorativo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerdeDecorativo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVerdeDecorativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser)
                    .addComponent(txtSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(fieldSenha)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addComponent(panelVerdeDecorativo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLogin)
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser))
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha)
                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelVerdeDecorativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JTextField fieldUsuario;
    private javax.swing.JPanel panelVerdeDecorativo;
    private javax.swing.JPanel panelVerdeDecorativo1;
    private javax.swing.JLabel txtAdm;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
