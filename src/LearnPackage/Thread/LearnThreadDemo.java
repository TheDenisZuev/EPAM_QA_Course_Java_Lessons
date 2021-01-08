package LearnPackage.Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LearnThreadDemo {
    public static void main(String[] args) {
        LearnTread walk = new LearnTread();
        // в этом случае у нас уже 2 потока мейн и старт
        walk.start();

        Thread talk = new Thread(new LearnThreadTalk());
        talk.start();

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<String> future = service.submit(new LearnThreadCall());
        try {
            String result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }


}
