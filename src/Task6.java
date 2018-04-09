import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int arr[] = new int[10];
        int temp = 0;
        System.out.print("Исходный массив:\t\t");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = rnd.nextInt(100);
            System.out.print(arr[i] + "  ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i ; j--) {
                if (arr[j] % 10 < arr[j - 1] % 10){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
