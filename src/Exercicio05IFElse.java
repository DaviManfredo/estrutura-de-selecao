import java.util.Scanner;

public class Exercicio05IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                double TempC;

        System.out.print("Qual a temperatura em celcius --> ");
        TempC = sc.nextDouble();

        if(TempC <=20){
            System.out.println("A temperatura está fria");
        }
        else{
            System.out.println("A temperatura está quente");
        }
    }
}
