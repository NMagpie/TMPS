package schoolclass;

import equipment.Projector;
import equipment.Remote;
import humans.Humans;
import humans.Teacher;

import java.util.ArrayList;

public class SchoolClass {
    private int numberOfStudents = 0;
    private Teacher teacher = null;
    private final ArrayList <Humans> students = new ArrayList<>();
    private final int id = count++;
    private final Projector projector = new Projector();
    private final Remote projectorRemote = new Remote(projector);

    private static int count = 0;

    public void addStudent(Humans Student){
        students.add(Student);
        numberOfStudents++;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void getTeacherSout() {
        teacher.getHuman();
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public ArrayList<Humans> getStudents() {
        return students;
    }

    public void getSchoolClass(){
        System.out.println("\n" + "Class ID: " + id);
        teacher.getHuman();
        for (int i = 0; i < numberOfStudents; i++) {
             System.out.print("\n");
             students.get(i).getHuman();
        }
    }

    public Projector getProjector() {
        return projector;
    }

    public Remote getProjectorRemote() {
        return projectorRemote;
    }
}
