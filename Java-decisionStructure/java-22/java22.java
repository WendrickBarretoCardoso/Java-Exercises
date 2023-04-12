import java.util.Scanner;

public class java22 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Me informe um número inteiro: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println(division(num));
    }

    public static String division(int number) {
        String output = "";
        if (number%2 != 0) {
            output = String.format("O número %d é impar.", number);
        } else {
            output = String.format("O número %d é par.", number);
        }
        return output;
    }
}
