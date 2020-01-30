package school;

import java.util.List;
import java.util.Random;

public class Teacher {
	//Variables of Teacher instance
    String name;
    boolean strict;
    boolean headTeacher;
    Subject teachedSubject;
    private List<Class> teachedClass;
    
    //Variables used to execute exam method
    int strictness;
    int multiplier;
    Random rand;
    int knowledge;
    int difficulty;
    int result = Integer.MAX_VALUE;;
    
    public Teacher(String name, boolean strict, boolean headTeacher,
            Subject teachedSubject) {
        this.name = name;
        this.strict = strict;
        this.headTeacher = headTeacher;
        this.teachedSubject = teachedSubject;

    }
    /**This method created to execute exams on students by teachers.
     * 
     * 
     * @param subject - the subject of exam.
     * @param student - the student who answers the exam.
     * @return result - returns the exam result in integer
     */
    public String exam(Subject subject, Student student) {
        
        rand = new Random();
        knowledge = rand.nextInt(15) + 1;
        difficulty = 0;
        

        if (subject == Math.mathematics) {
            difficulty = 40;
        } else {
            difficulty = 10;
        }

        if (strict == true) {
            strictness = 3;
        } else {
            strictness = 10;
        }
        if (student.favoriteSubjects.get(0) == subject
                || student.favoriteSubjects.get(1) == subject) {
            multiplier = 10;
        } else {
            multiplier = 5;
        }

        result = (multiplier * (strictness + knowledge) - difficulty);
        if (result > 150) {
            return student.name + " " + subject.name + " " + result + " Megfelelt!";
        } else {
            return student.name + " " + subject.name + " " + result + " Nem felelt meg!";
        }
    }

    public List<Class> getTeachedClass() {
        return teachedClass;
    }

    public void setTeachedClass(List<Class> teachedClass) {
        this.teachedClass = teachedClass;
    }

}
