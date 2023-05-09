import java.util.Scanner;

public class java1And2Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º número:  ");
        double num1 = scan.nextDouble();
        System.out.print("Informe o 2º número:  ");
        double num2 = scan.nextDouble();
        scan.close();
        if (num1 > num2) {
            if (num1 > 0) {
                System.out.println("O 1º número é maior que o 2º, e ele é um número positivo.");
            } else {
                System.out.println("O 1º número é maior que o 2º, e ele é um número negativo.");  
            }
        } else {
            if (num2 > 0) {
                System.out.println("O 2º número é maior que o 1º, e ele é um número positivo.");
            } else {
                System.out.println("O 2º número é maior que o 1º, e ele é um número negativo.");   
            }
        }
    }
}
