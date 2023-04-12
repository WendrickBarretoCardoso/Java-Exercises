import java.util.Scanner;

public class java15 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º lado do triângulo: ");
        double lado1 = scan.nextDouble();
        System.out.print("Informe o 2º lado do triângulo: ");
        double lado2 = scan.nextDouble();
        System.out.print("Informe o 3º lado do triângulo: ");
        double lado3 = scan.nextDouble();

        String triangulo = "";

        if (lado1 == lado2) {
            if (lado1 == lado3) {
                triangulo = "Triângulo Equilátero";
            } else {
                triangulo = "Triângulo Isósceles";
            }
        } else if (lado1 == lado3) {
            if ((lado1 == lado3) == true) {
                triangulo = "Triângulo Isósceles";
            } else {
                triangulo = "Triângulo Escaleno";
            }
        } else if (lado2 == lado3) {
            triangulo = "Triângulo Isósceles";
        } else {
            triangulo = "Triângulo Escaleno";
        }

        System.out.println(triangulo);
        scan.close();
    }
}
