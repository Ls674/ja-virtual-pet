import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner myPet = new Scanner(System.in);
        System.out.println("Enter the characters name: ");
        String name = myPet.nextLine();
        System.out.println("Name: " + name);

        System.out.println("What is your characters job: ");
        String job = myPet.nextLine();
        System.out.println("Job: " + job);

        System.out.println("What is your characters age");
        int age = myPet.nextInt();
        myPet.nextLine();
        System.out.println("Age: " + age);


    }
       
    }



//Comment

