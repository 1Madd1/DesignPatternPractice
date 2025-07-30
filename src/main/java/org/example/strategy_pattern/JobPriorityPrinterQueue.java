package org.example.strategy_pattern;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JobPriorityPrinterQueue implements PrinterQueue {

    private Queue<Job> queue = new PriorityQueue<>(10, new Comparator<Job>() {
        public int compare(Job o1, Job o2) {
            return Integer.compare(o1.getPriority(), o2.getPriority());
        };
    });

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
