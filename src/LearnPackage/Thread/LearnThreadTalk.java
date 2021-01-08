package LearnPackage.Thread;

import java.util.concurrent.TimeUnit;

public class LearnThreadTalk implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 7; i++){
            System.out.println("Talk " + i);
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
