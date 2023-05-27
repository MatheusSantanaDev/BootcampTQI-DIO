import java.util.Scanner;

public class EvenOdd {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many entries are?");
        int entrie = scanner.nextInt();

        int even = 0;
        int odd = 0;
        int counter = 0;

        do{
            System.out.println("Number " + (counter + 1) + " :");
            double number = scanner.nextDouble();
            
            counter++;

            if((number % 2) == 0)
                even++;
            else
                odd++;

        }while(counter<entrie);

        System.out.println("There were " + even + " even numbers.");
        System.out.println("There were " + odd + " odd numbers.");
    }
}