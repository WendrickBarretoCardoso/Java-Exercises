import java.util.Scanner;

public class java16 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o tamanho em m² da área quadrada a ser pintada? \nR: ");
        double tam = scan.nextDouble();
        scan.close();
        double tinta = tam/3;
        int lataQtd = 1;
        
        while (tinta > 18) {
            tinta -= 18;
            lataQtd++;
        }

        String output = String.format("\nA quantidade de latas de tinta é de %d,\n" +
        "E o valor total é de R$ %.2f", lataQtd, lataQtd*80.00);

        System.out.println(output);
    }
}
