import java.util.Scanner;

public class java5Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira a quantidade de metros: ");
        double met = scan.nextDouble();
        scan.close();

        System.out.printf(String.format("Em cemtímetros ficou: %.2f cm",(met * 100)));
    }
}
