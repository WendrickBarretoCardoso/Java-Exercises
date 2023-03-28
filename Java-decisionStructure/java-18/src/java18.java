import java.util.Scanner;

public class java18 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String output = "";

        System.out.print("Informe uma data no formato dia/mês/ano: \nDIA: ");
        int dia = scan.nextInt();
        System.out.print("MÊS: ");
        int mes = scan.nextInt();
        System.out.print("ANO: ");
        int ano = scan.nextInt();

        if (dia < 1 || dia > 30 || mes < 1 || mes > 12) {
            output = "Data inválida!";    
        } else {
            output = String.format("Data Informada: %d / %d / %d", dia, mes, ano);
        }

        System.out.println(output);
        scan.close();
    }
}
