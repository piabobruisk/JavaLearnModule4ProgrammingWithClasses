package by.epam.pia.learning.classes.classesobjects.task3;

public class Student {

    private String fio;
    private int groupNumber;
    private int[] progress = new int[5];

    public Student(String fio, int groupNumber, int[] progress) {
        this.fio = fio;
        this.groupNumber = groupNumber;
        this.progress = progress;
    }

    public boolean isExcellent() {

        for (int j : progress) {
            if (j != 9 && j != 10) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student " + fio + ", number group " + groupNumber;

    }
}
