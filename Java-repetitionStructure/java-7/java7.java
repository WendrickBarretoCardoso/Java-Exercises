import java.util.Scanner;

public class java7 {
    public static void main(String[] args) throws Exception {
        prinBigger();
    }

    public static void prinBigger() {
        int[] arrayNumb = new int[5];
        arrayNumb = getNumber(arrayNumb);
        int biggerNumb = testBigger(arrayNumb);
        System.out.println("O maior número é: " + biggerNumb);
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

    public static int testBigger(int[] arrayNumb) {
        int newArray = arrayNumb[0];
        for (int i = 1; i < arrayNumb.length; i++) {
            if (newArray < arrayNumb[i]) {
                newArray = arrayNumb[i];
            }
        }
        return newArray;
    }
}
