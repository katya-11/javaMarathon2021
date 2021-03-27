package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(String studentName) {
        final int min = 2;
        final int max = 5;
        final int rnd = rnd(min, max);
        String evaluationText = "";
        switch (rnd) {
            case 5:
                evaluationText = "отлично";
                break;
            case 4:
                evaluationText = "хорошо";
                break;
            case 3:
                evaluationText = "удовлетворительно";
                break;
            case 2: case 1: case 0:
                evaluationText = "неудовлетворительно";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + studentName + " по предмету '" + this.subject + "' на оценку '" + evaluationText + "'");
    }

    public int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
