package FundamentalsTasks;

// 2. Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.Scanner;

public class FundamentalsOptionalTaskTwo {
    public static void main(String[] args) {
        int count;
        System.out.println("How many numbers do you have?");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();

        int[] numbers = new int[count];
        System.out.println("Enter numbers, please:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("Descending: ");
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] < numbers[j]) {
                    int memory = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = memory;
                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Ascending: ");
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numbers[i] > numbers[j]) {
                    int memory = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = memory;
                }
            }
            System.out.print(numbers[i] + " ");
        }
    }
}