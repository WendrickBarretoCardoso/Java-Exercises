import java.util.Scanner;

public class java12And13Sequential {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String sexo = "";
        
        // .equals() compara o conteudo
        while (!sexo.equals("M") && !sexo.equals("H")) {
            System.out.println("Por favor, informe seu sexo (M - mulher/H - homem):");
            sexo = scan.next().toUpperCase();
        }   

        System.out.print("Informe sua alture em metros:  ");
        double altura = scan.nextDouble();
        scan.close();

        String output = String.format("Seu pedo ideal é %.2f kg!", 
            (sexo.equals("M") ? ((altura*62.1)-44.7) : ((altura*72.7)-58)));

        System.out.println(output);
    }
}
