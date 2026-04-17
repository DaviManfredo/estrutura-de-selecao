import java.util.Scanner;

public class exercicio01IFElseENCADEADO {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
          int qtndiarias;
          double conta, taxa;

        System.out.print("Quantas Diarias foram solicitadas? ");
        qtndiarias = sc.nextInt();

        if (qtndiarias > 15){
            taxa = 15.50;

        }
        else if(qtndiarias == 15) {
            taxa = 36;
        }
        else {
                taxa = 58;
            }
        conta = qtndiarias * (250 + taxa);

        System.out.println("Conta --> R$"+ conta);
    }
}
