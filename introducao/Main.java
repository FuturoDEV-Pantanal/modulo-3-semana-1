package introducao;

public class Main {
    public static void main(String[] args) {

        var cad = new cadastro();
        cad.Id = "1";
        cad.Id2 = "cadcli#1";
        cad.idade = 18;
        cad.contato_email = "cliente@cliente.com.br";
        cad.nm = "Foo Bar Silva";
        cad.contato_telefone = "(11) 1234-5678";
        cad.endereco = "Rua foo, 51 bar, fb, cep:1234-456";
        cad.city = "SP";
        cad.status = true;

        //Checa Se o objeto do Cliente é valido
        if (check(cad)) {
            //Se o cadstro do cliente é valido então salva no banco de dados
            if (save_cadastro(cad)){
                //Envia um email para o cad sobre o cadastro dele
                if (env_email(cad.contato_email)) {
                    //FIM
                    System.out.println("sucesso");
                    return;
                }
            }
        }
    }

    //Esse metodo serve para efetuar cadastro
    public static Boolean save_cadastro(cadastro c) {
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
    public static Boolean check(cadastro c) {

        Boolean result = false;

        if (c.Id != "") {
            if (c.Id2 != "") {
                if (c.city != "") {
                    if (c.contato_email != "") {
                        if (c.contato_telefone != "") {
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