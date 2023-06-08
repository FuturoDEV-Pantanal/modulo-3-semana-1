package OCP.exercise.correcao;

public class Bradesco extends CaixaEletronico {

    @Override
    public void Deposito(String valor) {
       System.out.println("Depositando no Bradesco ...");
    }

    @Override
    public void Saque(String valor) {
        System.out.println("Sacando no Bradesco ...");
    }
    
}
