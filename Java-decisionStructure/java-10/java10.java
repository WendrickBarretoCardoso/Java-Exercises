import java.util.Scanner;

public class java10 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual oturno que você estuda?\nInsira 'M' para Matutino, 'V' para Vespertino e 'N' para Noturno: ");
        String turno = scan.nextLine();
        turno = turno.toUpperCase();
        while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N") ) {
            System.out.print("Resposta Inválida!\nInsira 'M' para Matutino, 'V' para Vespertino e 'N' para Noturno\nRepita a resposta: ");
            turno = scan.nextLine();
            turno = turno.toUpperCase();
        }
        if (turno.equals("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equals("V")){
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
        scan.close();
    }
}
