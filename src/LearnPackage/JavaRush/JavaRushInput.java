package LearnPackage.JavaRush;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaRushInput {

    public JavaRushInput() throws FileNotFoundException {
    }

    public static void main(String[] args) {

        // конструкция по контролю введенных данных
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо! Вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        System.out.println();

        // конструкция по вводу и выводу стиха с переносом
        Scanner scan = new Scanner("На голой ветке\n" +
                "Ворон сидит одиноко.\n" +
                "Осенний вечер.\n\n***" +
                " \n" +
                " \n" +
                "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеет свежий срез.\n\n***" +
                " \n" +
                " \n" +
                "Как разлилась река!\n" +
                "Цапля бредет на коротких ножках,\n" +
                "По колено в воде.");

        scan.useDelimiter("\n/*/*/*");

        // пока есть следующая строка, печатаем ее
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

        scan.close();
    }

    // поток для ввода с консоли
    // хранит данные в буфере
    // буфер может использовать readLine() для чтения целыми строками!
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    // поток для ввода с файла
    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\D\\testFile.txt"));

}
