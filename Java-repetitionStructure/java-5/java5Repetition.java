import java.util.Scanner;

public class java5Repetition {
    public static void main(String[] args) throws Exception {
        information();
    }

    public static void information() {
        Scanner scan = new Scanner(System.in);
        int contryA = countryPop(scan);
        Double anualGrowthA = countryGrowth(scan);
        int contryB = countryPop(scan);
        Double anualGrowthB = countryGrowth(scan);
        System.out.println(getGrowth(contryA, contryB, anualGrowthA, anualGrowthB));
        scan.close();
    }

    public static int countryPop(Scanner scan) {
        System.out.print("Informe a população do Páis:  ");
        int pop = scan.nextInt();
        if (pop < 0) {
            System.out.print("Informe uma quantidade válida:  ");
            pop = scan.nextInt();
        }
        return pop;
    }

    public static Double countryGrowth(Scanner scan) {
        System.out.print("Informe a taxa de crescimento da população do Páis:  ");
        Double growth = scan.nextDouble();
        if (growth < 0) {
            System.out.print("Informe uma taxa válida:  ");
            growth = scan.nextDouble();
        }
        return growth;
    }

    public static String getGrowth(int contryA, int contryB, Double anualGrowthA, Double anualGrowthB) {
        int age = 0;
        String output = "";
        if (contryA < contryB) {
            while (contryA < contryB) {
                age++;
                contryA += contryA*(anualGrowthA/100);
                contryB += contryB*(anualGrowthB/100);
                output = "Levará " + age + " anos para a população do país A ultrapassar a do B.";
                if (age == 2147483647 ){
                    output = "Impóssivel o páis A ultrapassar o país B. Pela quantidade de tempo a terra já teria virado pó.";
                }
            }
        } else {
            output = "Não será necessário calcular já que o páis A já possui uma população maior que a de B.";
        }
        return output;
    }
}
