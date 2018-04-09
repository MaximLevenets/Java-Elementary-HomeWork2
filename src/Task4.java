import java.util.Random;

/*5. Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5]
каждый, выведите массивы на экран в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и сообщите,
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)*/
public class Task4 {
    public static void main(String[] args) {
        double sum_arrayOne = 0, sum_arrayTwo = 0;
        double average_arrayOne = 0, average_arrayTwo = 0;
        int arrayOne[] = new int[5];
        int arrayTwo[] = new int[5];
        Random rnd = new Random();

        System.out.print("Массив №1: ");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = rnd.nextInt(6);
            sum_arrayOne += arrayOne[i];
            average_arrayOne = sum_arrayOne / arrayOne.length;
            System.out.print(arrayOne[i] + " ");
        }
        System.out.print("\nМассив №2: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = rnd.nextInt(6);
            sum_arrayTwo += arrayTwo[i];
            average_arrayTwo = sum_arrayTwo / arrayTwo.length;
            System.out.print(arrayTwo[i] + " ");
        }
        if (average_arrayOne > average_arrayTwo){
            System.out.print("\nСреднее арифметическое Массива №1 больше Массива №2 " + "(" + average_arrayOne  + " > " + average_arrayTwo+")");
        }
        else if (average_arrayOne < average_arrayTwo){
            System.out.print("\nСреднее арифметическое Массива №2 больше Массива №1" + "(" + average_arrayOne  + " < " + average_arrayTwo + ")");
        }
        else System.out.print("\nСредние арифметические Массива №1 и Массива №2 равны" + "(" + average_arrayOne  + " = " + average_arrayTwo + ")");
    }
}
