package com.company;

public class Cash {
    TestPaper testPaper;

    public TestPaper getTestPaper() throws CloneNotSupportedException {
        return testPaper.clone();
    }

    public void setTestPaper(TestPaper testPaper) {
        this.testPaper = testPaper;
    }
}
