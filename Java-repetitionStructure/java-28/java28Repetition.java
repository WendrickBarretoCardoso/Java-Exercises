import java.util.ArrayList;
import java.util.Scanner;

public class java28Repetition {
    public static void main(String[] args) {
        baseCalc();
    }

    public static void baseCalc() {
        ArrayList<Double> cdValue = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        int cdQTT = getCDs(scan);
        cdValue = getValue(scan, cdQTT, cdValue);
        scan.close();
        printInfo(cdQTT, cdValue);
    }

    public static int getCDs(Scanner scan) {
        System.out.print("Quantos CD's você possui?\nR: ");
        int temp = scan.nextInt();
        while (temp < 0) {
            System.out.print("\nInforme uma quantidade correta.\nR: ");
            temp = scan.nextInt();
        }
        return temp;
    }

    public static ArrayList<Double> getValue(Scanner scan, int cdQTT, ArrayList<Double> cdValue) {
        double temp = 0;
        for (int i = 1; i <= cdQTT; i++) {
            System.out.print(String.format("\nQual o valor do seu %dº CD:\nR: ", i));
            temp = scan.nextInt();
            while (temp < 0) {
                System.out.print("\nInforme um valor correto.\nR: ");
                temp = scan.nextInt();
            }
            cdValue.add(temp);
        } 
        return cdValue;    
    }

    public static void printInfo(int cdQTT, ArrayList<Double> cdValue) {
        double totalValue = 0;
        for (Double x : cdValue) {
            totalValue += x;
        }
        System.out.print(String.format("\nVocê possui %d Cd's e o valor total deles é de:  R$ %.2f\nE foi gasto uma média de: R$  %.2f  por CD!", cdQTT, totalValue, (totalValue/cdQTT)));
        System.out.print("\nOs valores de cada CD é: ");
        int y = 1;
        for (Double x : cdValue) {
            System.out.print(String.format("\n-> CD %d  =  R$ %.2f", y, x));
            y++;
        }
    }
}
