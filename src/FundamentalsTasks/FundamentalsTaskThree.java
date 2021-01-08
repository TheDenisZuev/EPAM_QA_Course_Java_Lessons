package FundamentalsTasks;

// 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class FundamentalsTaskThree {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        for (int i = 0; i < 3; i++) {
            int randomNumber = min + (int) (Math.random() * max);
            System.out.println(" " + randomNumber);
        }
        for (int i = 0; i < 5; i++) {
            int randomNumber = min + (int) (Math.random() * max);
            System.out.print(" " + randomNumber);
        }
    }
}
