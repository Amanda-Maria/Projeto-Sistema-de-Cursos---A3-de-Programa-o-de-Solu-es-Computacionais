package com.mycompany.DAO;

import com.mycompany.DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private String nome;
    private String usuario;
    private String email;
    private String senha;

    public void inserir() {
        String sql = "INSERT INTO tb_usuarios(nome, usuario, email, senha) VALUES (?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, usuario);
            ps.setString(3, email);
            ps.setString(4, senha);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizar() {
        String sql = "UPDATE tb_usuarios SET nome = ?, usuario = ?, email = ? WHERE senha = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, usuario);
            ps.setString(3, email);
            ps.setString(4, senha); // senha é usada para localizar o registro a ser atualizado
            ps.executeUpdate(); // use executeUpdate para UPDATE queries
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void apagar() {
        String sql = "DELETE FROM tb_usuarios WHERE usuario = ?";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, this.usuario);  // Substitui o ? pelo valor do atributo usuario
            int linhasAfetadas = ps.executeUpdate();  // Executa o comando
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listar() {
        String sql = "SELECT * FROM tb_usuarios";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            StringBuilder lista = new StringBuilder();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String usuario = rs.getString("usuario");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                lista.append(String.format("Nome: %s, Usuário: %s, Email: %s, Senha: %s\n", nome, usuario, email, senha));
            }

            JOptionPane.showMessageDialog(null, lista.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
