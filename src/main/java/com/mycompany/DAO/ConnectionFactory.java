package com.mycompany.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String usuario = "root";
    private static final String senha = "root";
    private static final String host = "localhost";
    private static final String porta = "3306";
    private static final String db = "sistema_cursos";

    public static Connection obterConexao() {
        try {
            String url = "jdbc:mysql://" + host + ":" + porta + "/" + db + "?serverTimezone=UTC";
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}

