package FundamentalsTasks;

// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

import java.util.Scanner;

public class FundamentalsTaskOne {
    public static void main(String[] args) {
        System.out.println("Enter name, please:");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Hello " + name);
    }
}
