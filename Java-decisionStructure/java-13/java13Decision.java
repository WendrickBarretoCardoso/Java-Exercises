import java.util.Scanner;

public class java13Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] semana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        System.out.print("1 - Domingo, 2 - Segunda, 3 - Terça, 4 - Quarta, 5 - Quinta, 6 - Sexta, 7 - Sábado\n" +
        "Informe um dia correspondente ao dia da semana: ");
        int dia = scan.nextInt();
        while (dia < 1 || dia > 7) {
            System.out.print("Informer um dia entre 1 - 7\nInforme um dia correspondente ao dia da semana: ");
            dia = scan.nextInt();
        }

        for (int i = 0; i < semana.length; i++) {
            if (dia == i+1) {
                System.out.println("O dia que vc escolheu é " + semana[i]);
                break;
            }
        }
        scan.close();
    }
}
