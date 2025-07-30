package org.example.strategy_pattern;

import java.util.Random;

public class Job {
    private static int JOB_NUMBER = 1;
    private static final Random random = new Random();
    private int id = JOB_NUMBER++;
    private User user;
    private final static int DEFAULT_PRIORITY = 50;
    private int priority = DEFAULT_PRIORITY;
    private String content;

    public Job(User user, String content, int priority) {
        this.user = user;
        this.content = content;
        this.priority = priority;
    }

    public Job(String content) {
        this.user = null;
        this.content = content;
    }

    public Job(String content, int priority) {
        this.user = null;
        this.content = content;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public int getId() {
        return this.id;
    }

    public User getUser() {
        return this.user;
    }

    public String getContent() {
        return this.content;
    }

    public void done() {
        if (this.user != null) {

        }
    }
}
