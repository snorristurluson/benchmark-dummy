package helpers;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileMaker implements Benchmark {
    private static int EXTRA = 8;

    @Override
    public void run(String param) {
        System.out.println(String.format("Running FileMaker(%s)", param));
        int numFiles = (Integer.parseInt(param) + EXTRA) * 1000;

        for (int i = 0; i < numFiles; i++) {
            try {
                System.out.println(String.format("Creating file %d", i));
                File file = File.createTempFile("FileMaker", ".txt");
                file.deleteOnExit();
                try (PrintStream out = new PrintStream(file)) {
                    out.println(String.format("This is the content of file %d", i));
                }
                Thread.sleep(2);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("FileMaker done");
    }
}
