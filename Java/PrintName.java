public class PrintName {

public static void main(String[] args) {
    
    System.out.print("Hello everybody \n");
    
    String firstName = "Matheus";
    String secondName = "Santana";
    
    String completeName = completeName(firstName, secondName);
    System.out.println(completeName);
       
}
public static String completeName(String firstName, String secondName) {
    return "Result of method: " + firstName.concat(" ").concat(secondName);
}
}
