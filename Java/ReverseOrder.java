public class ReverseOrder {
    public static void main(String[] args) {
       int[] vector = {-5, -6, 15, 50, 8, 4};
       
       int counter = 0;

       System.out.print("Vector: ");

       while(counter < (vector.length)){
          
            System.out.print(vector[counter] + " ");
            counter++;
       }
       
       System.out.print("\nReverse Vector: ");
       
       for(int i = (vector.length-1); i >= 0; i--){
            System.out.print(vector[i] + " ");
       }
    }
}
