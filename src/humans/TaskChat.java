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
