# Lab #1 - Creational Design Patterns

### Author: Sorochin Nichita, FAF-191

---

## Introduction

In this laboratory work were implemented creational design patterns, such as:
- ### Builder

>The Builder Pattern is a design pattern that lets you build complex objects step by step using a well-defined sequence of actions. Construction is controlled by the director object, which only needs to know the type of object being created.

![Builder](https://upload.wikimedia.org/wikipedia/ru/2/28/Builder.gif)

- ### Factory

>A factory is a design pattern that helps you solve the problem of creating different objects based on certain conditions.

![Factory](https://i.stack.imgur.com/N3mC1.png)

- ### Prototype

>A prototype is a generative pattern that allows you to copy objects of any complexity without being bound to their specific classes.

![Prototype](https://www.researchgate.net/profile/Hong-Zhu-6/publication/249782671/figure/fig24/AS:298369835651087@1448148320555/Class-Diagram-of-the-Prototype-DP.png)

## Implementation

The patterns were implemented in school environment

The first pattern was implemented is `Builder`:
Classes like `Student`, `Teacher` and `TestPaper` can be created with different number of attributes. For example:
```java
TestPaper testPaper = new TestPaper.Builder(name, ClassID).setTheme(Theme)
                                                          .build();
```
or
```java
TestPaper testPaper = new TestPaper.Builder(name, ClassID).setTheme(Theme)
                                                          .setTasks(Task)
                                                          .build();
```

The next pattern was used is `Factory`:
There is class `Admin` that can create every the most important objects in the project: `Student`, `Teacher` and `SchoolClass`. But the main idea, that there is Interface `Humans` and the factory `Admin` using method `createSchoolStructure()` can create both objects which classes implement interface `Humans`: `Student` and `Teacher`.

```java
    public Humans createSchoolStructure(String typeOfHuman){
        switch (typeOfHuman){
            case "Student" : return new Student.Builder(names[(int) (Math.random()*25)], (int) (Math.random()*999999999) + 10000000 ).build();
            case "Teacher" : return new Teacher.Builder(names[(int) (Math.random()*25)], (int) (Math.random()*999999999) + 10000000).build();
            default: return null;
        }
    }
```

The last, but not least design pattern is `Prototype`:

There is a class called `TestPaper`, which objects should be shared between students. So, the prototype class named `Cash` creates clones of one particular object and can share it to the other classes, it simulates the work of printer.

```java
public class Cash {
    TestPaper testPaper;

    public TestPaper getTestPaper() throws CloneNotSupportedException {
        return testPaper.clone();
    }

    public void setTestPaper(TestPaper testPaper) {
        this.testPaper = testPaper;
    }
}
```

## Results

- ### Factory (Admin) full code

![Result1](https://user-images.githubusercontent.com/6358475/135903838-6301e94b-ddf2-4257-9d40-1fbd68c1eecd.png)

- ### Builder in class Teacher

![Restult2](https://user-images.githubusercontent.com/6358475/135904099-8202d7aa-ac45-478d-807b-f498203335ca.png)

- ### Prototype (Cash) full code

![Result3](https://user-images.githubusercontent.com/6358475/135904280-b315a6bd-c82c-44aa-96e3-31399f9cdf2c.png)

- ### Main file

![Result4](https://user-images.githubusercontent.com/6358475/135904500-f8a1f0bc-71db-4437-ae83-66efddb9bdb3.png)

- ### Partial output in the command line

![Result4](https://user-images.githubusercontent.com/6358475/135905690-c20ae64e-ec9e-438c-8074-2c51c4778c7d.png)

## Conclusions

During this laboratory work there were learned and implemented some Creational Design Patterns. All the mentioned patterns from list of objectives were learned, but because it is difficult to unite them to one concept, there were implemented only three of them.
