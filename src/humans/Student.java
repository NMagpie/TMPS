package humans;

import paper.TestPaper;

public class Student implements Humans {
    private String name;
    private final int phone;
    private final int id = count++;
    private int ClassID;
    private TestPaper testPaper;
    private TaskChat chat;

    private static int count = 0;

    private Student (Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.ClassID = builder.ClassID;
        this.testPaper = builder.testPaper;
        this.chat = builder.chat;
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

    @Override
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
        System.out.print("Student ID: " + id + "\nName: " + name + "\nPhone: " + phone);
        if (ClassID != -1)
            System.out.print("\nClassID: " + ClassID);
        if (testPaper != null)
            System.out.print("\nTestID: " + testPaper.getId());
        System.out.println("\n");
    }

    @Override
    public void action() {
        System.out.println("Student " + name + ": \"I'm studying!\"");
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Student " + name + " - " + "Solution:" + message);
    }

    static class Builder {
        private String name;
        private int phone;
        private int ClassID = -1;
        private  TestPaper testPaper = null;
        private TaskChat chat = null;

        public Builder (){
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public Builder setClassID (int classID) {
            this.ClassID = classID;
            return this;
        }

        public Builder setTestPaper (TestPaper testPaper) {
            this.testPaper = testPaper;
            return this;
        }

        public Builder setChat (TaskChat chat) {
            this.chat = chat;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
