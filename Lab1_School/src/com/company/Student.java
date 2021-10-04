package com.company;

public class Student implements Humans {
    private String name;
    private int phone;
    private final int id = count++;
    private int ClassID;
    private TestPaper testPaper;

    private static int count=0;

    private Student (Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.ClassID = builder.ClassID;
        this.testPaper = builder.testPaper;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getPhone() {
        return phone;
    }
    public int getClassID() {
        return ClassID;
    }
    public TestPaper getTestPaper() {
        return testPaper;
    }
    public void setTestPaper(TestPaper testPaper) {
        this.testPaper = testPaper;
    }

    @Override
    public TestPaper createTestPaper(String Theme, String Task) {
        return null;
    }

    public void getHuman() {
        if (ClassID == -1 && testPaper == null)
            System.out.println("Student ID: " + id + "\nName: " + name + "\nPhone: " + phone);
        else if (ClassID != -1 && testPaper ==null)
            System.out.println("Student ID: " + id + "\nName: " + name + "\nPhone: " + phone + "\nClassID:" + ClassID);
        else if (ClassID ==-1 && testPaper != null)
            System.out.println("Student ID: " + id + "\nName: " + name + "\nPhone: " + phone + "\nTestID:" + testPaper.getId());
        else
            System.out.println("Student ID: " + id + "\nName: " + name + "\nPhone: " + phone + "\nClassID:" + ClassID + "\nTestID:" + testPaper.getId());
    }

    static class Builder{
        private String name;
        private int phone;
        private int ClassID = -1;
        private  TestPaper testPaper = null;

        public Builder (String name, int phone){
            this.name = name;
            this.phone = phone;
        }

        public Builder setClassID (int classID) {
            this.ClassID = classID;
            return this;
        }

        public Builder setTestPaper (TestPaper testPaper) {
            this.testPaper = testPaper;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
