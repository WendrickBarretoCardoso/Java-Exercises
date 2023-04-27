import java.util.Scanner;
import java.util.ArrayList;

public class java14 {
    public static void main(String[] args) throws Exception {
        getPairEven(getNumbers());
    }

    public static int[] getNumbers() {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.print(String.format("Insira o %dº número: ", i+1));
            num[i] = scan.nextInt();
        }
        scan.close();
        return num;
    }

    public static void getPairEven(int[] num) {
        ArrayList<Integer> pair = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2 != 0) {
                even.add(num[i]);
            } else {
                pair.add(num[i]);
            }
        }

        System.out.print(String.format("Nós possuimos %d números pares e %d números ímpares.", pair.size(), even.size()));
    }
}
