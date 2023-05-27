import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[][] matrix = new int[4][4];

        for(int i = 0; i  < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){

                matrix[i][j] = random.nextInt(9);

            }
        }

        System.out.println("Matrix: ");

        for(int[]line : matrix){
            for(int column : line){
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
