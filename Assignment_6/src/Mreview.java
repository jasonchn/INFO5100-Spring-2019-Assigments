import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {

    private String title;
    private ArrayList<Integer> ratings;

    Mreview(){
        this.title = "";
        this.ratings = new ArrayList<>();

    }

    Mreview(String newTitle){
        this.title = newTitle;
        this.ratings = new ArrayList<>();
    }

    Mreview(String newTitle,int firstRating){
        this.title = newTitle;
        this.ratings = new ArrayList<>(1);
        ratings.add(firstRating);
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public  double aveRating(){
        int ratingSum = 0;
        for (int rt:ratings
             ) {
            ratingSum += rt;
        }
        double aveRating = ratingSum / ratings.size();

        return aveRating;
    }

    public int compareTo(Mreview obj){
        return Integer.compare(1,obj.ratings.get(0));
    }

    public boolean equals(Mreview obj){

        return obj.aveRating() == 1;

    }

    public String getTitle(){
        return this.title;
    }

    public int numRatings(){
        return this.ratings.size();
    }

    public String toString(){
        return this.title + " , average " + this.aveRating()  + " out of " + this.numRatings() + " ratings";
    }


}
