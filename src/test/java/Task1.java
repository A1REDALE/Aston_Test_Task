import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = inputNum.nextInt();
        if (num > 7) {
                System.out.println("Привет");
        }
    }
}
