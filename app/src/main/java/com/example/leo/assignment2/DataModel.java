package com.example.leo.assignment2;

public class DataModel {

    String title;
    String trainer;
    String schedule;

    public DataModel(String title, String trainer, String schedule) {
        title = this.title;
        trainer = this.trainer;
        schedule = this.schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getTitle() {
        return title;
    }

    public String getTrainer() {
        return trainer;
    }
}
