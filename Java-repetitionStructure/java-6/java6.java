public class java6 {
    public static void main(String[] args) throws Exception {
        inOrder();
    }

    public static void inOrder() {
        getUnder();
        getSide();
    }

    public static void getUnder() {
        for (int i = 1; i < 21; i++) {
            if (i == 20) {
                System.out.println(i);
            } else {
                System.out.println(i + ",");
            }
        }
    }

    public static void getSide() {
        String numbers = "";
        for (int i = 1; i < 21; i++) {
            if (i == 20) {
                numbers += i;
            } else {
                numbers += i + ", ";
            }
        }
        System.out.println("\n" + numbers);
    }
}
