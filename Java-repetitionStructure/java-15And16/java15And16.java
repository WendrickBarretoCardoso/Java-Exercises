import java.util.Scanner;

public class java15And16 {
    public static void main(String[] args) throws Exception {
        sequenceFibionacci(getNumber());
    }

    public static int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a posição que você queira que a sequência de fibonacci acabe: ");
        int position = scan.nextInt();
        scan.close();
        return position;
    }

    public static void sequenceFibionacci(int position) {
        int past = 0;   //   x
        int present = 1;  // y
        int future;  //  z
        int i = 0;

        if (position <= 0) {
            System.out.println("Essa posição não existe.");
        } else {
            do {
                System.out.println(past);
                i++;
                future = present + past;
                past = present;
                present = future;
            } while (i < position);
        }

        if (past >= 500) {
            System.out.print(String.format("Na posição %d o valor de fibionacci passa de 500.", position));
        } else {
            System.out.print(String.format("Na posição %d o valor de fibionacci não passa de 500.", position));
        }
    }
}
