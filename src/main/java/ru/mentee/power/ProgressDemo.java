package ru.mentee.power;

public class ProgressDemo {
    public static void main(String[] args) {
        MenteeProgress progress = new MenteeProgress("Алена", 2, 6);
        System.out.println(progress.summary());
        if (progress.readyForSprint()) {
            System.out.println("Status: sprint ready");
        } else {
            System.out.println("Status: backlog first");
        }
        ProgressTracker tracker = new ProgressTracker();
        Mentee[] mentees = {
                new Mentee("Алена", "Екатеринбург", "Backend", 13, 69),
                new Mentee("Иван", "Москва", "Frontend", 1, 69),
                new Mentee("Дима", "Сочи", "Full-stack", 30, 69)
        };
        String trackerProgress = tracker.calculateTotalProgress(mentees);
        System.out.println(trackerProgress);
    }
}
