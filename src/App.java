import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the characters name: ");
        String name = input.nextLine();
        System.out.println("Name: " + name);

        System.out.println("What is your characters job: ");
        String job = input.nextLine();
        System.out.println("Job: " + job);

        System.out.println("What is your characters age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Age: " + age);

        Character myCharacter = new Character(name, job, age); 
        System.out.println(myCharacter);

    }
       
    }



//Comment

