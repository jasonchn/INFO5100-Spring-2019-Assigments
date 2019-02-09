public class Course {
    private  String name;
    private int numberOfStudent = 0;
    private String[] students = new String[10];
    private int i = 0;

    public Course(String name){
        this.name = name;
    }
    public String[] getStudents(){
        return this.students;
    }

    public boolean isFull(){
        if (numberOfStudent == 10){
            return true;
        }else{
            return false;
        }
    }
    public void registerStudent(Student student){

        if (numberOfStudent < 10) {
            students[i] = student.getName();
            i++;
            numberOfStudent++;
        }
    }

}
