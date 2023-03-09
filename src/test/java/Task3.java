import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Ведите количество элементов массива: ");
            int size = input.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
                array[i] = input.nextInt();
            }
            for (int num : array) {
                if (num % 3 == 0) {
                    System.out.print("\n" + num);
                }
            }
        }
        catch (Exception e){
            System.out.println("Только цифры!");
        }
    }
}
