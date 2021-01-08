package JavaThreads;

import java.util.concurrent.ArrayBlockingQueue;

public class DepartureAuto extends Thread {
    private ArrayBlockingQueue<Auto> arrayBlockingQueue;

    DepartureAuto(ArrayBlockingQueue<Auto> blockCar){
        this.arrayBlockingQueue = blockCar;
    }

    public void run(){
        for (int i = 1; i < 99; i++){
            try {
                sleep(4000);
                System.out.println(arrayBlockingQueue.take() + " leave parking");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Parking place " + arrayBlockingQueue);
    }
}
