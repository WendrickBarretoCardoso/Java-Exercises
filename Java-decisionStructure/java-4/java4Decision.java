import java.util.Scanner;

public class java4Decision {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Escreva uma letra do alfabeto:  ");
        String letra = scan.nextLine();

        letra = letra.toLowerCase();
        if (!letra.equals("a")&&!letra.equals("b")
        &&!letra.equals("c")&&!letra.equals("d")
        &&!letra.equals("e")) {
            System.out.println("A letra escrita é uma consoante.");
        } else {
            System.out.println("A letra escrita é uma vogal.");
        }
        scan.close();
    }
}
