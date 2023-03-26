import java.util.Scanner;

public class java3 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o seu sexo?\nInsira 'F' para feminino e 'M' para masculino: ");
        String sexo = scan.nextLine();
        sexo = sexo.toUpperCase();
        while (!sexo.equals("M") && !sexo.equals("F") ) {
            System.out.print("Resposta Inválida!\nRepita a resposta: ");
            sexo = scan.nextLine();
            sexo = sexo.toUpperCase();
        }

        if (sexo.equals("M")) {
            System.out.println("Seu sexo é masculino.");
        } else {
            System.out.println("Seu sexo é feminino.");
        }
        scan.close();
    }
}
