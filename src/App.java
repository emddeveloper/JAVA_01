import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //input
        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); will print one token SK AMINUL --> SK
        String name = sc.nextLine(); // will take a whole line SK AMINUL -->SK AMINU
        System.out.println(name);
    }
}
