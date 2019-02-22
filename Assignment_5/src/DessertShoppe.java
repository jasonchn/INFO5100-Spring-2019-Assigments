public class DessertShoppe {

    public final double taxRate = 0.1;
    public final String storeName = "DessertKing";

    public String cent2DollarsAndCents (int cents){

        float result = (float )cents  / 100;
        return result + "";
    }

}
