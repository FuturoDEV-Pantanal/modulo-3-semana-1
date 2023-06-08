package OCP.exercise.correcao;

public abstract class CaixaEletronico {

    public String bancoSelecionado;
    public String numeroAgencia;
    public String numeroConta;

    public abstract void Saque(String valor);
    public abstract void Deposito(String valor);
    
}
