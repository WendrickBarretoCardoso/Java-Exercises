import java.util.Scanner;

public class java9And10Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperatura em ºF: ");
        double temp = scan.nextDouble();
        System.out.print("Temperatura em ºC: ");
        double temp2 = scan.nextDouble();
        scan.close();

        System.out.printf(String.format("A temperatura em ºC ficou: %.2f ºC", (5 * (temp - 32) / 9)));
        System.out.printf(String.format("\nA temperatura em ºF ficou: %.2f ºF", (((9 * temp2) / 5) + 32)));
    }
}
