import java.util.Scanner;

public class java12Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu salário:  R$ ");
        double sal = scan.nextDouble();
        scan.close();
        String output = "";

        double ir;
        double inss = (sal*10)/100;
        double fgts = (sal*11)/100;

        if (sal <= 900.00) {
            ir = 0.0;
        } else if (sal <= 1500.00) {
            ir = (sal*5)/100;
        } else if (sal <= 2500.00) {
            ir = (sal*10)/100;
        } else {
            ir = (sal*20)/100;
        }

        output = String.format(
        "\nSalário Bruto:      : R$ %.2f\n" +
        "IR                  : R$ %.2f\n" +  
        "INSS                : R$ %.2f\n" +
        "FGTS                : R$ %.2f\n" +
        "Total de descontos  : R$ %.2f\n" +
        "Salário Liquido     : R$ %.2f\n", 
        sal, ir, inss, fgts, ir+inss, sal-ir-inss);

        System.out.println(output);
    }
}
