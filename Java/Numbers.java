import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double number;
        double biggest = 0;
        double sum = 0;
        int counter = 0;
        
        do{
            System.out.println("Enter with the "+ (counter+1) + "° number:");
            number = scanner.nextDouble();

            sum += number;
            counter++;

            if(biggest < number)
                biggest = number; 
                
        }while(counter < 5);
        
        System.out.println("The biggest number is: " + biggest);
        System.out.println("The mean is: " + (sum/counter));
    }
}
