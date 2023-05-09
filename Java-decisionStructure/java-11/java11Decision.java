import java.util.Scanner;

public class java11Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu salário:  R$ ");
        double sal = scan.nextDouble();
        String output = "";
        scan.close();

        double newSal;
        int percent;
        double percentVl;
        
        if (sal <= 280.00) {
            newSal = sal+((sal*20)/100);
            percent = 20;
            percentVl = ((sal*20)/100);
        } else if (sal <= 700.00) {
            newSal = sal+((sal*15)/100);
            percent = 15;
            percentVl = ((sal*15)/100);
        } else if (sal <= 1500.00) {
            newSal = sal+((sal*10)/100);
            percent = 10;
            percentVl = ((sal*10)/100);
        } else {
            newSal = sal+((sal*5)/100);
            percent = 5;
            percentVl = ((sal*5)/100);
        }

        output = String.format("Salário antes do ajuse: R$ %.2f\n" +
        "Percentual de aumento: %d\n" +
        "Valor a ser aumentado: R$ %.2f\n" +
        "Novo salário : R$ %.2f\n"
        , sal, percent, percentVl, newSal);

        System.out.println(output);
    }
}
