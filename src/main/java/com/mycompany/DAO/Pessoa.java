package com.mycompany.DAO;

import com.mycompany.DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Pessoa {

    private int codigo;
    private String nome;
    private String email;

    public void inserir() {
        String sql = "INSERT INTO tb_pessoa(nome, email) VALUES (?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar() {
        String sql = "UPDATE tb_pessoa SET nome = ?, email = ? WHERE codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, email);
            ps.setInt(3, codigo);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void apagar() {
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM tb_pessoa";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            StringBuilder lista = new StringBuilder();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                lista.append(String.format("Código: %d, Nome: %s, Email: %s\n", codigo, nome, email));
            }

            JOptionPane.showMessageDialog(null, lista.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
