public abstract  class Moody {

    protected abstract  String getMood();
    protected  abstract  void expressFeelings();

    public void queryMood(){
        if (getMood() == "happy") {
            System.out.println("I feel happy today");
        }else if (getMood() == "sad"){
            System.out.println("I feel sad today");
        }
    }

}

class Sad extends  Moody{
    protected  String getMood(){
        return "sad";
    }

    public void expressFeelings(){
        System.out.println("Weep.................");
    }

    public String toString(){
        return "Subject cries a lot";
    }

}

class Happy extends  Moody{
    protected  String getMood(){
        return "happy";
    }

    public void expressFeelings(){
        System.out.println("Hahaha.................");
    }

    public String toString(){
        return "Subject laughs a lot";
    }

}
