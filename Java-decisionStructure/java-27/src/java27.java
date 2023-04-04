import java.util.Scanner;

public class java27 {
    public static void main(String[] args) throws Exception {
        feira();
    }

    public static void feira() {
        Scanner scan = new Scanner(System.in);
        boolean strawberry = getAnswers("Você gostaria de comprar morangos?\nO preço está R$2,50 o KG e se formais de 5kg fica R$2,20.\nInforme com S para SIM e N para Não!\nR: ", scan);
        double stbQntd = Qntd(strawberry, scan);

        boolean apples = getAnswers("\nVocê gostaria de comprar maçãs?\nO preço está R$1,80o KG e se formais de 5kg fica R$1,50.\nInforme com S para SIM e N para Não!\nR: ", scan);
        double appQntd = Qntd(apples, scan);

        price(stbQntd,appQntd);
        scan.close();
    }

    public static boolean getAnswers(String frase, Scanner scan) {
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

    public static double Qntd(boolean conf, Scanner scan) {
        double kg = 0;
        if (conf) {
            System.out.print("Quantos kg você gostaria? R: ");
            kg = scan.nextDouble();
        }
        return kg;
    }

    public static void price(double stbQntd, double appQntd) {
        String output = "";
        double price = 0;
        if (stbQntd <= 5) {
            price += (stbQntd*2.50);
        } else {
            price += (stbQntd*2.20);
        }
        if (appQntd <= 5) {
            price += (stbQntd*1.80);
        } else {
            price += (stbQntd*1.50);
        }
        if ((stbQntd+appQntd)>=8 || price >= 25.00) {
            price = price - (price*0.1);
        }
        output = String.format("\nO peso foi de %.1fKg e o preço total ficou de R$%.2f.",(stbQntd+appQntd),price);
        System.out.println(output);
    }
}
