import java.util.Scanner;

public class java1 {
    public static void main(String[] args) throws Exception {
        getNumber();
    }

    public static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número de 0 a 10:  ");
        int numb = scan.nextInt();
        while (numb < 0 || numb > 10) {
            System.out.print("Númeor informado está errado. Digite Novamente:  ");
            numb = scan.nextInt();
        }
        scan.close();
        return numb;
    }
}
