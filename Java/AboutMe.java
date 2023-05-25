import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    
    public static void main(String[] args) {
        /* 
        String name = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);
        */
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your last name: ");
        String lastName = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your height (In meters): ");
        double height = scanner.nextDouble();

        System.out.println("Hi, my name is " + name + " " + lastName);
        System.out.println("I am " + age + " years old");
        System.out.println("My height is " + height + "m");
    }    
}
