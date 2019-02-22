
public class Candy extends DessertItem{

    double weight;
    double unitprice;

    Candy(String candyName, double weight, double unitprice){

        this.name = candyName;
        this.weight = weight;
        this.unitprice = unitprice;
    }
    public int getCost(){
        return (int) Math.round(unitprice * weight * 100);
    }



}