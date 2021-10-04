package com.company;

public class Admin {
    private final String[] names = new String[]{"John", "Monkey", "Li", "Dinara", "Artem", "Elina", "Liam", "Olivia", "Noah", "Emma", "Oliver","Ava", "William", "Sophia", "Elijah", "Isabella", "James", "Charlotte", "Benjamin", "Amelia", "Lucas", "Mia", "Mason", "Harper", "Ethan", "Evelyn"};

    public Humans createSchoolStructure(String typeOfHuman){
        switch (typeOfHuman){
            case "Student" : return new Student.Builder(names[(int) (Math.random()*25)], (int) (Math.random()*999999999) + 10000000 ).build();
            case "Teacher" : return new Teacher.Builder(names[(int) (Math.random()*25)], (int) (Math.random()*999999999) + 10000000).build();
            default: return null;
        }
    }

    public SchoolClass createClass (int numberOfStudents){
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.setTeacher(new Teacher.Builder(names[(int) (Math.random()*25)], (int) (Math.random()*999999999) + 10000000)
                .setClassID(schoolClass.getId())
                .build());

        for (int i = 0; i < numberOfStudents; i++) {
            schoolClass.addStudent(new Student.Builder(names[(int) (Math.random()*25)], (int) (Math.random()*999999999) + 10000000 )
                    .setClassID(schoolClass.getId())
                    .build());
        }
        return schoolClass;
    }
}
