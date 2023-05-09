import java.util.Scanner;

public class java17Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Infrome um ano: ");
        int ano = scan.nextInt();
        String resultado = "";

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            resultado += "O ano " + ano + " é bissexto.";
        } else {
            resultado += "O ano " + ano + " não é bissexto.";
        }

        System.out.println(resultado);
        scan.close();
    }
}
