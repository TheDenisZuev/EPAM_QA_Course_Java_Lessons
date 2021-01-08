package Collection.OptionalTasks;

// 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class OptionalTaskFour {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/Collection/OptionalTasks/TaskFour.txt"));
            List<String> lines = new ArrayList<>();
            while (scanner.hasNextLine()){
                String words = scanner.nextLine();
                lines.add(words);
                System.out.println(words);
            }
            System.out.println("------");
            System.out.println("Sort:");
            Collections.sort(lines, LINES_COMPARATOR);

            for (String line: lines){
                System.out.println(line);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final Comparator<String> LINES_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };
}
