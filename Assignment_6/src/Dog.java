import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable {
    private String size;
    private String startDate;
    private  String endDate;

    public Dog(String name, String ownerName, String color, String size){
        super(name,ownerName,color);
        this.size = size;
    }

    public String getSize(){
        return this.size;
    }
    public  String toString(){
        return "DOG" + "\n" + this.getPetName() + " owned by " + this.getOwnerName() + "\n" + "Color: " + this.getColor() + "\n" + "Sex: " + this.getSex() + "\n" + this.getSize();
    }
    public void setBoardStart(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        this.startDate = sdf.format(new Date(day,month,year));

    }

    public void setBoardEnd(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
        this.endDate = sdf.format(new Date(month,day,year));
    }

    public boolean boarding(int month, int day, int year){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(new Date(day,month,year));
        int compareStart= currentDate.compareTo(this.startDate);
        int compareEnd = currentDate.compareTo(this.endDate);
        if (compareStart >= 0 && compareEnd <= 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static  void main(String[] args){
        Dog marshall = new Dog("Marshall","Jason","White and Black","Big");
        marshall.setSex(1);
        marshall.setBoardStart(01,01,2017);
        marshall.setBoardEnd(01,01,2019);
        System.out.println(marshall);
        System.out.println(marshall.boarding(02,02,2018));
    }
}
