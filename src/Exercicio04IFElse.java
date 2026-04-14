import java.util.Scanner;

public class Exercicio04IFElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int AnoRef;

        System.out.print("Informe o ano --> ");
        AnoRef = sc.nextInt();

        if(AnoRef%4 == 0 && AnoRef%100 == 0){
            if (AnoRef%400 == 0){
                System.out.println("O ano é bissexto");
            }

            else{
                System.out.println("O ano não é Bissexto");
            }

        }
        else {
            if (AnoRef%4 == 0 || AnoRef%400 == 0){
                System.out.println("O ano é bissexto");
            }
            else{
                System.out.println("O ano não é bissexto");
            }

        }

    }
}
