import java.util.Scanner;

public class java19Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String output = "";

        System.out.print("Insira um número inteiro menor que 1000: ");
        int num = scan.nextInt();

        while (num < 0 || num >= 1000) {
            System.out.print("Valor inválido insira novamente: ");
            num = scan.nextInt();
        }

        int cent = 0;
        int dez = 0;
        int uni = 0;

        cent = num/100;
        dez = (num%100)/10;
        uni = ((num%100)%10);
        output = String.format("\nO número %d possui:\n" +
            "%d centenas\n" + 
            "%d dezenas\n" + 
            "%d unidades\n", num, cent, dez, uni);

        System.out.println(output);
        scan.close();
    }
}
