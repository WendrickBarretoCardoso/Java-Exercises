import java.util.Scanner;

public class java20 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe sua primeira nota: ");
        double nota1 = scan.nextDouble();
        nota1 = CheckNota(nota1);
        System.out.print("Informe sua segunda nota: ");
        double nota2 = scan.nextDouble();
        nota2 = CheckNota(nota2);
        System.out.print("Informe sua terceira nota: ");
        double nota3 = scan.nextDouble();
        nota3 = CheckNota(nota3);
        System.out.println(VerificarAprovacao(nota1, nota2, nota3));
        scan.close();
    }
    
    public static double CheckNota(double nota) {
        Scanner scan = new Scanner(System.in);
        while (nota < 0.00 || nota > 10.00) {
            System.out.print("Insira uma nota válida: ");
            nota = scan.nextDouble();
        }
        scan.close();
        return nota;
    }

    public static String VerificarAprovacao(double nota1, double nota2, double nota3) {
        String output = "";
        if ((nota1+nota2+nota3)/3 == 10.0) {
            output = String.format("Sua média é de %.2f e você foi Aprovado com Distinção.", (nota1+nota2+nota3)/3);
        } else if ((nota1+nota2+nota3)/3 >= 7.0) {
            output = String.format("Sua média é de %.2f e você foi Aprovado.", (nota1+nota2+nota3)/3);
        } else {
            output = String.format("Sua média é de %.2f e você foi Reprovado.", (nota1+nota2+nota3)/3);
        }
        return output;
    }
}
