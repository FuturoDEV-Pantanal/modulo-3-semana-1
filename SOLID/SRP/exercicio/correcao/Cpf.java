package SRP.exercicio.correcao;

public class Cpf {

    public Cpf(String documento) {
       this.valor = documento;
    }

    public String valor;

    public boolean ValidarCPF() {
        
        // Remover caracteres especiais do CPF
        var cpf = valor.replaceAll("[^0-9]", "");

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
