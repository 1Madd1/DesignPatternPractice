package org.example.strategy_pattern;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleFIFOPrinterQueue implements PrinterQueue {

    private Queue<Job> queue = new LinkedList<Job>();

    @Override
    public void addJob(Job j) {
        queue.add(j);
    }

    @Override
    public Job getNextJob() {
//        if (!queue.isEmpty()) {
//            return queue.remove();
//        }
//        return null;
//        its the same as method below
        return queue.poll();
    }
}
