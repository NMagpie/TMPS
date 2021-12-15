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
<<<<<<< HEAD

    public void sendMessage(String message);

    public void getMessage(String message);
=======
>>>>>>> 9a42c31eeaa4e7699b9ee94fa135f451e90a1664
}
