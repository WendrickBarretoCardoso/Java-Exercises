import java.util.Scanner;

public class java11Repetition {
    public static void main(String[] args) throws Exception {
        resolution();
    }  

    public static void resolution() {
        Scanner scan = new Scanner(System.in);
        int num1 = getNumber(scan);
        int num2 = getNumber(scan);
        scan.close();
        otherNumbers(num1, num2);
    }

    public static int getNumber(Scanner scan) {
        System.out.print("Informeu um número: ");
        int num = scan.nextInt();
        return num;
    }

    public static void otherNumbers(int num1, int num2) {
        int num = 0;
        if (num1 == num2) {
            System.out.println("Números são iguais, não existe intervalo!");
        } else if (num1 > num2) {
            for (int i = num2+1; i < num1; i++) {
                System.out.println(i);
                num += i;
            }
        } else {
            for (int i = num1+1; i < num2; i++) {
                System.out.println(i);
                num += i;
            }
        }
        System.out.println("Soma: " + num);
    }
}
