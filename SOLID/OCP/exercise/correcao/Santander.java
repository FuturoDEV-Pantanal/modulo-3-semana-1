package OCP.exercise.correcao;

public class Santander extends CaixaEletronico {

    @Override
    public void Deposito(String valor) {
       System.out.println("Depositando no Santander ...");
    }

    @Override
    public void Saque(String valor) {
        System.out.println("Sacando no Santander ...");
    }
    
}
