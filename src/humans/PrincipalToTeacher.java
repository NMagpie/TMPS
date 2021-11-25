package humans;

public class PrincipalToTeacher extends Teacher {

    private Principal schoolAdmin;

    public PrincipalToTeacher(Principal schoolAdmin) {
        super(new Teacher.Builder()
                .setName(schoolAdmin.getNames()[(int) (Math.random()*25)])
                .setPhone((int) (Math.random()*999999999) + 10000000));

        this.schoolAdmin = schoolAdmin;
    }

    @Override
    public void action() {
        super.action();
        System.out.print("Teacher " + super.getName() + ": \"But also I'm a principal!\"");
        System.out.println();
    }
}