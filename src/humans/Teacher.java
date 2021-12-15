package humans;

import paper.TestPaper;

public class Teacher implements Humans {
    private String name;
    private int phone;
    private final int id = count++;
    private int ClassID;
    private TestPaper testPaper;
    private TaskChat chat;

    private static int count = 0;

    protected Teacher (Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.ClassID = builder.ClassID;
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

    public void getHuman() {
        System.out.print("\nTeacher ID: " + id + "\nName: " + name + "\nPhone: " + phone);
        if (ClassID != -1)
        System.out.print("\nClassID:" + ClassID);
        System.out.println();
    }

    public TestPaper createTestPaper (String Theme, String Task){
        this.testPaper = new TestPaper.Builder(name, ClassID).setTheme(Theme).setTasks(Task).build();
        return testPaper;
    }

    public TestPaper getTestPaper() {
        return testPaper;
    }

    @Override
    public void setTestPaper(TestPaper testPaper) {
    }

    @Override
    public void action() {
        System.out.println("Teacher " + name + ": \"I'm teaching!\"");
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message,this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Teacher " + name + " - " + "Homework: " + message);
    }

    static class Builder {
        private String name;
        private int phone;
        private int ClassID = -1;
        private TaskChat chat = null;

        public Builder (){
        }

        public Builder setChat (TaskChat chat) {
            this.chat = chat;
            return this;
        }

        public Builder setClassID(int classID) {
            this.ClassID = classID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhone(int phone) {
            this.phone = phone;
            return this;
        }

        public Teacher build(){
           return new Teacher(this);
        }
    }
}
