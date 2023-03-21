import java.util.Scanner;

public class java8 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: R$ ");
        double hora = scan.nextDouble();
        System.out.print("Quanto horas você trabalha no mês: ");
        double qtdHora = scan.nextDouble();
        scan.close();

        System.out.printf(String.format("Você ganha aproximadamente: R$ %.2f", (hora*qtdHora)));
    }
}
