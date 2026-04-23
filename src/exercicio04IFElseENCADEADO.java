import java.util.Scanner;

public class exercicio04IFElseENCADEADO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Imposto, Salario, SalarioLiquido;

        System.out.println("Qual o seu salário");
        Salario = sc.nextDouble();

        if (Salario > 2112.00) {

            if (Salario > 2826.65) {

                if (Salario > 3751.05) {

                    if (Salario > 4664.68) {

                        Imposto = Salario * 0.275;
                        SalarioLiquido = Salario - Imposto;
                        System.out.println("O valor de seu salario bruto é R$ " + String.format("%.2f",Salario) );
                                System.out.println(" O valor de sua aliquota é -> 27.5% " );
                                        System.out.println(" A quantia de imposto é R$ " + String.format("%.2f",Imposto) );
                                                System.out.println(" O seu salário liquido é R$ " + String.format("%.2f",SalarioLiquido) );

                    }


                    else {
                        Imposto = Salario * 0.225;
                        SalarioLiquido = Salario - Imposto;
                        System.out.println("O valor de seu salario bruto é R$ " + String.format("%.2f",Salario) );
                        System.out.println(" O valor de sua aliquota é -> 22.5% ");
                        System.out.println(" A quantia de imposto é R$ " + String.format("%.2f",Imposto) );
                        System.out.println(" O seu salário liquido é R$ " + String.format("%.2f",SalarioLiquido) );
                    }
                }


                else{
                    Imposto = Salario * 0.15;
                    SalarioLiquido = Salario - Imposto;
                    System.out.println("O valor de seu salario bruto é R$ " + String.format("%.2f",Salario) );
                    System.out.println(" O valor de sua aliquota é -> 15% ");
                    System.out.println(" A quantia de imposto é R$ " + String.format("%.2f",Imposto) );
                    System.out.println(" O seu salário liquido é R$ " + String.format("%.2f",SalarioLiquido) );
                }

            }


            else {
                Imposto = Salario *0.075;
                SalarioLiquido = Salario - Imposto;
                System.out.println("O valor de seu salario bruto é R$ " + String.format("%.2f",Salario) );
                System.out.println(" O valor de sua aliquota é -> 7.5% ");
                System.out.println(" A quantia de imposto é R$ " + String.format("%.2f",Imposto) );
                System.out.println(" O seu salário liquido é R$ " + String.format("%.2f",SalarioLiquido) );
            }
        }


        else {
            System.out.println("O valor de seu salario bruto é R$ " + String.format("%.2f",Salario) );
            System.out.println(" O valor de sua aliquota é -> 0% ");
            System.out.println(" A quantia de imposto é R$ 0.00 ");
            System.out.println(" O seu salário liquido é R$ " + String.format("%.2f",Salario) );
    }



    }
}
