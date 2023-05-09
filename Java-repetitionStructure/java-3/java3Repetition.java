import java.util.Scanner;

public class java3Repetition {
    public static void main(String[] args) throws Exception {
        information();
    }

    public static void information() {
        Scanner scan = new Scanner(System.in);
        String name = getName(scan);
        int age = getAge(scan);
        Double money = getMoney(scan);
        String gender = getGender(scan);
        String civil = getCivil(scan);
        System.out.print(combine(name, age, money, gender, civil));
        scan.close();
    }

    public static String combine(String name, int age, Double money, String gender, String civil) {
        if (gender.equals("F")) {
            gender = "Feminino";
        } else {
            gender = "Masculino";
        }

        if (civil.equals("S")) {
            civil = "Solteiro";
        } else if (civil.equals("C")) {
            civil = "Casado";
        } else if (civil.equals("V")) {
            civil = "Viúvo";
        } else {
            civil = "Divorciado";
        }
        
        String output = String.format("\n\nNome = %s\n" +
        "Idade = %d\n" +
        "Salário = R$%.2f\n" +
        "Gênero = %s\n" +
        "Estado Civil = %s", name, age, money, gender, civil);
        
        return output;
    }

    public static String getName(Scanner scan) {
        System.out.print("Informe seu Nome: ");
        String name = scan.nextLine();
        while (name.length() <= 3) {
            System.out.print("Nome deve possuir mais de três caracteres.\nInforme seu Nome: ");
            name = scan.nextLine();
        }
        return name;
    }

    public static int getAge(Scanner scan) {
        System.out.print("Informe sua Idade: ");
        int age = scan.nextInt();
        while (age < 0 || age > 150) {
            System.out.print("Idade deve ser entre 0 a 150 anos.\nInforme sua Idade: ");
            age = scan.nextInt();
        }
        return age;
    }

    public static Double getMoney(Scanner scan) {
        System.out.print("Informe seu Salário: ");
        double money = scan.nextDouble();
        while (money < 0) {
            System.out.print("Salário deve ser maior ou igual a 0.\nInforme seu Salário: ");
            money = scan.nextDouble();
        }
        return money;
    }

    public static String getGender(Scanner scan) {
        System.out.print("F - Feminino  |  M - Masculino\nInforme seu Gênero: ");
        String gender = scan.nextLine();
        gender = gender.toUpperCase();
        while (!gender.equals("F") && !gender.equals("M")) {
            System.out.print("Gênero deve ser 'F' para Feminino e 'M' para Masculino.\nInforme seu Gênero: ");
            gender = scan.nextLine();
            gender = gender.toUpperCase();
        }
        return gender;
    }

    public static String getCivil(Scanner scan) {
        System.out.print("S - Solteiro  | C - Casado  |  V - Viúvo |  D - Divorciado  |  \nInforme seu Estado Civil: ");
        String civil = scan.nextLine();
        civil = civil.toUpperCase();
        while (!civil.equals("S") && !civil.equals("C") && !civil.equals("V") && !civil.equals("D")) {
            System.out.print("S - Solteiro  | C - Casado  |  V - Viúvo |  D - Divorciado  |  \nInforme seu Estado Civil: ");
            civil = scan.nextLine();
            civil = civil.toUpperCase();
        }
        return civil;
    }
}
