package com.company;

public class Teacher implements Humans{
    private String name;
    private int phone;
    private final int id = count++;
    private int ClassID;

    private static int count=0;

    private Teacher (Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.ClassID = builder.ClassID;
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

    public void getHuman() {
        if (ClassID == -1)
            System.out.println("Teacher ID: " + id + "\nName: " + name + "\nPhone: " + phone);
        else
            System.out.println("Teacher ID: " + id + "\nName: " + name + "\nPhone: " + phone + "\nClassID:" + ClassID);
    }

    public TestPaper createTestPaper (String Theme, String Task){
        TestPaper testPaper = new TestPaper.Builder(name, ClassID).setTheme(Theme).setTasks(Task).build();
        return testPaper;
    }

    @Override
    public void setTestPaper(TestPaper testPaper1) {
    }

    static class Builder{
        private String name;
        private int phone;
        private int ClassID = -1;

        public Builder (String name, int phone){
            this.name = name;
            this.phone = phone;
        }

        public Builder setClassID(int classID) {
            this.ClassID = classID;
            return this;
        }

        public Teacher build(){
           return new Teacher(this);
        }
    }
}
