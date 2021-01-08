package LearnPackage;

import java.io.*;
import java.util.Arrays;
import java.util.Properties;


public class LearnJavaIO {
    //Run-Config-Program arguments - устанавливаем туда текст, забрать его можно String elements
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        //properties.list(System.out);
        // добавить свои property Run-Config-VM option - установить -DCuSoM=Value_12345

        FileInputStream input = null;

        try {
            // берем файл
            input = new FileInputStream("data/test1.txt");
            // читаем файл
            int code = input.read();
            System.out.println(code + " " + (char)code);

            // поместим в байтовый массив
            byte[] array = new byte[16];
            int num = input.read(array);
            System.out.println(num); // общее количество байтов
            System.out.println(Arrays.toString(array)); // список байтов
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null){
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //******* можно вынести в параметры создание ридера
        // чтобы его закрывал сам трай без файналли
        try (FileReader reader = new FileReader("data/test2.txt");
             //FileWriter writer = new FileWriter("data/test2.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            bufferedReader.lines().forEach(System.out::println);
            //writer.write("Java");
            int symbol = reader.read(); // читаем первый символ
            //System.out.println(symbol);
            char[] buffer = new char[8]; // создаем массив буфер и читаем его
            reader.skip(2); // можем пропустить часть символов
            //reader.read(buffer);
            //System.out.println(Arrays.toString(buffer));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
