import java.util.Scanner;

public class exercicio02IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double X, Y;

        System.out.print("Qual o valor de X?");
        X = sc.nextDouble();

    // && --> E/AND
    // ||(pipe) --> OU/OR

    if (X >= -5 && X <= 5)
        System.out.print("O valor de X não é valido, portanto o calculo não pode ser efetuado");

    else {
        Y= 8 / Math.sqrt(X*X - 25);
        System.out.println("Y = "+ String.format("%.2f",Y));
    }


    }
}
