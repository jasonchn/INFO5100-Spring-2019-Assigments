public class Sundae extends iceCream {

    int iceCreamPrice;
    int ToppingPrice;
    Sundae(String iceCreamName, int iceCreamPrice, String ToppingName, int ToppingPrice ){

        this.name = ToppingName + "" + iceCreamName;
        this.iceCreamPrice = iceCreamPrice;
        this.ToppingPrice = ToppingPrice;
    }

    public int getCost(){
        return iceCreamPrice + ToppingPrice;
    }
}
