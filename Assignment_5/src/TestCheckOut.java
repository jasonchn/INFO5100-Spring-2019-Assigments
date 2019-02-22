public class TestCheckOut {

    public static  void main(String args[]){

        CheckOut checkout = new CheckOut();
        checkout.enterItem(new Candy("Colorful Bear",2.22,1.23));
        System.out.println("\nNumber of items" + checkout.numberOfItems() + "\n");
        System.out.println("\nTotal Cost");
    }
}
