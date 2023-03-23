import java.util.Scanner;

public class java18 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String output = "";

        System.out.print("Qual o tamanho em megas do arquivo?\nR=  ");
        double tam = scan.nextDouble();
        System.out.print("Qual a velocidade em Mbps da sua internet?\nR=  ");
        double vel = scan.nextDouble();

        output = String.format("A velocidade de donwload é %.2f minutos", (tam/(tam/(vel/8)))/60);
        scan.close();
        System.out.println(output);
    }
}
