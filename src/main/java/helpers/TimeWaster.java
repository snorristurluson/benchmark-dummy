package helpers;

public class TimeWaster implements Benchmark {
    private static int EXTRAWAIT = 3;

    @Override
    public void run(String param) {
        System.out.println(String.format("Running TimeWaster(%s)", param));
        int duration = Integer.parseInt(param);
        long sleepTime = (duration + EXTRAWAIT) * 1000;
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("TimeWaster done");
    }
}
