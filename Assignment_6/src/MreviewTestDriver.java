public class MreviewTestDriver {

    public static  void main(String[] args){

        Mreview killBill = new Mreview("Kill Bill");

        killBill.addRating(3);
        killBill.addRating(2);
        killBill.addRating(5);

        System.out.print("The average rating of "+ killBill.getTitle()+ " is " + killBill.aveRating());
        System.out.print("\n");
        System.out.print(killBill);
    }
}
