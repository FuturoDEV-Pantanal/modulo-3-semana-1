package SRP.bad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {

    private static final String EMAIL_PATTERN =
    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

   private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public String CodigoInterno;
    public String NomeCliente;
    public String Cpf;
    public Boolean Ativo;
    public String Cidade;
    public String Cep;
    public String Numero;
    public String Logradouro;
    public String DataAniversario;
    public String Email;
    public String TelefonFixo;

    public void SalvarCadastroNoBanco() {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";


        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // SQL statement para inserir os dados na tabela "users"
            String sql = "INSERT INTO Cliente (nome) VALUES (?, ?)";

            // Preparando o statement com os dados a serem inseridos
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, NomeCliente);

            // Executando o statement para persistir os dados no banco de dados
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Dados inseridos com sucesso!");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public Boolean ValidarCadastro() {
        return true;
    }

    public Boolean EnviarEmail() {
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }

    public boolean ValidarCPF() {
        
        // Remover caracteres especiais do CPF
        var cpf = Cpf.replaceAll("[^0-9]", "");

        // Verificar se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verificar se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcular o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digit1 = 11 - (sum % 11);
        if (digit1 > 9) {
            digit1 = 0;
        }

        // Calcular o segundo dígito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digit2 = 11 - (sum % 11);
        if (digit2 > 9) {
            digit2 = 0;
        }

        // Verificar se os dígitos verificadores são iguais aos dígitos do CPF
        return (digit1 == cpf.charAt(9) - '0' && digit2 == cpf.charAt(10) - '0');
    }

}