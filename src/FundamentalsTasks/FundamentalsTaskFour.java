package FundamentalsTasks;

import java.util.Scanner;

// 4. Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

public class FundamentalsTaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first num, please:");
        int x = input.nextInt();
        System.out.println("Enter second num, please:");
        int y = input.nextInt();
        System.out.println("Sum = " + (x + y));
        System.out.println("Multiplication = " + (x * y));
    }
}
