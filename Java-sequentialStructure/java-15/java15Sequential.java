import java.util.Scanner;

public class java15Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora: R$ ");
        double salario = scan.nextDouble();
        System.out.print("Quantas horas vc trabalha em um dia: ");
        double horas = scan.nextDouble();
        scan.close();
        salario = ((horas*5)*30) * salario;

        double ir = (((salario*11)/100));
        double inss = (((salario*8)/100));
        double sindicato = (((salario*5)/100));
        double salarioLiq = salario - ir - inss - sindicato;

        String output = String.format(
            "A) Salário Bruto: R$ %.2f\n" +
            "B) Desconto IR: R$ %.2f\n" +
            "C) Desconto INSS: R$ %.2f\n" +
            "D) Desconto Sindicato: R$ %.2f\n" + 
            "Total: R$ %.2f",
            salario, ir, inss, sindicato, salarioLiq);

        System.out.println(output);
    }
}
