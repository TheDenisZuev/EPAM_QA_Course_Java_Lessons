package FundamentalsTasks;

import java.util.Scanner;

// Задание. Ввести n чисел с консоли.
// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class FundamentalsOptionalTaskOne {

    public static void main(String[] args) {
        String longestNumber = null, shortestNumber = null;
        int longestLength = 0, shortestLength = 10;
        System.out.println("How many numbers do you have?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        System.out.println("Enter numbers, please:");
        for(int i = 0; i < numbers.length; i++) {
            // перебераем массив в текстовые переменные
            String digits = scanner.next();
            if (shortestLength > digits.length()){
                shortestLength = digits.length();
                shortestNumber = digits;
            }
            if (longestLength < digits.length()){
                longestLength = digits.length();
                longestNumber = digits;
            }
        }
        System.out.println("Shortest number is " + shortestNumber + ". Length is " + shortestLength);
        System.out.println("Longest number is " + longestNumber + ". Length is " + longestLength);
    }
}
