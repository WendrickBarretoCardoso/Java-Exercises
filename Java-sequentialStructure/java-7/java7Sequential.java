import java.util.Scanner;

public class java7Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o lado do quadrado: ");
        double lado = scan.nextDouble();
        scan.close();
        double area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f m \nO dobro da área é: %.2f m",area, area*2 );
    }
}
