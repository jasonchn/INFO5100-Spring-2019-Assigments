public class Sundae extends iceCream {


    int ToppingPrice = 1;
    Sundae(String iceCreamName, int iceCreamPrice, String ToppingName){

        this.name = ToppingName + "\n" + iceCreamName;
        this.iceCreamPrice = iceCreamPrice;

    }

    public int getCost(){
        return (int) Math.round(iceCreamPrice + ToppingPrice);
    }
}
