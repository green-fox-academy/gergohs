package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        this.numberOfStrings = 6;
        this.name = "ElectricGuitar";
    }

    public ElectricGuitar(int strings){
        this.numberOfStrings=strings;
        this.name = "ElectricGuitar";
    }

    public void sound (){
        System.out.println(name + ", a " + numberOfStrings+ "-stringed instrument that goes Twangg.");
    }
}
