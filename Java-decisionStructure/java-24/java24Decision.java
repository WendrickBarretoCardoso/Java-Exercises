import java.util.Scanner;

public class java24Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double num1 = getNumbers(scan);
        double num2 = getNumbers(scan);
        int alt = getAlt(scan);
        
        altChoice(alt, num1, num2);
        scan.close();
    }

    public static double getNumbers(Scanner scan) {
        
        System.out.print("Informe um número: ");
        double number = scan.nextDouble();
        return number;
    }

    public static int getAlt(Scanner scan) {
        System.out.print(String.format("\nInforme uma opção: \n" +
        "1) Número é Par ou Impar.\n" +
        "2) Número é Positivo ou Negativo.\n" +
        "3) Número é Decimal ou Inteiro.\n" +
        "Escolha:  "));
        int alt = scan.nextInt();
        while (alt < 1 || alt > 3) {
            System.out.print("Escolha inválida!\n Esoclha novamente: ");
            alt = scan.nextInt();
        }
        return alt;
    }

    public static void altChoice(int alt, double num1, double num2) {
        if (alt == 1) {
            alt1(num1, num2);
        } else if (alt == 2) {
            alt2(num1, num2);
        } else {
            alt3(num1, num2);
        }
    }

    public static void alt1(double num1, double num2) {
        String output = "";
        if (num1%2 == 0) {
            output += "\nO número " + num1 + " é par.\n";
        } else {
            output += "\nO número " + num1 + " é impar.\n";
        }
        if (num2%2 == 0) {
            output += "O número " + num2 + " é par.";
        } else {
            output += "O número " + num2 + " é impar.";
        }
        System.out.println(output);
    }

    public static void alt2(double num1, double num2) {
        String output = "";
        if (num1 >= 0) {
            output += "\nO número " + num1 + " é positivo.\n";
        } else {
            output += "\nO número " + num1 + " é negativo.\n";
        }
        if (num2 >= 0) {
            output += "O número " + num2 + " é positivo.\n";
        } else {
            output += "O número " + num2 + " é negativo.\n";
        }
        System.out.println(output);
    }

    public static void alt3(double num1, double num2) {
        String output = "";
        double conf1 = num1 - Math.floor(num1);
        double conf2 = num2 - Math.floor(num2);
        if (conf1 > 0) {
            output += "\nO número " + num1 + " é decimal.\n";
        } else {
            output += "\nO número " + num1 + " é inteiro.\n";
        }
        if (conf2 > 0) {
            output += "O número " + num2 + " é decimal.\n";
        } else {
            output += "O número " + num2 + " é inteiro.\n";
        }
        System.out.println(output);        
    }
}
