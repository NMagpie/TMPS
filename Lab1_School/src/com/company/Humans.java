package com.company;

public interface Humans {
    int getId();
    String getName();
    int getPhone();
    void getHuman();
    int getClassID();
    TestPaper createTestPaper(String Theme,String Task);
    void setTestPaper(TestPaper testPaper1);
}
