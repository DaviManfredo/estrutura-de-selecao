import java.util.Scanner;

public class exercicio01IFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double VLRcompra, VLRfinalcompra, desconto;

        System.out.print("qual o valor da compra? ");
        VLRcompra = sc.nextDouble();

        if (VLRcompra > 1000) {
            desconto = - VLRcompra * 0.15;
        }
        else {
           desconto = - VLRcompra * 0.8;
        }

        VLRfinalcompra = VLRcompra + desconto;
        System.out.println("o desconto sobre sua conta é de --> " +
                String.format("%.2f",desconto) );

        System.out.println("o valor de sua compra é de --> "+
                String.format("%.2f",VLRfinalcompra) );


    }
}
