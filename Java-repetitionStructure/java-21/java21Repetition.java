import java.util.Scanner;

public class java21Repetition {
    public static void main(String[] args) {
        primeNumber();
    }

    public static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int num = scan.nextInt();
        while (num < 0) {
            System.out.print("O número informado precisa ser um número inteiro.\nInsira Novamente: ");
            num = scan.nextInt();
        }
        scan.close();
        return num;
    }

    public static void primeNumber() {
        int num = getNumber();
        if (num != 1) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.print(String.format("O número %d não é um número primo pois ele é dividído também por %d.", num, i));
                    break;
                }
            }
            System.out.println("O número "+ num +" é um número primo.");
        } else {
            System.out.println("O número 1 não é um número primo.");
        }
    }
}
