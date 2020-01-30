package school;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int age;
    float gradeAverage;
    Teacher headTeacher;
    List<Subject> favoriteSubjects;

    public Student(String name, int age, float gradeAverage, Subject subject1, Subject subject2,
            Teacher headTeacher) {
        this.name = name;
        this.age = age;
        this.gradeAverage = gradeAverage;
        this.headTeacher = headTeacher;
        favoriteSubjects = new ArrayList<>();
        favoriteSubjects.add(subject1);
        favoriteSubjects.add(subject2);

    }

}
