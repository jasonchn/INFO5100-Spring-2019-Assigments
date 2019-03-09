public class Pet {

    private String petName;
    private  String ownerName;
    private  String color;
    protected  int sex;

    public Pet(String name, String ownerName, String color){
        this.petName = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    String getPetName(){
        return this.petName;
    }
    String getOwnerName(){
        return this.ownerName;
    }
    String getColor(){
        return this.color;
    }
    void setSex(int sexid){
        sex = sexid;
    }

    public String getSex(){

        String tempsex;
        if (this.sex == 0){
            tempsex =  "MALE";
        }else if (this.sex == 1){
            tempsex = "FEMALE";
        }else if (this.sex == 2){
            tempsex =  "SPAYED";
        }else{
            tempsex =  "NEUTERED";
        }

        return tempsex;

    }

    public String toString(){
        return this.petName + " owned by " + this.ownerName + "\n" + "Color: " + this.color + "\n" + "Sex: " + this.getSex();
    }


}
