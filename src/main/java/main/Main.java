package main;

import helpers.Benchmark;
import helpers.BusyWait;
import helpers.TimeWaster;

public class Main {
    public static void main(String[] args) {
        String benchmark = args[0];
        String param = args[1];

        Benchmark bm = null;
        if (benchmark.equals("TimeWaster")) {
            bm = new TimeWaster();
        } else if (benchmark.equals("BusyWait")) {
            bm = new BusyWait();
        }

        if (bm != null) {
            bm.run(param);
        }
    }
}
