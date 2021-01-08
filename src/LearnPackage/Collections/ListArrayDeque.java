package LearnPackage.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ListArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        // добавляем толканием
        stack.push(1);
        stack.push(2);
        stack.push(3);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(11);
        queue.offer(22);
        queue.offer(33);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
