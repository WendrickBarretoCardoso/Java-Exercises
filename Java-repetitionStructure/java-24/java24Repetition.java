import java.util.ArrayList;
import java.util.Scanner;

public class java24Repetition {
    public static void main(String[] args) {
        getInfo();
    }

    public static void getInfo() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> nota = new ArrayList<Double>();

        System.out.print("Informe uma nota: \nR: ");
        nota.add(scan.nextDouble());
        System.out.print("Informe outra nota: \nR: ");
        nota.add(scan.nextDouble());

        System.out.print("Você deseja adicionar mais uma nota?\nResponda com S para sim e N para não.\nR: ");
        String addNota = scan.next().toLowerCase();
        while (addNota.equals("s")) {
            nota.add(getNotas(scan));
            System.out.print("Você deseja adicionar mais uma nota?\nResponda com S para sim e N para não.\nR: ");
            addNota = scan.next().toLowerCase();
        }
        if (addNota.equals("n")) {
            System.out.print("\n\nVocê decidiu encerrar, portanto aqui está a média das notas.\nR: " + calcMedia(nota));
        } else {
            System.out.println("\n\nVocê informou uma resposta errada.");
        }

        scan.close();
    }
    
    public static double getNotas(Scanner scan) {
        System.out.print("Informe uma nota: \nR: ");   
        return scan.nextDouble();
    }

    public static double calcMedia(ArrayList<Double> nota) {
        double totalNotas = 0;
        for (Double i : nota) {
            totalNotas+= i;
        }
        return totalNotas/nota.size();
    }
}
