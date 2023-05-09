import java.util.Scanner;

public class java17Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String output = "";

        System.out.print("Qual o tamanho em m² da área quadrada a ser pintada? \nR: ");
        double tam = scan.nextDouble();

        double tinta = tam/6;
        int lataQtd18 = 0;      //  R$ 80.00
        int lataQtd36 = 0;      //  R$ 25.00
        
        int choice = 0;

        while (choice != 1 && choice != 2 && choice != 3) {
            System.out.print("\nEscolha uma das opções:\n" +
            "1) Comprar apenas latas de 18 litros.\n" +
            "2) Comprar apenas galões de 3,6 litros.\n" +
            "3) Misturar as duas latas.\nOpção: ");
            choice = scan.nextInt();
        }

        if (choice == 1) {
            lataQtd18++;
            while (tinta > 18) {
                tinta -= 18;
                lataQtd18++;
            }
            output = String.format("\nA quantidade de latas de tinta é de %d,\n" +
            "E o valor total é de R$ %.2f", lataQtd18, lataQtd18*80.00);
        } else if (choice == 2) {
            lataQtd36++;
            while (tinta > 3.6) {
                tinta -= 3.6;
                lataQtd36++;
            }
            output = String.format("\nA quantidade de latas de tinta é de %d,\n" +
            "E o valor total é de R$ %.2f", lataQtd36, lataQtd36*25.00);
        } else {
            while (tinta > 3.6) {
                if (tinta > 18) {
                    tinta -= 18;
                    lataQtd18++;
                } else if (tinta > 3.6) {
                    tinta -= 3.6;
                    lataQtd36++;
                }
            }
            if (tinta > 0) {
                lataQtd36++;
            }
            output = String.format("\nA quantidade de latas de tinta é de %d de 18l e %d de 3,6l,\n" +
            "E o valor total é de R$ %.2f", lataQtd18, lataQtd36, ((lataQtd36*25.00)+(lataQtd18*80.00)));
        }        
        scan.close();
        System.out.println(output);
    }
}
