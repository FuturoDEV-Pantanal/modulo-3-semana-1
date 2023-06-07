package exercicio.correcao;

public class exercicio_ifs {

    public static void main(String[] args) {
        
        int numeroVerificado = 10;
        boolean primeiraCondicao = true;
        boolean segundaCondicao = true;
        boolean cond3 = true;
        boolean cond4 = false;
        boolean cond5 = true;

        if (!(numeroVerificado > 5)) {
            System.out.println("O número é menor ou igual a 5!");
            return;
        }

        if (!(primeiraCondicao && segundaCondicao)) {
            System.out.println("As condições 1 e 2 são falsas!");
            return;
        }

        if (!(cond3 || cond4)) {
            System.out.println("As condições 3 e 4 são falsas!");
            return;
        }

        if (cond5) {
            System.out.println("A condição 5 é falsa!");
            return;
        }

        System.out.println("Todas as condições são verdadeiras!");
    }
}

