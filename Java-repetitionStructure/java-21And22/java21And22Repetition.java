import java.util.Scanner;
import java.util.ArrayList;

public class java21And22Repetition {
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
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int num = getNumber();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                prime.add(i);
            }
        }
        if (num == 1) {
            System.out.println("O número 1 não é um número primo.");
        } else {
            if (prime.size() > 2) {
                System.out.println("O número "+ num + " não é um número primo. Ele é divisível por:");
                for (int i = 0; i < prime.size(); i++) {
                    if (i <= prime.size() - 2) {
                        System.out.print(prime.get(i) + ", ");
                    } else {
                        System.out.print(prime.get(i) + ".");
                    }
                }
            }
        }
    }
}
