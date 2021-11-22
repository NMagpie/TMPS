package humans;

import paper.TestPaper;

public class Student implements Humans {
    private String indicate = "Student";
    private String name;
    private final int phone;
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

    public String getIndicate() {
        return indicate;
    }

    @Override
    public TestPaper createTestPaper(String Theme, String Task) {
        return null;
    }

    public void getHuman() {
        System.out.print("\nStudent ID: " + id + "\nName: " + name + "\nPhone: " + phone);
        if (ClassID != -1)
            System.out.print("\nClassID: " + ClassID);
        if (testPaper != null)
            System.out.print("\nTestID: " + testPaper.getId());
        System.out.println();
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
