package demo.dto;

import java.time.LocalDate;

public class Batch {
    private String batchCode;
    private LocalDate startDate;
    private LocalDate endDate;
    private int duration;
    private String[] mentors;
    private String[] topics;

    public Batch() {
    }

    public Batch(String batchCode, LocalDate startDate, LocalDate endDate,
                 int duration, String[] mentors, String[] topics) {
        this.batchCode = batchCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.mentors = mentors;
        this.topics = topics;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String[] getMentors() {
        return mentors;
    }

    public void setMentors(String[] mentors) {
        this.mentors = mentors;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }
}
