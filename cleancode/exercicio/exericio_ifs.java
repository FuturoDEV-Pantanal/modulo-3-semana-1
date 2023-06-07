package exercicio;

public class exericio_ifs {

    public static void main(String[] args) {
        
        int nmb = 10;
        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;
        boolean cond4 = false;
        boolean cond5 = true;

        if (nmb > 5) {
            if (cond1 && cond2) {
                if (cond3 || cond4) {
                    if (cond5) {
                        System.out.println("Todas as condições são verdadeiras!");
                    } else {
                        System.out.println("A condição 5 é falsa!");
                    }
                } else {
                    System.out.println("As condições 3 e 4 são falsas!");
                }
            } else {
                System.out.println("As condições 1 e 2 são falsas!");
            }
        } else {
            System.out.println("O número é menor ou igual a 5!");
        }
    }
}

