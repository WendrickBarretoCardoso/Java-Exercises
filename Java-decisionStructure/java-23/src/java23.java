import java.util.Scanner;
import java.lang.Math;

public class java23 {
    public static void main(String[] args) throws Exception {
        System.out.println(decimalInt(getNumber()));
    }

    public static double getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Me informe um número: ");
        double num = scan.nextDouble();
        double conf = num - Math.floor(num);
        scan.close();
        return conf;
    }

    public static String decimalInt(double num) {
        String output = "";
        if (num > 0) {
            output = "O número informado é decimal.";
        } else {
            output = "O número informado é inteiro.";
        }
        return output;
    }
}
