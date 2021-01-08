package LearnPackage.Collections;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //создание: обращение и тип коллекции, название = new вид коллекции
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        System.out.println(set);
        //[one, two, three]
        set.add("three");
        System.out.println(set);
        //[one, two, three] вывод тоже самый, так как не хранит одинаковые экзмпляры
        set.add(new String("three"));
        System.out.println(set);
        //[one, two, three] вывод тоже самый, так как не хранит одинаковые экзмпляры

    }


}
