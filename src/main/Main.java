package main;

import humans.Iterator;
import humans.SchoolClass;
import humans.Student;
import humans.TaskChat;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        String theme = "Creational Design Patterns";
        String task = "1. Study and understand the Creational Design Patterns.\n" +
                "\n" +
                "2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.\n" +
                "\n" +
                "3. Use some creational design patterns for object instantiation in a sample project.";

        School school = new School();

        school.setSchoolName("Lakewood High School");

        school.createClass(14);

        school.createClass(20);

        school.createClass(18);

        school.createClass(24);

        school.removeClass(3);

        school.showClass(2);

        school.turnOnClassProjector(0);

        school.turnOffClassProjector(0);

        school.turnOnClassProjector(1);

        school.createClassTest(2, theme, task);

        //school.showClassTest(2);

        school.setPrincipalInClass(1);

        school.teacherAction(1);

        SchoolClass schoolClass = school.getClass(2);

        schoolClass.getTeacher().sendMessage("№1\n2+2=_\n№2 \n2*2=_");

        Iterator iterator = schoolClass.getIterator();
        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            student.sendMessage("№1 4 №2 4");
        }

    }
}
