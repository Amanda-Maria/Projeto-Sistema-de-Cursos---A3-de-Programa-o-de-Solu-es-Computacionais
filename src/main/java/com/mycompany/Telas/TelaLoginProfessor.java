package com.mycompany.Telas;

import com.mycompany.classes.DAO;
import com.mycompany.classes.Usuario;
import javax.swing.JOptionPane;

public class TelaLoginProfessor extends javax.swing.JFrame {

    public TelaLoginProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        checkMostrarSenha = new javax.swing.JCheckBox();
        senhaPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(1029, 820));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 74, 173));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 820));
        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 70)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GAMS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 370, 220, 100);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 170)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("G");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 230, 140, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 820);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 820));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(210, 470, 240, 32);

        checkMostrarSenha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        checkMostrarSenha.setForeground(new java.awt.Color(0, 0, 0));
        checkMostrarSenha.setText("Mostrar Senha");
        checkMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostrarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(checkMostrarSenha);
        checkMostrarSenha.setBounds(210, 430, 130, 19);

        senhaPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        senhaPasswordField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        senhaPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(senhaPasswordField);
        senhaPasswordField.setBounds(210, 380, 240, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 350, 55, 21);

        loginTextField.setBackground(new java.awt.Color(255, 255, 255));
        loginTextField.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        loginTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(loginTextField);
        loginTextField.setBounds(210, 290, 240, 30);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(210, 250, 48, 21);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(160, 220, 330, 340);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(640, 0, 640, 820);

        setSize(new java.awt.Dimension(1293, 827));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String login = loginTextField.getText();
        String senha = new String(senhaPasswordField.getPassword()).trim();

        try {
            Usuario usuario = new Usuario(login, senha);
            DAO dao = new DAO();

            if (dao.existe(usuario, "professor")) {
                TelaInicialProfessor telaInicialProfessor = new TelaInicialProfessor();
                telaInicialProfessor.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos para professor");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro. Tente novamente mais tarde");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostrarSenhaActionPerformed
        if (checkMostrarSenha.isSelected()) {
            senhaPasswordField.setEchoChar((char) 0); // Mostra a senha como texto
        } else {
            senhaPasswordField.setEchoChar('*'); // Oculta a senha como asteriscos
        }
    }//GEN-LAST:event_checkMostrarSenhaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TelaLoginPrincipal telaLoginPrincipal = new TelaLoginPrincipal();
        telaLoginPrincipal.setVisible(true);
        this.dispose(); // Fecha a tela secundária
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkMostrarSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JPasswordField senhaPasswordField;
    // End of variables declaration//GEN-END:variables
}
