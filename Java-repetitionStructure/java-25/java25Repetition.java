import java.util.ArrayList;
import java.util.Scanner;

public class java25Repetition {
    public static void main(String[] args) {
        calcMedia();
    }

    public static ArrayList<Integer> getAge() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> idade = new ArrayList<Integer>();
        System.out.print("Quantas idades vc irá inserir?\nR: ");
        int quantIdades = scan.nextInt();
        int idades = 0;
        for (int i = 0; i < quantIdades; i++) {
            System.out.print("Adicione uma idade.\nR: ");
            idades = scan.nextInt();
            if (idades < 0) {
                while (idades < 0) {
                    System.out.print("Informe uma idade que seja igual ou maior que zero.\nR: ");
                    idades = scan.nextInt();
                }
                idade.add(idades);
            } else {
                idade.add(idades);
            }
        }
        scan.close();
        return idade;
    }

    public static void calcMedia() {
        ArrayList<Integer> idade = getAge();
        int totalIdades = 0;
        for (Integer integer : idade) {
            totalIdades += integer;
        }

        int media = (totalIdades/idade.size());
        System.out.print("\nA média das idade é de: " + media);
        if (media <= 25) {
            System.out.print("\nA média está entre 0 e 25!");
        } else if (media <= 60) {
            System.out.print("\nA média está entre 26 e 60!");
        } else {
            System.out.print("\nA média é maior que 60!");
        }
    }
}
