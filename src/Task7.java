import java.sql.Array;
import java.util.*;

/*«1»: Написать программу, которая сортирует массив ПО УБЫВАНИЮ и ищет в нем элемент,
равный X (это число вводится с клавиатуры)*/
public class Task7 {
    public static void main(String[] args) {
        int find, arr, temp;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Укажите размер массива:");
        arr = sc.nextInt();

        System.out.println("Укажите число для поиска (от 0 до 20): ");
        find = sc.nextInt();

        Integer array[] = new Integer[arr];
        System.out.print("Сгенерированый массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(21);
            System.out.print(array[i] + "  ");
        }
/*        System.out.print("\nОтсортированый массив: ");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
            System.out.print(array[i] + "  ");*/

        System.out.println();
        System.out.print("Отсортированый массив: ");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                System.out.println("Поисковое значение \"" + find + "\" находится в ячейке [" + i + "]");
            }
        }
    }
}

