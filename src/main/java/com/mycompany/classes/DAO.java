package com.mycompany.classes;

import com.mycompany.DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    public boolean existe(Usuario usuario, String tipoEsperado) throws SQLException {
        String sql = "SELECT tipo FROM tb_usuarios WHERE usuario = ? AND senha = ?";

        try (Connection conn = ConnectionFactory.obterConexao(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getSenha());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String tipoUsuario = rs.getString("tipo");

                    if ("admin".equals(tipoUsuario)) {
                        return true;
                    }
                    return tipoEsperado.equals(tipoUsuario);
                }
            }
        }
        return false;
    }
}
