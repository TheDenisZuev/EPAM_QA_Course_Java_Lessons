package LearnPackage.Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class ListHashSet {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(1000);
        words.add("8Y1");
        words.add("2Y");
        words.add("2Y2");
        words.add("8Y1");
        words.add("6Y");
        words.add("5Z");
        System.out.println(words);
        TreeSet<String> treeSet = new TreeSet<>(words);
        System.out.println(treeSet);
    }
}
