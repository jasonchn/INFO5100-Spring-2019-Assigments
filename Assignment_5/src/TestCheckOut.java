public class TestCheckOut {

    public static  void main(String args[]){

        CheckOut checkout = new CheckOut();
        checkout.enterItem(new Candy("Colorful Bear",2.22,1.23));
        checkout.enterItem(new Cookies("Chocolate Cookies", 4, 5.65));
        checkout.enterItem(new Sundae("Twister Icecream",3.33,"Sprinkles"));
        checkout.enterItem(new iceCream("Yi Li",6.66,2));

        System.out.println("\nNumber of items" + "    "+ checkout.numberOfItems() + "\n");
        System.out.println("\nTotal Cost" + "    " + checkout.totalCost() + "\n");
        System.out.println("\nTotal Tax" + "    "  + checkout.totalTax() + "\n");
        System.out.println(checkout);
        checkout.clear();
        System.out.println(checkout);

    }
}
