import java.util.Scanner;

public class InputClass {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
