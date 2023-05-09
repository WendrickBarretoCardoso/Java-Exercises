import java.util.Scanner;

public class java16Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String resultado = "";

        System.out.print("Informe o o valor de A: ");
        double var1 = scan.nextDouble();
        if (var1 == 0) {
            resultado += "Não é uma função de segundo grau.";
        } else {
            System.out.print("Informe o o valor de B: ");
            double var2 = scan.nextDouble();
            System.out.print("Informe o o valor de C: ");
            double var3 = scan.nextDouble();

            if ((var2*var2) - (4*(var1*var3)) < 0) {
                resultado += "A função não possui raizes reais.";
            } else if ((var2*var2) - (4*(var1*var3)) == 0) {
                resultado += "A função possui uma raiz real.";
            } else {
                resultado += "A função possui duas raizes reais.";
            }
        }

        System.out.println(resultado);

        scan.close();
    }
}
