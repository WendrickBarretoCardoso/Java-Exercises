import java.util.Scanner;

public class java14Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe sua primeira nota: ");
        double nota1 = scan.nextDouble();
        while (nota1 < 0.00 || nota1 > 10.00) {
            System.out.print("Insira uma nota válida: ");
            nota1 = scan.nextDouble();
        }
        System.out.print("Informe sua segunda nota: ");
        double nota2 = scan.nextDouble();
        while (nota2 < 0.00 || nota2 > 10.00) {
            System.out.print("Insira uma nota válida: ");
            nota2 = scan.nextDouble();
        }

        String notaFinal = "";

        if (((nota1+nota2)/2) > 9) {
            notaFinal += "A - Aprovado";
        } else if (((nota1+nota2)/2) > 7.5) {
            notaFinal += "B - Aprovado";
        } else if (((nota1+nota2)/2) > 6) {
            notaFinal += "C - Aprovado";
        } else if (((nota1+nota2)/2) > 4) {
            notaFinal += "D - Reprovado";
        } else {
            notaFinal += "E - Reprovado";
        }

        System.out.println(notaFinal);
        scan.close();
    }
}
