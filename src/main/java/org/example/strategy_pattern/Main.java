package org.example.strategy_pattern;

import java.util.Random;

public class Main {

    private static final int NUMBER_OF_JOBS = 10;
    private static final int MAX_JOBS_DURATION_IN_SEC = 2;

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Starting experiment");
        User u[] = {
                new User("Petter"),
                new User("John"),
                new User("George")

        };
        Printer p = new Printer(Printer.QueueStrategy.JobPriority);
        p.start();
        for (int i = 0; i < NUMBER_OF_JOBS; i++) {
            p.print(
                    new Job(
                            u[r.nextInt(u.length)],
                            "Content set (something random=" + r.nextInt() + ")" + i,
                            r.nextInt(100)
                    )

            );
        }
        try {
            // We know the experiment can not take more tha this to complete all the jobs
            Thread.sleep(NUMBER_OF_JOBS*MAX_JOBS_DURATION_IN_SEC*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        p.shutdownPrinter();
        System.out.println("Ending experiment");
    }
}
