import java.util.Scanner;

public class exercicio02IFElseENCADEADO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String turno;

        System.out.print("Qual o seu turno? ");
        turno = sc.next();

        if(turno.equalsIgnoreCase("manha")){
            System.out.println("O seu turno é das 07H00 às 12H00");
        }
        else if (turno.equalsIgnoreCase("tarde")) {
            System.out.println( "O seu turno é das 13H00 às 18H00");
        }
        else if (turno.equalsIgnoreCase("noite")) {
            System.out.println("O seu turno é das 19H00 às 23H00");
        }
        else {
            System.out.println("Turno invalido");
        }

    }
}
