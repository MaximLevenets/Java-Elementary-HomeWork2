import java.util.Random;

/*3. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве
чётных элементов и выведете это количество на экран на отдельной строке.*/
public class Task5 {
    public static void main(String[] args) {
        int array[] = new int[15];
        Random rnd = new Random();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
            System.out.print(array[i] + " ");
            if (array[i] > 0 && array[i] % 2 == 0)
                count++;
        }
        System.out.println("\nКоличество чётных элементов в массиве: " + count);
    }
}
