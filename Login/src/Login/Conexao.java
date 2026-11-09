package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
    public Connection con = null;
    public Statement stmt = null;
    public ResultSet resultset = null;

                    // CONFIGURAÇÕES DO BANCO DE DADOS
    private final String servidor = "jdbc:mysql://localhost:3306/bd_Login";

    private final String usuario = "root";  // Usuario do banco de dados
    private final String senha = "123456"; // Senha do banco de dados
    private final String driver = "com.mysql.cj.jdbc.Driver";

    public Connection abrirConexao() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(servidor, usuario, senha);
            stmt = con.createStatement();
            System.out.println("Conexão aberta com sucesso");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro ao acessar banco de dados, verifique! " + e.getMessage());
        }
        return con;
    }

    public void fecharConexao() {
        try {
            con.close();
            System.out.println("Conexão finalizada com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro ao encerrar conexão: " + e.getMessage());
        }
    }
}