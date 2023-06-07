package bad;
class Main {
    public static void main(String[] args) {

        var cad = new Cadastro();
        cad.Id = "1";
        cad.CodigoInterno = "cadcli#1";
        cad.Idade = 18;
        cad.Email = "cliente@cliente.com.br";
        cad.Nome = "Foo Bar Silva";
        cad.Telefone = "(11) 1234-5678";
        cad.EnderecoCompleto = "Rua foo, 51 bar, fb, cep:1234-456";
        cad.Cidade = "SP";
        cad.Ativo = true;

        //Checa Se o objeto do Cliente é valido
        if (check(cad)) {
            //Se o cadstro do cliente é valido então salva no banco de dados
            if (save_cadastro(cad)){
                //Envia um email para o cad sobre o cadastro dele
                if (env_email(cad.Email)) {
                    //FIM
                    System.out.println("sucesso");
                    return;
                }
            }
        }
    }

    //Esse metodo serve para efetuar cadastro
    public static Boolean save_cadastro(Cadastro c) {
        //...
        System.out.println("salvo no banco de dados");
        return true;
    }

    //Esse metodo server para enviar email
    public static Boolean env_email(String c) {
        //...
        System.out.println("enviando email ...");
        return true;
    }


    //Esse metodo serve para checar se é valido
    public static Boolean check(Cadastro c) {

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