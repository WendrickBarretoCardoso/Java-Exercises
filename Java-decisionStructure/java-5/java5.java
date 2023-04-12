import java.util.Scanner;

public class java5 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a sua 1º nota:  ");
        double nota1 = scan.nextDouble();
        System.out.print("Informe a sua 2º nota:  ");
        double nota2 = scan.nextDouble();

        if ((nota1+nota2)/2 == 10) {
            System.out.println("Aprovado com Distinção");
        } else if ((nota1+nota2)/2 > 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        scan.close();
    }
}
