import java.util.Scanner;

public class java2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva um número:");
        int num =  scan.nextInt();
        scan.close();

        System.out.println("\nO número informado foi: " + num);
    }
}
