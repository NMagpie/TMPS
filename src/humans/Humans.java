package humans;

import paper.TestPaper;

public interface Humans {

    int getId();

    String getName();

    int getPhone();

    void getHuman();

    int getClassID();

    TestPaper getTestPaper();

    TestPaper createTestPaper(String Theme, String Task);

    void setTestPaper(TestPaper testPaper1);

    void action();

    public void sendMessage(String message);

    public void getMessage(String message);
}
