import java.util.Scanner;

public class exercicioEstSelecao06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double nota1, nota2, nota3;
        double media;

        System.out.print("qual a sua primeira nota---> ");
        nota1 = sc.nextDouble();

        System.out.print("qual a sua segunda nota---> ");
        nota2 = sc.nextDouble();

        System.out.print("qual a sua terceira nota---> ");
        nota3 = sc.nextDouble();

       media = (nota1 + nota2 + nota3)/3;

        System.out.println("media de suas notas é de "+ String.format("%.2f",media));
        if(media >= 6) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
