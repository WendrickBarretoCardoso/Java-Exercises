public class java9 {
    public static void main(String[] args) throws Exception {
        evenNumber();
    }  

    public static void evenNumber() {
        for (int i = 1; i < 51; i++) {
            if (i%2 != 0) {
                System.out.println(i);;
            }
        }
    }
}
