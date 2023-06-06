package good;

class Main {

    public static void main(String[] args) {

        var cliente = new Cliente();
        cliente.Id = "1";
        cliente.CodigoInterno = "cadcli#1";
        cliente.Idade = 18;
        cliente.Email = "cliente@cliente.com.br";
        cliente.Nome = "Foo Bar Silva";
        cliente.Telefone = "(11) 1234-5678";
        cliente.EnderecoCompleto = "Rua foo, 51 bar, fb, cep:1234-456";
        cliente.Cidade = "SP";
        cliente.Ativo = true;

        if (!ValidarCliente(cliente)) {
            return;
        }

        if (!SalvarCadastroCliente(cliente)){
            return;
        }

        if (!EnviarEmail(cliente.Email)) {
            return;
        }

        System.out.println("sucesso");
    }

    public static Boolean SalvarCadastroCliente(Cliente c) {
        //...
        System.out.println("salvo no banco de dados");
        return true;
    }

    public static Boolean EnviarEmail(String c) {
        //...
        System.out.println("enviando email ...");
        return true;
    }

    public static Boolean ValidarCliente(Cliente c) {

        Boolean result = false;

        if (c.Id != "") {
            if (c.CodigoInterno != "") {
                if (c.Cidade != "") {
                    if (c.Email != "") {
                        if (c.Telefone != "") {
                            result = true;
                        } else {
                            System.out.println("telefone invalido");
                            result = false;
                        }

                    } else {
                        System.out.println("email invalido");
                        result = false;
                    }
                } else {
                    System.out.println("city invalido");
                    result = false;
                }
            } else {
                System.out.println("id2 invalido");
                result = false;
            }
        } else {
            System.out.println("id invalido");
            result = false;
        }

        return result;
    }

}