package OCP.exercise;

public class CaixaEletronico {

    private String bancoSelecionado;
    private String numeroAgencia;
    private String numeroConta;

    public CaixaEletronico(String banco, String agencia, String conta) {
        this.bancoSelecionado = banco;
        this.numeroAgencia = agencia;
        this.numeroConta = conta;
    }

    public void Sacar(Double saque) {

        if (bancoSelecionado == "Caixa Economica") {

            /*
             * Informar os dados bancario para o sistema da Caixa
             * Executar a ação do saque.
             */

        } else if (bancoSelecionado == "Bradesco") {

            /*
             * Informar os dados bancario para o sistema do Bradesco
             * Executar a ação do saque.
             */

        } else if (bancoSelecionado == "Itaú") {

            /*
             * Informar os dados bancario para o sistema do Itaú
             * Executar a ação do saque.
             */

        } else if (bancoSelecionado == "Santander") {

            /*
             * Informar os dados bancario para o sistema do Santander
             * Executar a ação do saque.
             */

        }

        // outros bancos ....

    }

    public void Deposito(Double deposito) {

        if (bancoSelecionado == "Caixa Economica") {

            /*
             * Informar os dados bancario para o sistema da Caixa
             * Executar a ação do Deposito.
             */

        } else if (bancoSelecionado == "Bradesco") {

            /*
             * Informar os dados bancario para o sistema do Bradesco
             * Executar a ação do Deposito.
             */

        } else if (bancoSelecionado == "Itaú") {

            /*
             * Informar os dados bancario para o sistema do Itaú
             * Executar a ação do Deposito.
             */

        } else if (bancoSelecionado == "Santander") {

            /*
             * Informar os dados bancario para o sistema do Santander
             * Executar a ação do Deposito.
             */

        }

        // outros bancos ....

    }
}
