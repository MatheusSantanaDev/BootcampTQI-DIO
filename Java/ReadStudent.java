import java.util.Scanner;

public class ReadStudent {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name;
        int year;

        while (true){
            System.out.println("Name: ");
            name = scanner.next();
            if(name.equals("0"))
            break;

            System.out.println("Year: ");
            year = scanner.nextInt();
        }
        
    }
}
