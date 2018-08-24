package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        this.numberOfStrings=4;
        this.name = "Violin";
    }

    public Violin(int string){
        this.numberOfStrings=string;
        this.name = "Violin";
    }

    public void sound (){
        System.out.println(name + ", a " + numberOfStrings+ "-stringed instrument that goes Screech.");
    }
}
