import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = inputName.nextLine();
        if(name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}