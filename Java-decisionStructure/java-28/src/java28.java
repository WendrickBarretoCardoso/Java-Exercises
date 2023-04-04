import java.util.Scanner;

public class java28 {
    public static void main(String[] args) throws Exception {
        tabajara();
    }

    public static void tabajara() {
        Scanner scan = new Scanner(System.in);
        String output = "Você só poderá escolher uma carne.\nQual carne você escolhe\n"+
        "1) Filé Duplo:  Até 5Kg: 1kg = R$4.90  | Acima de 5kg: 1k = R$5.80\n"+
        "2)    Alcatra:  Até 5Kg: 1kg = R$5.90  | Acima de 5kg: 1k = R$6.80\n"+
        "3)    Picanha:  Até 5Kg: 1kg = R$6.90  | Acima de 5kg: 1k = R$7.80\n"+
        "Informe 1 - Filé Duplo | 2 - Alcatra | 3 - Picanha\n"+
        "R: ";
        int carne = getAnswers(output, scan);
        double carneQntd = Qntd(scan);
        boolean cartaoTab = getCartTab("Você possui cartão tabajara?\nS para SIM e N para NÃO.\nR:  ", scan);
        price(carneQntd, carne, cartaoTab);
        scan.close();
    }

    public static int getAnswers(String frase, Scanner scan) {
        System.out.print(frase);
        int answ = scan.nextInt();
        while (answ != 1 && answ != 2 && answ != 3) {
            System.out.print("\nInfromção inválida repita a resposta:  ");
            answ = scan.nextInt();
        }
        return answ;
    }

    public static boolean getCartTab(String frase, Scanner scan) {
        System.out.print(frase);
        String answ = scan.nextLine();
        answ = answ.toUpperCase();
        while (!answ.equals("S") && !answ.equals("N")) {
            System.out.print("\nInfromção inválida repita a resposta:  ");
            answ = scan.nextLine();
            answ = answ.toUpperCase();
        }
        if (answ.equals("S")) {
            return true;
        } else {
            return false;
        }
    }

    public static double Qntd(Scanner scan) {
        double kg = 0;
        System.out.print("Quantos kg você gostaria? R: ");
        kg = scan.nextDouble();
        return kg;
    }

    public static void price(double carneQntd, int carne, boolean cartTab) {
        double price = 0.0;
        if (carne == 1) {
            if (carneQntd <= 5) {
                price = (carneQntd*4.9);
            } else {
                price = (carneQntd*5.8);
            }
        } else if (carne == 2) {
            if (carneQntd <= 5) {
                price = (carneQntd*5.9);
            } else {
                price = (carneQntd*6.8);
            }
        } else if (carne == 3) {
            if (carneQntd <= 5) {
                price = (carneQntd*6.9);
            } else {
                price = (carneQntd*7.8);
            }
        }

        if (cartTab) {
            price = price - (price*0.05);
        }
        System.out.print(String.format("O Valor da Carne ficou de R$%.2f", price));
    }
}
