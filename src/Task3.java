import java.util.Random;

/*Заполнить массив из 10 элементов случайными числами в интервале [-10..10]
 и найти в нем максимальный и минимальный элементы и их номера.
 */
public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int array[] = new int[10];

        int indexOfMax = 0;
        int indexOfMin = 0;
        //int min = array[0];
        int min = 0;
        //int max = array[0];
        int max = 0;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(21) - 10;
            System.out.print(array[i] + "   ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } else  if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\nМинимальный  элемент массива array [" + indexOfMin + "] = " + min);
        System.out.println("Максимальний элемент массива array [" + indexOfMax + "] = " + max);
    }
}
