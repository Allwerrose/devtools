package ru.mentee.power;

public class ProgressDemo {
    public static void main(String[] args) {
        // напиши new MenteeProgress( "Имя студента", 1, 6)  затем выдели и набери Ctrl + Alt + V (Windows/Linux) или Option + Command + V (macOS) выделяет выражение в переменную.
        MenteeProgress progress = new MenteeProgress("Алена", 2, 6);
        System.out.println(progress.summary());
        if (progress.readyForSprint()) {
            System.out.println("Status: sprint ready");
        } else {
            System.out.println("Status: backlog first");
        }
    }
}
