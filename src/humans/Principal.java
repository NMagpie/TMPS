package humans;

import schoolclass.SchoolClass;

import java.util.ArrayList;

public class Principal {

    private final ArrayList<Humans> students = new ArrayList<>();
    private final ArrayList<Humans> teachers = new ArrayList<>();
    private final String[] names = new String[]{"John", "Monkey", "Li", "Dinara", "Artem", "Elina", "Liam", "Olivia", "Noah", "Emma", "Oliver","Ava", "William", "Sophia", "Elijah", "Isabella", "James", "Charlotte", "Benjamin", "Amelia", "Lucas", "Mia", "Mason", "Harper", "Ethan", "Evelyn"};

    public void getHumans(){
        for (Humans student:students) {
            student.getHuman();

        }
        for (Humans teacher:teachers) {
            teacher.getHuman();
        }
    }

    public Humans createSchoolStructure(String typeOfHuman){
        switch (typeOfHuman){
            case "Student" :
                Humans student = new Student.Builder()
                        .setName(names[(int) (Math.random()*25)])
                        .setPhone((int) (Math.random()*999999999) + 10000000)
                        .build();
                students.add(student);
                return student;
            case "Teacher" :
                Humans teacher = new Teacher.Builder()
                        .setName(names[(int) (Math.random()*25)])
                        .setPhone((int) (Math.random()*999999999) + 10000000)
                        .build();
                teachers.add(teacher);
                return teacher;
            default: return null;
        }
    }

    public SchoolClass createClass (int numberOfStudents){

        SchoolClass schoolClass = new SchoolClass();

        schoolClass.setTeacher(new Teacher.Builder()
                .setName(names[(int) (Math.random()*25)])
                .setPhone((int) (Math.random()*999999999) + 10000000)
                .setClassID(schoolClass.getId())
                .build());

        for (int i = 0; i < numberOfStudents; i++)
            schoolClass.addStudent(new Student.Builder()
                    .setName(names[(int) (Math.random()*25)])
                    .setPhone((int) (Math.random()*999999999) + 10000000)
                    .setClassID(schoolClass.getId())
                    .build());

        students.addAll(schoolClass.getStudents());
        teachers.add(schoolClass.getTeacher());

        return schoolClass;
    }

    public void remove (Humans human)
    {
        if (Student.class.equals(human.getClass()))
            students.remove(human.getId());
        if (Teacher.class.equals(human.getClass()))
            teachers.remove(human.getId());
    }

    public void action() {
        System.out.println("Principal: \"I'm administrating!\"");
    }

    public String[] getNames() {
        return names;
    }

}
