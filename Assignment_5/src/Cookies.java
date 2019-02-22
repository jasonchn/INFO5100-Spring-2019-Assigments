public class Cookies extends DessertItem{

    int dozen;
    double unitprice;

    Cookies(String cookiesName, int dozen, double unitprice){
        this.name = cookiesName;
        this.dozen = dozen;
        this.unitprice = unitprice;
    }

    public int getCost() {
        return (int) Math.round(dozen * unitprice * 100);
    }
}