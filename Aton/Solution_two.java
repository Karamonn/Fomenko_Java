import java.util.Scanner;

public class Solution_two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите имя");
        String a = sc.nextLine();
        String b = "Вячеслав";

        if (a.equals(b))
            System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");

    }
}
