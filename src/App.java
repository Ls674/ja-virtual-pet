import java.util.Scanner;

public class App {
    public static void main(String[] args, String S) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print(S);
            String name = input.nextLine();
            System.out.println("\n"+name);
        }
    }


}
//Comment

