import java.util.Scanner;

public class java18And19Repetition {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int quantN = getQuant(scan);
        int[] num = getNumbers(scan, quantN);
        problems(num);
        scan.close();
    }

    public static int getQuant(Scanner scan) {
        System.out.print("Informe a quantidade de números que será inserido: ");
        int quantN = scan.nextInt();
        while (quantN < 0) {
            System.out.print("Informe um número maior que zero: ");
            quantN = scan.nextInt();
        }
        return quantN;
    }

    public static int[] getNumbers(Scanner scan, int quantN) {
        int[] num = new int[quantN];
        System.out.println("Informeu um número entre 0 e 1000.");
        for (int i = 0; i < num.length; i++) {
            System.out.print(String.format("Informe o %dº número: ", i+1));
            num[i] = scan.nextInt();
            if (num[i] > 1000 || num[i] < 0) {
                System.out.println("(Número informado indevido.)");
                System.out.print(String.format("Informe o %dº número: ", i+1));
                num[i] = scan.nextInt();
            }
        }
        return num;
    }

    public static void problems(int[] num) {
        int bigger = 0;
        int bPosition = 0;
        int smaller = num[num.length-1];
        int sPosition = num.length-1;
        int sumN = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > bigger) {
                bigger = num[i];
                bPosition = i+1;
            }
            if (num[i] < smaller) {
                smaller = num[i];
                sPosition = i+1;
            }
            sumN += num[i];
        }
        String output = String.format("O maior número é %d que está na posição %d.\n" +
        "O menor número é %d que está na posição %d.\n" +
        "A soma dos números é: %d", bigger, bPosition, smaller, sPosition, sumN);

        System.out.println(output);
    }
}