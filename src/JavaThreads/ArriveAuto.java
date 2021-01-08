package JavaThreads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArriveAuto extends Thread {
    private ArrayBlockingQueue<Auto> arrayBlockingQueue;

    ArriveAuto(ArrayBlockingQueue<Auto> blockCar){
        this.arrayBlockingQueue = blockCar;
    }

    public void run(){
        for(int i = 1; i < 99; i++){
            Auto auto = new Auto();
            try {
                if (arrayBlockingQueue.offer(auto, 2, TimeUnit.SECONDS)){
                    sleep(100);
                    System.out.println(auto + " is parked");
                } else {
                    Auto departAuto = new Auto();
                    System.out.println("Parking is full");
                    System.out.println(departAuto + " don't find place and leave");
                    System.out.println("Parking place " + arrayBlockingQueue);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
