import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //if, else
        // else if
        //switch
        //break
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }

    }
}
