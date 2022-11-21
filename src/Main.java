import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Incrementor incrementor = new Incrementor();

        IntStream.range(0, 1000).forEach(iteration -> executorService.submit(incrementor::increment));

        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);

        System.out.println("Result is: " + incrementor.getIncrement());
    }
}