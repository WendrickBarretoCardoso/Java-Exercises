import java.util.ArrayList;
import java.util.Scanner;

public class java27Repetition {
    public static void main(String[] args) {
        getAll();
    }

    public static void getAll() {
        ArrayList<Integer> turmas = new ArrayList<Integer>();
        ArrayList<Integer> alunos = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        turmas = getTurmas(scan, turmas);
        int temp = 1;
        while (temp <= turmas.size()) {
            alunos = getAlunos(scan, alunos, temp);
            temp++;
        }
        scan.close();
        printInfo(turmas, alunos);
    }

    public static ArrayList<Integer> getTurmas(Scanner scan, ArrayList<Integer> turmas) {
        System.out.print("A escola terá quantas turmas?\nR: ");
        int temp = scan.nextInt();
        while (temp < 0) {
            System.out.print("\nInforme uma quantidade válida: ");
            temp = scan.nextInt();
        }
        for (int i = 1; i <= temp; i++) {
            turmas.add(i);
        }
        return turmas;
    }

    public static ArrayList<Integer> getAlunos(Scanner scan, ArrayList<Integer> alunos, int temp) {
        System.out.print(String.format("\nA turma %d terá quantos alunos?\nR: ", temp));
        int x = scan.nextInt();
        while (x < 0 || x > 40) {
            System.out.print("\nInforme uma quantidade válida: ");
            x = scan.nextInt();
        }
        alunos.add(x);
        return alunos;
    }
    
    public static void printInfo( ArrayList<Integer> turmas, ArrayList<Integer> alunos) {
        int temp = 0;
        for (Integer integer : alunos) {
            temp += integer;
        }
        System.out.print("\nO número médio de alunos por turma é de " + (temp/alunos.size()));
        System.out.print("\nAs turmas e a quantidade de alunos são: ");
        for (Integer integer : turmas) {
            System.out.print(String.format("\n--> %dº Turma:  %d", integer, alunos.get(integer-1)));
        }
    }
}
