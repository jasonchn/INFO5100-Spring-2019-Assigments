public class Cookies extends DessertItem{

    int dozen;
    double unitprice;

    public int getCost(){
        return (int) Math.round(dozen * unitprice * 100);
    }
}