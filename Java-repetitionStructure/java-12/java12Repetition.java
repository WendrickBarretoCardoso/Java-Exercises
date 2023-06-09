import java.util.Scanner;

public class java12Repetition {
    public static void main(String[] args) throws Exception {
        result();
    }

    public static void result() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numb = scan.nextInt();
        /*printTabuada(numb);*/
        printTabuada2(numb);
        scan.close();
    }

    public static void printTabuada(int numb) {
        String output = String.format("\n"+
            numb + " x 1  = %d\n" +
            numb + " x 2  = %d\n" +
            numb + " x 3  = %d\n" +
            numb + " x 4  = %d\n" +
            numb + " x 5  = %d\n" +
            numb + " x 6  = %d\n" +
            numb + " x 7  = %d\n" +
            numb + " x 8  = %d\n" +
            numb + " x 9  = %d\n" +
            numb + " x 10 = %d", numb*1, numb*2, numb*3, numb*4, numb*5, numb*6, numb*7, numb*8, numb*9, numb*10);
        System.out.print(output);
    }

    public static void printTabuada2(int num) {
        for (int i = 1; i < 11; i++) {
            System.out.print(String.format("%d x %d = %d\n", num, i, num*i));
        }
    }
}
