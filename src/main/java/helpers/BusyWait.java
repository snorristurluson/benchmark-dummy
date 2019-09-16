package helpers;

public class BusyWait implements Benchmark {
    private static int EXTRAWAIT = 3;

    @Override
    public void run(String param) {
        int duration = Integer.parseInt(param);
        long start = System.currentTimeMillis();
        long end = start + (duration + EXTRAWAIT) * 1000;
        long counter = 0;
        while (System.currentTimeMillis() < end) {
            counter++;
        }
    }
}
