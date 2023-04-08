public class java4 {
    public static void main(String[] args) throws Exception {
        getGrowth();
    } 

    public static void getGrowth() {
        double contryA = 80000;
        double contryB = 200000;
        double anualGrowthA = 0.03;
        double anualGrowthB = 0.015;
        int age = 0;

        while (contryA < contryB) {
            age++;
            contryA += contryA*anualGrowthA;
            contryB += contryB*anualGrowthB;
        }

        System.out.println("Levará " + age + " anos para a população do país A ultrapassar a do B.");
    }
}
