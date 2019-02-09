public class Psychiatrist {

    public void examine(Moody mood) {
        System.out.println("What are you feeling today?");

        mood.queryMood();
        mood.expressFeelings();

    }

    public void observation(Moody mood){

        System.out.println("Observation:"  + " " +   mood.toString());
    }
}
