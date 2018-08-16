public class Sharpie {

    String color;
    float width;
    int inkAmount;


    public  Sharpie(){
        inkAmount = 100;
    }

    public void use () {
        inkAmount--;
    }
}
