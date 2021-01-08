package LearnPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class LearnJavaIOPrint {
    public static void main(String[] args) {
        File file = new File("data/test3.txt");
        double[] values = {1.10, 1.2, 1.401, 5.01, 6.017, 7, 8};
        try (PrintStream stream = new PrintStream(new FileOutputStream(file))){
            for (double value: values) {
                stream.printf("Java %.2g%n", value);
                System.setOut(stream);
                System.out.printf("%.2g", value);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
