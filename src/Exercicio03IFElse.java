import java.util.Scanner;

public class Exercicio03IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Lado1, Lado2, Lado3;

        System.out.print("Qual o primeiro lado do triangulo?");
            Lado1 = sc.nextDouble();

        System.out.print("Qual o segundo lado do triangulo?");
            Lado2 = sc.nextDouble();

        System.out.print("Qual o segundo lado do triangulo?");
            Lado3 = sc.nextDouble();

        if(Lado1 + Lado2 > Lado3 && Lado1 + Lado3 > Lado2 && Lado2 + Lado3 > Lado1){
            System.out.println("Esses valores representam um Triangulo");

        }

        else{
            System.out.println("Esses valores não representam um triangulo");
        }
    }
}
