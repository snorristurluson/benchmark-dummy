package helpers;

public class BusyWait implements Benchmark {
    private static int EXTRAWAIT = 7;

    @Override
    public void run(String param) {
        System.out.println(String.format("Running BusyWait(%s)", param));
        int duration = Integer.parseInt(param);
        long start = System.currentTimeMillis();
        long end = start + (duration + EXTRAWAIT) * 1000;
        long counter = 0;
        while (System.currentTimeMillis() < end) {
            counter++;
        }
        System.out.println("BusyWait done");
    }
}
