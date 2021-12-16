# TMPS Laboratory works

## Navigation

- [Lab #1](#lab-1)
- [Lab #2](#lab-2)
- [Lab #3](#lab-3)

# Lab 1 
# Creational Design Patterns

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

- ### main file

![Result4](https://user-images.githubusercontent.com/6358475/135904500-f8a1f0bc-71db-4437-ae83-66efddb9bdb3.png)

- ### Partial output in the command line

![Result4](https://user-images.githubusercontent.com/6358475/135905690-c20ae64e-ec9e-438c-8074-2c51c4778c7d.png)

## Conclusions

During this laboratory work there were learned and implemented some Creational Design Patterns. All the mentioned patterns from list of objectives were learned, but because it is difficult to unite them to one concept, there were implemented only three of them.

## [Back To Title](#tmps-laboratory-works)

# Lab 2
# Structural Design Patterns

### Author: Sorochin Nichita, FAF-191

---

## Introduction

In this laboratory work were implemented structural design patterns, such as:
- ### Bridge

>The Bridge pattern is a structural design pattern used in software design to "separate abstraction and implementation so that they can change independently."

![Bridge](https://upload.wikimedia.org/wikipedia/ru/8/81/Bridgeuml.gif)

- ### Facade

>The Facade is a structural design pattern that allows you to hide the complexity of a system by reducing all possible external calls to a single object that delegates them to the corresponding objects in the system.

![Facade](https://upload.wikimedia.org/wikipedia/ru/2/2f/Facade.gif)

- ### Adapter

>The Adapter is a structural design pattern designed to organize the use of functions of an object that is not available for modification through a specially created interface.

![Adapter](https://upload.wikimedia.org/wikipedia/ru/thumb/0/04/Adapter_pattern.svg/941px-Adapter_pattern.svg.png)

## Implementation

The first pattern was implemented is `Bridge`:
Classes like `Student`, `Teacher` and `TestPaper` can be created with different number of attributes. 
There is Abstract Class `Device` that has basic implementation of methods for devices people use daily. There is also Class `Projector`, device to project the computer screen to a larger area, and also it extends `Device`. In addition there is `Remote` Class; this is regular remote control for devices, so a person can control device not touching it at all, only interacting with remote control. For example:
```java
        Projector projector = new Projector();
        Remote remote = new Remote(projector);
        remote.turnOn(); //turns on the projector on which remote is connected
        remote.turnOff(); //turns on the projector on which remote is connected
```

The next pattern was used is `Facade`:
If user doesn't want to interact with all the classes are used in the project, there is some basic actions he can perform using the `School` Class.

```java
        School school = new School();
        school.setSchoolName("Lakewood High School");
        school.createClass(14);
        school.turnOnClassProjector(0);
        school.createClassTest(2, theme, task);
```

The last design pattern is `Adapter`:
There is a Class called `PrincipalToTeacher` which, if it is needed can turn the `Principal` of the School into the `Teacher` and act like a teacher with some additional features.

```java
        school.setPrincipalInClass(1);
        school.teacherAction(1); //acts like a teacher, with some additions
```

## Results

- ### Bridge (Device, Projector, Remote) full code

![bridge1](https://user-images.githubusercontent.com/6358475/143413670-8d9a206c-b689-43f2-b7ac-245d91b9adfe.PNG)

![bridge2](https://user-images.githubusercontent.com/6358475/143413778-e366e308-f2ef-4a34-9816-6b2f9058e58a.PNG)

![bridge3](https://user-images.githubusercontent.com/6358475/143413811-2c837bb6-54a4-4f47-949a-bd307baa86e6.PNG)

- ### Bridge (Remote) in action

![remoteAction](https://user-images.githubusercontent.com/6358475/143414356-4fc86f04-6c86-4631-bba9-d3d0a82c4272.PNG)

- ### School (Facade) code snippet

![school](https://user-images.githubusercontent.com/6358475/143414558-1b4affbe-1c2e-47d1-a13c-69cfed262949.PNG)

- ### PrincipalToTeacher (Adapter) full code

![adapter](https://user-images.githubusercontent.com/6358475/143416325-d3b1ab87-256c-42d1-92d8-10494b240896.PNG)

- ### Partial output in the command line

![output](https://user-images.githubusercontent.com/6358475/143415079-f3e089a1-6b2e-4258-bd62-5f1e8d5ae4b1.PNG)

## Conclusions

During this laboratory work there were learned and implemented some Structural Design Patterns. All the mentioned patterns from list of objectives were learned, but because it is difficult to unite them to one concept, there were implemented only three of them.

## [Back To Title](#tmps-laboratory-works)

# Lab 3
# Behavioral Design Patterns

### Author: Sorochin Nichita, FAF-191

---

## Introduction

In this laboratory work were implemented behavioral design patterns, such as:
- ### Mediator

>Mediator helps in establishing loosely coupled communication between objects and helps in reducing the direct references to each other.

![Mediator](https://res.cloudinary.com/practicaldev/image/fetch/s--STSJODRv--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_66%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/i/sc4u7pmnldso23p9slio.gif)

- ### Iterator

>An iterator design pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

![Iterator](https://russianblogs.com/images/736/cdc1fd6961e2d251725bc9fc3cf53000.gif)

## Implementation

The first pattern which was implemented is `Mediator`:

For the Mediator pattern, it was created `Chat` Interface and the class which implements its: `Task Chat`.

Additionally,  I have used a teacher and a student being the users of that chat.
In order to create that chat, get and send methods where added in the `Humans` interface, which is implemented by `Student` and `Teachers` classes.
The get and send methods where overridden in the `Teacher` and `Student` classes, in order to achieve that.

Only the students and teachers who are present in the class, have access to their personal chat. For this reason, I added the chat in `Builder` class.
When the class is created, only one unique chat is added for all the persons present in that class. If teacher sends the message, it will be received by all the students.
Moreover, the teacher is able to get all the messages which are sent individually by the students.

The next pattern which was used is `Iterator`:

This is the pattern I used to make successive rounds of all students in the same class. Consequently, it was created `Iterator` and `Collection` interface, which is implemented by `StudentIterator` and `SchoolClass`.

```java
schoolClass.getTeacher().sendMessage("№1\n2+2=_\n№2 \n2*2=_");

Iterator iterator = schoolClass.getIterator();
while (iterator.hasNext()){
    Student student = (Student) iterator.next();
    student.sendMessage("№1 4 №2 4");
}
```

## Results

- ### Mediator (Chat, TaskChat) full code
```java
package humans;

public interface Chat {
    public void sendMessage(String message, Humans human);
}
```

```java
package humans;

public class TaskChat implements Chat{
    SchoolClass schoolClass;

    public TaskChat(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public void sendMessage(String message, Humans human) {
        if (human.equals(schoolClass.getTeacher())){
            for (Humans student: schoolClass.getStudents()){
                student.getMessage(message);
            }
            return;
        }
        if(schoolClass.getStudents().contains(human)){
            schoolClass.getTeacher().getMessage(message);
            return;
        }
    }
}
```

- ### Mediator (set and get method) 

```java
@Override
public void sendMessage(String message) {
    chat.sendMessage(message,this);
}

@Override
public void getMessage(String message) {
    System.out.println("Student " + name + " - " + "Solution:" + message);
}
```

- ### Mediator (Method createClass after changing)

```java
public SchoolClass createClass (int numberOfStudents){

        SchoolClass schoolClass = new SchoolClass();

        schoolClass.setTeacher(new Teacher.Builder()
                .setName(names[(int) (Math.random()*25)])
                .setPhone((int) (Math.random()*999999999) + 10000000)
                .setClassID(schoolClass.getId())
                .setChat(schoolClass.getChat())
                .build());

        for (int i = 0; i < numberOfStudents; i++)
            schoolClass.addStudent(new Student.Builder()
                    .setName(names[(int) (Math.random()*25)])
                    .setPhone((int) (Math.random()*999999999) + 10000000)
                    .setClassID(schoolClass.getId())
                    .setChat(schoolClass.getChat())
                    .build());

        students.addAll(schoolClass.getStudents());
        teachers.add(schoolClass.getTeacher());

        return schoolClass;
    }
```

- ### Iterator (Iterator, Collection, StudentIterator) full code

```java
public interface Iterator {
    public boolean hasNext();
    public Humans next();
}
```
```java
public interface Collection {
    Iterator getIterator();
}
```
```java
private class StudentIterator implements Iterator
{
    int index;

    @Override
    public boolean hasNext() {
        if (index < students.size()) return true;
        return false;
    }

    @Override
    public Humans next() {
        return students.get(index++);
    }
}
```
- ### Iterator (Override method in SchoolClass) 
```java
 @Override
public Iterator getIterator() {
    return new StudentIterator();
}
```
- ### Partial output in the command line

![output](https://sun9-83.userapi.com/impg/MNUy3Lq3eSsui-KQL0zIqhaIBQ2yxPBg-GVFrg/ey21ENmBd7c.jpg?size=435x548&quality=96&sign=8a2e8bada66c94b8b3df2e82363b4cce&type=album)
![output](https://sun9-50.userapi.com/impg/l4NHKdKx-iLPGCpvJKw855ykODrXIl_s6s0wiQ/MxlD_WzcTm8.jpg?size=483x336&quality=96&sign=057e21a1dc80d98e2f9b23b5d336f3ab&type=album)
## Conclusions

During this laboratory work there were learned and implemented some Structural Design Patterns.

## [Back To Title](#tmps-laboratory-works)
