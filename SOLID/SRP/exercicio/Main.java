package SRP.exercicio;

import SRP.exercicio.correcao.BancoDeDados;
import SRP.exercicio.correcao.Cliente;
import SRP.exercicio.correcao.Cpf;
import SRP.exercicio.correcao.Email;

public class Main {

    public static void main(String[] args) {

        var cpf = new Cpf("1098765432");
        cpf.ValidarCPF();

        

        var cliente = new Cliente();
        cliente.Cpf = new Cpf("12345678910");
        cliente.Email = "test@hotmail.com";

        var email = new Email();
        var bancodedados = new BancoDeDados();

        if (cliente.ValidarCadastro()) {
            if (cliente.Cpf.ValidarCPF()) {
               if (email.ValidarEmail(cliente.Email)) {
                    bancodedados.SalvarCliente(cliente);
               }
            }
        }

        
    }
    
}
