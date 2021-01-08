package Collection.OptionalTasks;

// 2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

import java.util.Scanner;
import java.util.Stack;

public class OptionalTaskTwo {

    public static void main(String[] args) {
        System.out.println("Please input one number: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        number = scanner.nextInt();
        Stack stack = new Stack();
        char[] numbers = String.valueOf(number).toCharArray();
        for (char num : numbers) {
            stack.push(num);
        }
        while (!stack.empty()) {
            char stackReverse;
            stackReverse = (Character) stack.pop();
            System.out.print(stackReverse);
        }
    }
}
