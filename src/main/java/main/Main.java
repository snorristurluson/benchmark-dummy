package main;

import helpers.Benchmark;
import helpers.BusyWait;
import helpers.FileMaker;
import helpers.TimeWaster;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        String benchmark = args[0];
        String param = args[1];

        System.out.println(String.format("benchmark-dummy %s %s", benchmark, param));

        Benchmark bm = null;
        if (benchmark.equals("TimeWaster")) {
            bm = new TimeWaster();
        } else if (benchmark.equals("BusyWait")) {
            bm = new BusyWait();
        } else if (benchmark.equals("FileMaker")) {
            bm = new FileMaker();
        }

        if (bm != null) {
            bm.run(param);
        } else {
            System.err.println("Unknown benchmark");
        }
    }
}
