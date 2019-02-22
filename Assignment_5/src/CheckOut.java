import java.util.ArrayList;

public class CheckOut {

    public CheckOut(){}

    ArrayList<DessertItem> list = new ArrayList<>();

    DessertShoppe store = new DessertShoppe();

    private  int currentCost = 0;
    private  double currentTax = 0;
    private  double tempTax = 0;
    private  String receipt = "";

    public  int numberOfItems(){
        return list.size();
    }

    public void enterItem(DessertItem dessertItem){
        list.add(dessertItem);
        currentCost += dessertItem.getCost();
        tempTax = dessertItem.getCost() * store.taxRate;
        currentTax += tempTax;

    }

    public void clear(){
        list.clear();
    }

    public int totalCost(){
        return currentCost;
    }

    public double totalTax(){return (int)Math.round(currentTax);}

    public String toString(){
        System.out.println("\n" + "         "+ store.storeName);
        System.out.println("\n" + "       "+"-------------"+"\n");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) instanceof Candy){
                receipt=  list.get(i).name + "           " + list.get(i).getCost()+ "\n" + ((Candy) list.get(i)).weight + "@" + ((Candy) list.get(i)).unitprice + "/lb." + "\n";
            }else if (list.get(i) instanceof Cookies){
                receipt +=  list.get(i).name + "           " + list.get(i).getCost() + "\n" + ((Cookies) list.get(i)).dozen + "@"+ ((Cookies) list.get(i)).unitprice + "/dz." + "\n";
            }else if (list.get(i) instanceof Sundae){
                receipt += list.get(i).name + "           " + list.get(i).getCost() + "\n";
            }else if (list.get(i) instanceof  iceCream){
                receipt += list.get(i).name + "           " + list.get(i).getCost() + "\n";
            }
        }

        return receipt;
    }

}
