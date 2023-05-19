import java.util.Scanner;

public class java17And20Repetition {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        getFactorial(getNumber(scan), scan);
        scan.close();
    }

    public static int getNumber(Scanner scan) {
        System.out.print("Informe um número: ");
        int factorial = scan.nextInt();
        return factorial;
    }

    public static void getFactorial(int factorial, Scanner scan) {
        int result = 1;
        for (int i = factorial; i > 0; i--) {
            result = result * i;
        }

        System.out.print(String.format("O factorial de %d! é: %d", factorial, result));
        askAgain(scan);
    }

    public static void askAgain(Scanner scan) {
        System.out.print("\nQuer fazer o fatorial novamente?    S - Sim  |  N - Não\nR:");
        String resp = scan.nextLine().toLowerCase();
        while (!resp.equals("s") && !resp.equals("n")) {
            System.out.print("\nInformação errada, insira sua resposta novamente.    S - Sim  |  N - Não \nR:");
            resp = scan.nextLine().toLowerCase();
        }
        if (resp.equals("s")) {
            getFactorial(getNumber(scan), scan);
        } else {
            System.out.println("OK!");
        }
    }
}
