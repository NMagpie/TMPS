import humans.Admin;
import humans.Humans;
import paper.Cash;
import paper.TestPaper;
import schoolclass.SchoolClass;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        String Theme = "Creational Design Patterns";
        String Task = "1. Study and understand the Creational Design Patterns.\n" +
                "\n" +
                "2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.\n" +
                "\n" +
                "3. Use some creational design patterns for object instantiation in a sample project.";
        Admin admin = new Admin();
        Humans student = admin.createSchoolStructure("Student");
        Humans teacher = admin.createSchoolStructure("Teacher");
        SchoolClass schoolClass = admin.createClass(10);

        TestPaper testPaper = teacher.createTestPaper(Theme,Task);
        Cash cash = new Cash();
        cash.setTestPaper(testPaper);

        for (Humans classStudent: schoolClass.getStudents()){
            TestPaper testPaperPrototype = cash.getTestPaper();
            classStudent.setTestPaper(testPaperPrototype);
        }

        schoolClass.getProjectorRemote().turnOn();

        testPaper.getTestPaper();

        admin.remove(teacher);
        admin.getHumans();

    }
}
