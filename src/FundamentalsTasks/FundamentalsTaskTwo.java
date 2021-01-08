package FundamentalsTasks;

// 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.Scanner;

public class FundamentalsTaskTwo {
    public static void main(String[] args) {
        System.out.println("Enter string arg, please:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String reverse = new StringBuffer(console.nextLine()).reverse().toString();
        System.out.println("String after reverse: " + reverse);
    }
}

