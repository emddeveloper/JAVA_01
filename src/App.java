import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //if, else
        // else if
        //switch
        //break
        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age >= 18){
//            System.out.println("Adult");
//        }
//        else {
//            System.out.println("Not Adult");
//        }
//         int x = sc.nextInt();
//         if(x % 2 == 0){
//             System.out.println("EVEN NUMBER");
//         }
//         else {
//             System.out.println("ODD NUMBER");
//         }

//
        int button = sc.nextInt();
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            default:
                System.out.println("Sorry");
        }
    }
}
