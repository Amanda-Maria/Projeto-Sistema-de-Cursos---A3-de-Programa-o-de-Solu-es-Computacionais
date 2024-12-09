
package com.mycompany.Telas;

import com.mycompany.DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaDashboard extends javax.swing.JFrame {

    public TelaDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtusuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Insira o nome do curso para vizualizar o total de alunos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 160, 490, 21);

        tabela.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "E-mail", "Usuário", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 250, 580, 320);

        txtusuario.setBackground(new java.awt.Color(255, 255, 255));
        txtusuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        txtusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtusuario);
        txtusuario.setBounds(280, 200, 310, 30);

        jButton1.setBackground(new java.awt.Color(0, 74, 173));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 200, 98, 30);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dashboard");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 80, 220, 50);

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

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cadastro de alunos");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4);
        jLabel4.setBounds(510, 10, 240, 40);

        jButton2.setBackground(new java.awt.Color(0, 74, 173));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sair");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(1180, 20, 100, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1290, 56);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -5, 1290, 830);

        setSize(new java.awt.Dimension(1301, 827));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//ARRUMAR ARRUMAR <-------------------------------------------------------------------------------------------------------------------------
    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        TelaInicialProfessor telaInicialProfessor = new TelaInicialProfessor();
        this.setVisible(false);
        telaInicialProfessor.setVisible(true);

    }//GEN-LAST:event_jLabel22MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String curso = txtusuario.getText().trim(); 
        String sql;
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Usuario", "Nome", "E-mail", "Curso"}, 0);
        if (curso.isEmpty()) {
            sql = "SELECT * FROM tb_usuarios";
        } else {
            sql = "SELECT * FROM tb_usuarios WHERE curso LIKE ?";
        }
        try (Connection conn = ConnectionFactory.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            if (!curso.isEmpty()) {
                ps.setString(1, "%" + curso + "%"); // Permite busca parcial
            }
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("usuario"),
                        rs.getString("nome"),
                        rs.getString("email"),
                        rs.getString("curso")
                    });
                }
    }
            tabela.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        TelaCRUD telaCRUD = new TelaCRUD();
        this.setVisible(false);
        telaCRUD.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TelaLoginPrincipal telaLoginPrincipal = new TelaLoginPrincipal();
        this.setVisible(false);
        telaLoginPrincipal.setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
