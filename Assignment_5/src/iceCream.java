public class iceCream extends DessertItem{


    double iceCreamPrice;
    int amount;

    iceCream(){};

    iceCream(String iceCreamName, double price, int amount){
        this.name = iceCreamName;
        this.iceCreamPrice = price;
        this.amount = amount;
    }


    public int getCost(){


        return (int)Math.round(iceCreamPrice * amount * 100);
    }
}
