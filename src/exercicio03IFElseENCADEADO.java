import java.util.Scanner;

public class exercicio03IFElseENCADEADO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Usuario, Senha;

        System.out.println("Qual o seu usuario");
        Usuario = sc.next();

        if (Usuario.equals("admin")) {

            System.out.println("Qual a sua senha");
            Senha = sc.next();

            if (Senha.equals("fiap2026"))
                System.out.println("Acesso Liberado");

            else
                System.out.println("Senha incorreta");

        } else
            System.out.println("Usuario Não encontrado");


    }
}
