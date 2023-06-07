package SRP.exercicio.correcao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDeDados {

    public void SalvarCliente(Cliente cliente) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";


        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // SQL statement para inserir os dados na tabela "users"
            String sql = "INSERT INTO Cliente (nome) VALUES (?, ?)";

            // Preparando o statement com os dados a serem inseridos
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cliente.NomeCliente);

            // Executando o statement para persistir os dados no banco de dados
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Dados inseridos com sucesso!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
    
}
