package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OptionalTaskTwo {
    // 2. Прочитать текст Java-программы и все слова public в объявлении атрибутов и
    // методов класса заменить на слово private.
    public static void main(String[] args) {
        String catalog = "src/JavaIO/Data/";
        String type = ".txt";

        FileWriter fileWriter;
        try (FileReader fileReader = new FileReader(catalog + "programText" + type)) {
            fileWriter = new FileWriter(catalog + "modifiedText" + type);
            Scanner scanner = new Scanner(fileReader);
            String text = "";
            while (scanner.hasNext()){
                text = text.concat(scanner.nextLine().replace("public", "private") + "\n");
            }
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
