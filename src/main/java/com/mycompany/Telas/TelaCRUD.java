package com.mycompany.Telas;

import com.mycompany.DAO.ConnectionFactory;
import com.mycompany.DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCRUD extends javax.swing.JFrame {

    public TelaCRUD() {
        initComponents();
    }

    private void popularTabela() {
        // Definindo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Limpa as linhas da tabela

        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obterConexao()) {
            String sql = "SELECT * FROM tb_usuarios";  // Consulta SQL para pegar todos os registros
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Iterando sobre os resultados e adicionando cada linha na tabela
            while (rs.next()) {
                String nome = rs.getString("nome");  // Pega o nome
                String usuario = rs.getString("usuario");  // Pega o email
                String email = rs.getString("email");  // Pega o email
                String senha = rs.getString("senha");  // Pega o email

                // Adiciona uma nova linha na tabela com os dados
                model.addRow(new Object[]{nome, usuario, email, senha});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(1290, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastro de Alunos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 350, -1));

        jPanel4.setBackground(new java.awt.Color(0, 74, 173));
        jPanel4.setPreferredSize(new java.awt.Dimension(1030, 56));
        jPanel4.setLayout(null);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 25)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("G");
        jPanel4.add(jLabel21);
        jLabel21.setBounds(40, 10, 20, 20);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("GAMS");
        jLabel22.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel22.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel22);
        jLabel22.setBounds(30, 30, 50, 19);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dashboard");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel5);
        jLabel5.setBounds(500, 10, 240, 40);

        jButton1.setBackground(new java.awt.Color(0, 74, 173));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(1180, 20, 100, 30);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnListar.setBackground(new java.awt.Color(0, 74, 173));
        btnListar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar);
        btnListar.setBounds(440, 490, 110, 28);

        btnAtualizar.setBackground(new java.awt.Color(0, 74, 173));
        btnAtualizar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizar);
        btnAtualizar.setBounds(440, 450, 110, 28);

        btnCadastrar.setBackground(new java.awt.Color(0, 74, 173));
        btnCadastrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar);
        btnCadastrar.setBounds(290, 450, 110, 28);

        btnApagar.setBackground(new java.awt.Color(0, 74, 173));
        btnApagar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnApagar.setForeground(new java.awt.Color(255, 255, 255));
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnApagar);
        btnApagar.setBounds(290, 490, 110, 28);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("E-mail");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 270, 80, 21);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtEmail);
        txtEmail.setBounds(300, 300, 239, 30);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(300, 210, 239, 30);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuário");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 180, 80, 21);

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtNome);
        txtNome.setBounds(300, 130, 239, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Completo", "Usuário", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(650, 180, 530, 240);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 100, 60, 21);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Senha");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 350, 60, 21);

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtSenha);
        txtSenha.setBounds(300, 380, 240, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1290, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        TelaInicialProfessor telaInicialProfessor = new TelaInicialProfessor();
        this.setVisible(false);
        telaInicialProfessor.setVisible(true);

    }//GEN-LAST:event_jLabel22MouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        String usuario = txtUsuario.getText();
        String email = txtEmail.getText();
        String senha = txtSenha.getText();

        UsuarioDAO p = new UsuarioDAO();
        p.setNome(nome);
        p.setUsuario(usuario);
        p.setEmail(email);
        p.setSenha(senha);
        p.inserir();

        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        popularTabela();  // Atualiza a tabela
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            String nome = txtNome.getText();
            String usuario = txtUsuario.getText();
            String email = txtEmail.getText();
            String senha = txtSenha.getText();

            UsuarioDAO p = new UsuarioDAO();
            p.setNome(nome);
            p.setUsuario(usuario);
            p.setEmail(email);
            p.setSenha(senha);
            p.atualizar();

            JOptionPane.showMessageDialog(this, "Usuário atualizada com sucesso!");
            popularTabela();  // Atualiza a tabela
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código inválido.");
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        try {
            String usuario = txtUsuario.getText();

            UsuarioDAO p = new UsuarioDAO();
            p.setUsuario(usuario);
            p.apagar();

            JOptionPane.showMessageDialog(this, "Pessoa apagada com sucesso!");
            popularTabela();  // Atualiza a tabela
            limparCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Código inválido.");
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        popularTabela();  // Atualiza a tabela com os dados mais recentes
    }//GEN-LAST:event_btnListarActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        TelaDashboard telaDashboard = new TelaDashboard();
        this.setVisible(false);
        telaDashboard.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaLoginPrincipal telaLoginPrincipal = new TelaLoginPrincipal();
        this.setVisible(false);
        telaLoginPrincipal.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
