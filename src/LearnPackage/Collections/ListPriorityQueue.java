package LearnPackage.Collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ListPriorityQueue {
    public static void main(String[] args) {
        Queue<String> prior = new PriorityQueue<>(Comparator.reverseOrder());
        prior.offer("J");
        prior.offer("A");
        prior.offer("V");
        prior.offer("A");
        prior.offer("Z");
        // извлекаем пока коллекция не станет пустой
        while (!prior.isEmpty()){
            System.out.println(prior.poll());
        }
    }
}
