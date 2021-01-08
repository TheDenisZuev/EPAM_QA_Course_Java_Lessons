package LearnPackage.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(42);
        list.add(null);
        list.add(7);
        list.add(42);
        System.out.println(list);
        list.add(5, 87);
        System.out.println(list);
        // int value = list.get(3);// Exception in thread "main" java.lang.NullPointerException
        Integer value = list.get(3);// нужно для переменной указывать интеджер
        System.out.println(value);

    }
}
