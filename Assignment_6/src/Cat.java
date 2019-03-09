import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet implements Boardable {

    private  String hairLength;
    private String startDate;
    private  String endDate;

    public Cat(String name, String ownerName, String color, String hairLength){
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength(){
        return this.hairLength;
    }

    public  String toString(){
        return "CAT" + "\n" + this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color: " + this.getColor() + "\n" + "Sex: " + this.getSex() + "\n" + this.getHairLength();
    }
    public void setBoardStart(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        this.startDate = sdf.format(new Date(day,month,year));

    }

    public void setBoardEnd(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        this.endDate = sdf.format(new Date(day,month,year));
    }

    public boolean boarding(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
        String currentDate = sdf.format(new Date(month,day,year));
        int compareStart= currentDate.compareTo(this.startDate);
        int compareEnd = currentDate.compareTo(this.endDate);
        if (compareStart <= 0 && compareEnd >= 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static  void main(String[] args){
        Cat garfield = new Cat("Garfield","John","Yellow","Short");
        garfield.setSex(0);
        System.out.println(garfield);
        garfield.setBoardStart(1,01,2017);
        garfield.setBoardEnd(1,01,2019);
        System.out.println(garfield.boarding(2,02,2018));
    }

}
