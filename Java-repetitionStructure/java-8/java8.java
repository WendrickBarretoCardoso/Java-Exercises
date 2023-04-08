import java.util.Scanner;

public class java8 {
    public static void main(String[] args) throws Exception {
        prinBigger();
    }

    public static void prinBigger() {
        int[] arrayNumb = new int[5];
        arrayNumb = getNumber(arrayNumb);
        int sumNumb = sumNumbers(arrayNumb);
        int averageNumb = averageNumber(arrayNumb);
        System.out.println("A soma dos 5 números é: " + sumNumb + ", e a média é: " + averageNumb + ".");
    }

    public static int[] getNumber(int[] arrayNumb) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrayNumb.length; i++) {
            System.out.print("Informe um número: ");
            arrayNumb[i] = scan.nextInt();
        }
        scan.close();
        return arrayNumb;
    }

    public static int sumNumbers(int[] arrayNumb) {
        int sumNumb = 0;
        for (int i = 0; i < arrayNumb.length; i++) {
            sumNumb += arrayNumb[i];
        }
        return sumNumb;
    }

    public static int averageNumber(int[] arrayNumb) {
        int averaegeNumb = 0;
        for (int i = 0; i < arrayNumb.length; i++) {
            averaegeNumb += arrayNumb[i];
        }
        return averaegeNumb/arrayNumb.length;
    }
}
