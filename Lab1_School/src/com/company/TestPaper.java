package com.company;

public class TestPaper implements Cloneable {
    private final int id = count++;
    private String teacherName;
    private int Duration;
    private int ClassID;
    private String Theme;
    private String Tasks;

    private static int count=0;

    public TestPaper(Builder builder) {
        this.teacherName = builder.teacherName;
        this.Duration = builder.Duration;
        this.ClassID = builder.ClassID;
        this.Theme = builder.Theme;
        this.Tasks = builder.Tasks;
    }

    public int getId() {
        return id;
    }

    @Override
    public TestPaper clone() throws CloneNotSupportedException {
        return (TestPaper) super.clone();
    }

    public void getTestPaper() {
        if (Theme == null && Tasks == null)
            System.out.println("There is not such test!");
        else if (ClassID == -1)
            System.out.println("\nTest\nTeacher:" + teacherName + "\nDuration: " + Duration + "\nTheme: " + Theme + "\nTasks:\n" + Tasks);
        else
            System.out.println("\nTest\nTeacher:" + teacherName + "\nDuration: " + Duration + "\nClassID: " + ClassID + "\nTheme: " + Theme + "\nTasks:\n" + Tasks);
    }

    static class Builder{
        private String teacherName;
        private final int Duration =45;
        private int ClassID;
        private String Theme = null;
        private String Tasks = null;


        public Builder (String teacherName, int ClassID){
            this.teacherName = teacherName;
            this.ClassID = ClassID;
        }

        public TestPaper.Builder setTheme (String Theme) {
            this.Theme = Theme;
            return this;
        }

        public TestPaper.Builder setTasks (String Tasks) {
            this.Tasks = Tasks;
            return this;
        }

        public TestPaper build(){
            return new TestPaper(this);
        }
    }
}
