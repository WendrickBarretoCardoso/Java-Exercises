import java.util.Scanner;

public class java25 {
    public static void main(String[] args) throws Exception {
        System.out.println(questions());
    }

    public static String questions() {
        Scanner scan = new Scanner(System.in);
        int answers = 0;
        System.out.println("Responda com S ou N!");
        answers += getAnswers("Telefonou para a vítima?\nR: ", scan);
        answers += getAnswers("Esteve no local do crime?\nR: ", scan);
        answers += getAnswers("Mora perto da vítima?\nR: ", scan);
        answers += getAnswers("Devia para a vítima?\nR: ", scan);
        answers += getAnswers("Já trabalhou com a vítima?\nR: ", scan);
        scan.close();
        return veredict(answers);
    }

    public static int getAnswers(String frase, Scanner scan) {
        System.out.print(frase);
        String answ = scan.nextLine();
        answ = answ.toUpperCase();
        while (!answ.equals("S") && !answ.equals("N")) {
            System.out.print("Infromção inválida repita a resposta:  ");
            answ = scan.nextLine();
            answ = answ.toUpperCase();
        }
        if (answ.equals("S")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String veredict(int answers) {
        String output = "";
        if (answers < 2) {
            output = "Você esta classificada como INOCENTE!";
        } else if (answers == 2) {
            output = "Você esta classificada como SUSPEITO!";
        } else if (answers == 3 || answers == 4) {
            output = "Você esta classificada como SUSPEITO PRINCIPAL!";
        } else if (answers == 5) {
            output = "Você esta classificada como ASSASSINO!";
        }
        return output;
    }
}
