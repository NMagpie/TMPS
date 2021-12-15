package humans;

import equipment.Projector;
import equipment.Remote;

import java.util.ArrayList;

public class SchoolClass implements Collection {
    private int numberOfStudents = 0;
    private final ArrayList <Student> students = new ArrayList<>();
    private final int id = count++;
    private final Projector projector = new Projector();
    private final Remote projectorRemote = new Remote(projector);
    TaskChat chat = new TaskChat(this);
    private Humans teacher = new Teacher.Builder()
            .setName("Lora")
            .setPhone((int) (Math.random()*999999999) + 10000000)
            .setClassID(id)
            .setChat(chat)
            .build();

    private static int count = 0;

    public void addStudent(Student Student){
        students.add(Student);
        numberOfStudents++;
    }

    public TaskChat getChat() {
        return chat;
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

    public Humans getTeacher(){
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void getSchoolClass(SchoolClass schoolClass){
        System.out.println("\n" + "Class ID: " + id);
        teacher.getHuman();
        Iterator iterator = schoolClass.getIterator();
        while (iterator.hasNext()){
            System.out.print("\n");
            Student student = (Student) iterator.next();
            student.getHuman();
        }
    }

    public Projector getProjector() {
        return projector;
    }

    public Remote getProjectorRemote() {
        return projectorRemote;
    }

    @Override
    public Iterator getIterator() {
        return new StudentIterator();
    }

    private class StudentIterator implements Iterator
    {
        int index;

        @Override
        public boolean hasNext() {
            if (index < students.size()) return true;
            return false;
        }

        @Override
        public Humans next() {
            return students.get(index++);
        }
    }
}
