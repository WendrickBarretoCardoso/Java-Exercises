import java.util.Scanner;

public class java2 {
    public static void main(String[] args) throws Exception {
        login();
    }

    public static void login() {
        Scanner scan = new Scanner(System.in);
        String user = getUser(scan);
        String password = getPassw(scan);
        confirmation(user, password, scan);
        scan.close();
    }

    public static String getUser(Scanner scan) {
        System.out.print("Informe um usuário: ");
        String user = scan.nextLine();
        return user;
    }
    
    public static String getPassw(Scanner scan) {
        System.out.print("Informe uma senha: ");
        String password = scan.nextLine();
        return password;
    }

    public static void confirmation(String user, String password, Scanner scan) {
        while (user.equals(password)) {
            System.out.println("A sua senha é identica ao seu usuário mude sua senha!");
            password = getPassw(scan);
        }
        System.out.println("Você foi logado com sucesso.");
    }
}
