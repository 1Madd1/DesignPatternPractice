package org.example.strategy_pattern;

public interface PrinterQueue {

    /**
     * Adds a job to printer queue
     * @param j - Job class to be added
     */
    void addJob(Job j);

    /**
     * Removes the job that is next from the queue.
     * @return - null if there are no jobs in queue
     */
    Job getNextJob();

}
