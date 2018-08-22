package SharpiePackage;

public class Sharpie {

    String color;
    float width;
    int inkAmount;


    public Sharpie(String color, float width, int inkAmount) {
        this.inkAmount = inkAmount;
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmount--;
    }

    @Override
    public String toString (){
        return  "inkAmount: " + inkAmount + " color: " + color + " width: " + width;
    }
}
