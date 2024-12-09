package com.mycompany.classes;

import com.mycompany.DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String usuario;
    private String senha;
    private boolean admin;

    // Construtores
    public Usuario() {
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String email, String usuario, String senha, boolean admin) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.admin = admin;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public static int contarPessoasPorCurso(String nomeCurso) {
        String sql = "SELECT COUNT(*) AS quantidade FROM tb_usuarios WHERE curso = ?";
        try (Connection conn = new ConnectionFactory().obterConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeCurso);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("quantidade"); // Retorna o número de pessoas no curso
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao contar pessoas no curso: " + e.getMessage());
        }
        return 0; // Retorna 0 se houver algum erro ou nenhum resultado
    }
}
