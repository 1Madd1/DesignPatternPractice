package org.example.strategy_pattern;

import java.util.Random;

public class Job {
    private static int JOB_NUMBER = 1;
    private static final Random random = new Random();
    private int id = JOB_NUMBER++;
    private User user;
    private String content;

    public Job(User user, String content) {
        this.user = user;
        this.content = content;
    }

    public Job(String content) {
        this.user = null;
        this.content = content;
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
