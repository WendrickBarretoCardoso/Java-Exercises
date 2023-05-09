import java.util.Scanner;

public class java13Repetition {
    public static void main(String[] args) throws Exception {
        getNumbers();
    }

    public static void getNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número para ser a base: ");
        int num1 = scan.nextInt();
        System.out.print("Informe um número para ser o expoente: ");
        int num2 = scan.nextInt();
        scan.close();
        System.out.print(String.format("A %dº potência da base %d é: %d", num2, num1, power(num1, num2)));
    }

    public static int power(int num1, int num2) {
        int powerResult = 1;
        if (num2 == 0) {
            return powerResult;
        } else {
            for (int i = 0; i < num2; i++) {
                powerResult = powerResult * num1;
            }
        }
        return powerResult;
    }
}
