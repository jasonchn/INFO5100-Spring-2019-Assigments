public class Mood_Test {
    public static  void main(String[] args){

        Moody sad = new Sad();
        Moody happy = new Happy();
        Psychiatrist doctor = new Psychiatrist();

        doctor.examine(sad);
        doctor.observation(sad);
        doctor.examine(happy);
        doctor.observation(happy);
    }
}
