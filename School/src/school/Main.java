
package school;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wanguars
 */
public class Main {
    
    public static void main(String[] args) {
        List<Subject> subjects = new ArrayList<>();
        List<Class> classes = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        
        Math ms = Math.builder();
        Literature lit = Literature.builder();
        ComputerScience cs = ComputerScience.builder();
        History his = History.builder();
        subjects.add(ms);
        subjects.add(lit);
        subjects.add(cs);
        subjects.add(his);
        
        teachers.add(new Teacher("Koós Piroska", true, true, ms));
        teachers.add(new Teacher("Kormos János", true, false, cs));
        teachers.add(new Teacher("Alpár Máté", false, true, lit));
        teachers.add(new Teacher("Koós Piroska", false, false, his));
        
        students1.add(new Student("Kiss Imre", 15, 3.6f, ms, lit, teachers.get(1)));
        students2.add(new Student("Nagy Tihamér", 16, 3.1f, lit, cs, teachers.get(2)));
        students1.add(new Student("Kovács Rita", 16, 4.6f, his, lit, teachers.get(1)));
        students1.add(new Student("Ürmös Balázs", 15, 3.0f, cs, ms, teachers.get(1)));
        students1.add(new Student("Juhász Hajnalka", 17, 2.3f, ms, cs, teachers.get(1)));
        students2.add(new Student("Kajmán Nikolett", 15, 3.9f, lit, cs, teachers.get(2)));
        students2.add(new Student("Jenes Kálmán", 15, 4.7f, ms, cs, teachers.get(2)));
        students2.add(new Student("Csintalan Ágoston", 16, 4.2f, his, lit, teachers.get(2)));
        
        classes.add(new Class("6b", students1));
        classes.add(new Class("7c", students2));
        
        teachers.get(0).setTeachedClass(classes);
        teachers.get(1).setTeachedClass(classes);
        teachers.get(2).setTeachedClass(classes);
        teachers.get(3).setTeachedClass(classes);
        
        System.out.println(teachers.get(2).exam(ms, students2.get(3)));
        
    }
    
}
