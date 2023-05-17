import java.util.Scanner;

public class java17Repetition {
    public static void main(String[] args) throws Exception {
        getFactorial(getNumber());
    }

    public static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int factorial = scan.nextInt();
        scan.close();
        return factorial;
    }

    public static void getFactorial(int factorial) {
        int result = 1;
        for (int i = factorial; i > 0; i--) {
            result = result * i;
        }

        System.out.print(String.format("O factorial de %d! é: %d", factorial, result));
    }
}
