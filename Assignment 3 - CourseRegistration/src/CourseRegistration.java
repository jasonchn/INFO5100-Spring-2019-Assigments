public class CourseRegistration {

    public static  void main (String[] args){
        Student Jason = new Student("Jason",1);
        Course INFO5100 = new Course("Appllication Development");

        INFO5100.registerStudent(Jason);

        for (int i =0; i < INFO5100.getStudents().length; i++){
            if (INFO5100.getStudents()[i] != null) {
                System.out.println(INFO5100.getStudents()[i]);
            }
        }

        System.out.println(INFO5100.isFull());


    }
}
