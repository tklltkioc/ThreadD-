package MultiThreadTest;

import java.util.concurrent.TimeUnit;

public class SleepUntils {
    public static final void second(long seconds) {

        try {
            TimeUnit.SECONDS.sleep (seconds);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }
}
