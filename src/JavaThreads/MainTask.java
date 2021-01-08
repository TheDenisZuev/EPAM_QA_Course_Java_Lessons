package JavaThreads;

// Разработать консольное многопоточное приложение.
// Использовать возможности, предоставляемые пакетом java.util.concurrent.
// Все сущности, желающие получить доступ к ресурсу, должны быть потоками.

import java.util.concurrent.ArrayBlockingQueue;

public class MainTask {

    public static void main(String[] args) {
        int capacity = 3;
        final ArrayBlockingQueue<Auto> queue = new ArrayBlockingQueue<Auto>(capacity);

        ArriveAuto arriveAuto = new ArriveAuto(queue);
        DepartureAuto departureAuto = new DepartureAuto(queue);

        departureAuto.start();
        arriveAuto.start();
    }
}
