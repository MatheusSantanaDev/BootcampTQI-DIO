import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consonants = new String[6];
        
        int howManyConsonants = 0;
        int counter = 0;

        System.out.println("Enter with 6 letters: ");
        do{
            System.out.println((counter + 1)+ "°: ");
            String letter = scanner.next();

            if(!(letter.equalsIgnoreCase("a") | letter.equalsIgnoreCase("e") | letter.equalsIgnoreCase("i") | letter.equalsIgnoreCase("o") | letter.equalsIgnoreCase("u"))){
                consonants[counter] = letter;
                howManyConsonants++;
            }
            counter++;

        }while(counter < consonants.length);

        System.out.println("Typed consonants: ");
        
        for(String consonant : consonants){
            if(consonant != null)
                System.out.print(consonant + " ");
        }

        System.out.println("\nAmount of consonants: " + howManyConsonants);
    }
}
