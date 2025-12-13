package ru.mentee.power;

public class ProgressTracker {

    public String calculateTotalProgress(Mentee[] mentees) {
        int index = 0;
        int totalCompleted = 0;
        int totalTotal = 0;
        int totalRemaining = 0;
        if (mentees.length == 0 || (mentees[index] == null)) {
            System.out.println("Список обучающихся пуст");
        } else {
            if (mentees.length != 0 && !(mentees[index] == null)) {
                while (index < mentees.length) {
                    totalCompleted += mentees[index].completedLessons();
                    totalTotal += mentees[index].totalLessons();
                    index++;
                    totalRemaining = totalTotal - totalCompleted;
                }
            }
        }
        return String.format("суммарно пройдено %d из %d уроков, осталось %d уроков", totalCompleted, totalTotal, totalRemaining);
    }
}

