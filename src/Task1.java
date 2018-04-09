import java.util.Scanner;
/*Ввести с клавиатуры массив из 5 элементов, умножить все элементы на 2 и вывести
  полученный массив на экран.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Заполните массив из 5-ти чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Исходный массив:\t\t\t\t\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.print("\n" + "Умноженный массив умноженый на 2:\t");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.print(array[i] + "\t");
        }
    }
}
