package My_Test.nr1.nr1;

import java.util.concurrent.Semaphore;

public class MainSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        semaphore.release();
    }
}
