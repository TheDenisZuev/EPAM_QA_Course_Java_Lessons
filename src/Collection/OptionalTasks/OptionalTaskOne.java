package Collection.OptionalTasks;

// 1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTaskOne {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        try (Scanner scanner = new Scanner(new File("src/Collection/OptionalTasks/TaskOneInput.txt"));
        FileWriter writer = new FileWriter(new File("src/Collection/OptionalTasks/TaskOneOutput.txt"))){
            while(scanner.hasNextLine()){
                stack.push(scanner.nextLine());
            }
            int size = stack.size();
            for (int i = 0; i < size; i++){
                writer.write(stack.pop()+ "\n");
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
