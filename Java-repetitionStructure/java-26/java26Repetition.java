import java.util.Scanner;

public class java26Repetition {
    public static void main(String[] args) {
        getQuant();
    }

    public static void getQuant() {
        Scanner scan = new Scanner(System.in);
        int candidatos[] = { 0, 0, 0 };
        int temp = 0;
        System.out.print("Quantos votos terá?\nR: ");
        int votos = scan.nextInt();
        System.out.print("\nA votação está iniciando: ");
        for (int i = 0; i < votos; i++) {
            temp = getVotes(scan);
            if (temp == 1) {
                candidatos[0] += 1;
            } else if (temp == 2) {
                candidatos[1] += 1;
            } else {
                candidatos[2] += 1;
            }
        }
        System.out.print("\nA votação está encerrada.");
        imprima(candidatos);
        scan.close();
    }

    public static int getVotes(Scanner scan) {
        System.out.print("\nEscolha um dos Três candidatos:\n1 - Fulano Vermelho\n2 - Sicrano Padre\n3 - Beltrano Gripizinha\nR: ");
        int temp = scan.nextInt();
        while (temp < 1 || temp > 3) {
            System.out.print("\nInforme um candidato válido.\nR: ");
            temp = scan.nextInt();
        }
        return temp;
    }

    public static void imprima(int candidatos[]) {
        System.out.print("O placar de votos ficou: ");
        int temp = 0;
        String cand = "";
        for (int i = 0; i < candidatos.length; i++) {
            System.out.print(String.format("\nCandidato %d: %d", (i+1), candidatos[i]));
            if (candidatos[i] > temp) {
                temp = candidatos[0];
                cand = "Candidato " + (i+1);
            }
        }
        System.out.println("\n\nO vencedor da eleição é: " + cand);
    }
}