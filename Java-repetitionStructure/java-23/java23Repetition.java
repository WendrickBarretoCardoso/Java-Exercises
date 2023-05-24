import java.util.Scanner;
import java.util.ArrayList;

public class java23Repetition {
    public static void main(String[] args) {
        prime();
    }

    public static int getNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número final, maior que 1, para pergarmos os números primos no intervalo entre eles: ");
        int finalNumber = scan.nextInt();
        while (finalNumber < 1) {
            System.out.print("Informe um número maior que 1: ");
            finalNumber = scan.nextInt();
        }
        scan.close();
        return finalNumber;
    }

    public static void prime() {
        ArrayList<Integer> divisivel = new ArrayList<Integer>();
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int finalNumber = getNumbers();
        for (int i = 1; i <= finalNumber; i++) {
            for (int y = 1; y <= finalNumber; y++) {
                if (y <= i) {
                    if (i % y == 0) {
                        divisivel.add(y);
                    }
                }
            }
            if (divisivel.size() == 2) {
                prime.add(i);
            }
            divisivel.clear();
        }
        System.out.println("Os números primos existente no intervalo de 1 a "+ finalNumber +" é: ");
        for (int i = 0; i < prime.size(); i++) {
            if (i <= prime.size() - 2) {
                 System.out.print(prime.get(i) + ", ");
            } else {
                System.out.print(prime.get(i) + ".");
            }
        }        
    }
}