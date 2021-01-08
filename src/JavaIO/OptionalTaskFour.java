package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OptionalTaskFour {
    //4. Прочитать текст Java-программы и в каждом слове длиннее двух символов все строчные символы заменить прописными.
    public static void main(String[] args) {
        String catalog = "src/JavaIO/Data/";
        String type = ".txt";

        FileWriter fileWriter;
        try (FileReader fileReader = new FileReader(catalog + "lowerText" + type)) {
            fileWriter = new FileWriter(catalog + "upperText" + type);
            Scanner scanner = new Scanner(fileReader);
            String text = "";
            while (scanner.hasNext()){
                String nextWord = scanner.next();
                if(nextWord.length() > 2){
                    text = text.concat(nextWord.toUpperCase() + " ");
                }
                else {
                    text = text.concat(nextWord + " ");
                }
            }
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
