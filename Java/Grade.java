import java.util.Scanner;

public class Grade {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a grade between 0 and 10: ");
            int grade = scanner.nextInt();
            
            if (grade>=0 && grade<=10)
                break;
            else{
                System.out.println("Invalid! Try again.");
                continue;
            }
        }
        
        

    }
}
