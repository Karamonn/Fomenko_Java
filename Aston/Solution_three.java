import java.util.Scanner;


public class Solution_three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Задайте длинну массива");
        int[] x = new int[sc.nextInt()];

        System.out.println("Задайте значения массива");
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("Числа кратные трем: " );

        for (int i = 0; i < x.length; i++) {
            if (x[i] % 3 == 0) {
                System.out.print(x[i] + ", ");
            }
        }
    }
}

