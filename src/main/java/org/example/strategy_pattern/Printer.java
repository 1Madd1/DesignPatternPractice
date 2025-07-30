package org.example.strategy_pattern;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Printer extends Thread{
    private boolean shouldRun = true;
    private List<Job> jobs;
    private Random myRandom = new Random();

    public Printer() {
        this.jobs = new LinkedList<Job>();
    }

    @Override
    public void run() {
        while (this.shouldRun) {
            try {
                Thread.sleep(100);
                Job j = null;
                synchronized (this) {
                    j = this.getNextJob();
                }
                if (j != null) {
                    this.printJob(j);
                    synchronized (this) {
                        this.removeJob(j);
                    }
                    this.informUser(j);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private Job getNextJob() {
        if (this.jobs.isEmpty())
            return null;
        return this.jobs.get(0);
    }

    private void removeJob(Job j) {
        this.jobs.remove(0);
    }

    private void printJob(Job j) {
        try {
            System.out.println("Start of job " + j.getId());
            Thread.sleep(this.myRandom.nextInt(1000));
            System.out.println("Printed: " + this.getJobAsPrinterLanguage(j));
            Thread.sleep(this.myRandom.nextInt(1000));
            System.out.println("End of job: " + j.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void informUser(Job j) {
        if (j.getUser() != null) {
            System.out.println("Notifying the user: " + j.getUser().getName() + " that the job is done");
            j.getUser().printJobComplete(j);
        }
    }

    private String getJobAsPrinterLanguage(Job j) {
        //fake translation, meant for simulating as if translating it
        String retVal = new StringBuilder(j.getContent().toUpperCase()).reverse().toString();
        System.out.println("Translated: " + j.getContent() + " --> " + retVal);
        return retVal;
    }

    synchronized public void print(Job job) {
        this.jobs.add(job);
    }


    public void shutdownPrinter() {
        this.shouldRun = false;
    }
}
