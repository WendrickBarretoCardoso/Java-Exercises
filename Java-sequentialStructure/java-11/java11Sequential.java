import java.util.Scanner;
import java.lang.Math;

public class java11Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int inteiro1 = scan.nextInt();
        System.out.print("Digite outro número inteiro: ");
        int inteiro2 = scan.nextInt();
        System.out.print("Digite um número Reak: ");
        double real = scan.nextDouble();
        scan.close();

        String output = String.format("A)O produto do dobro do primeiro com metade do segundo: %d\n"+
        "B)A soma do triplo do primeiro com o terceiro: %.2f\n"+
        "C)O terceiro elevado ao cubo: %.2f", 
        ((inteiro1*2)*(inteiro2/2)), ((inteiro1*3)+real), (Math.pow(real, 3)));

        System.out.println(output);
    }
}
