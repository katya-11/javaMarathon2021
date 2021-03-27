package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Синепалый Александр Борисович", "Математика");
        Student student1 = new Student("Петров Олег");
        Student student2 = new Student("Иванов Григорий");

        teacher.evaluate(student1.getName());
        teacher.evaluate(student2.getName());
    }
}
