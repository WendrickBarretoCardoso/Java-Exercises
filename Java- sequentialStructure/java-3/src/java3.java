import java.util.Scanner;

public class java3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva dois números: \n1:");
        int num1 = scan.nextInt();
        System.out.print("2:");
        int num2 = scan.nextInt();
        scan.close();

        System.out.printf(String.format("A soma dos dois números são: %d",(num1 + num2)));
    }
}
