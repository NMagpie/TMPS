package com.company;

import java.util.ArrayList;

public class SchoolClass {
    private int numberOfStudents = 0;
    private Humans teacher = null;
    ArrayList <Humans> students = new ArrayList<>();
    private final int id = count++;

    private static int count=0;

    public void addStudent(Humans Student){
        students.add(Student);
        numberOfStudents++;
    }

    public void setTeacher(Humans teacher) {
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
}
