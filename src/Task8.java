import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int matrix[][] = new int[8][5];
        Random rnd = new Random();
        int indexOfMax1 = 0;
        int indexOfMax2 = 0;
        int indexOfMin1 = 0;
        int indexOfMin2 = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(21)-10;
                System.out.format("%4d",matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrix[indexOfMax1][indexOfMax2]){
                    indexOfMax1 = i;
                    indexOfMax2 = j;
                }
                 else if (matrix[i][j] < matrix[indexOfMin1][indexOfMin2]){
                    indexOfMin1 = i;
                    indexOfMin2 = j;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("\nМинимальный элемент матрицы  [" + indexOfMin1 + "][" + indexOfMin2 + "]" + " = " + min);
        System.out.println("Максимальний элемент матрицы [" + indexOfMax1+ "][" + indexOfMax2 + "] = " + max);

    }
}
