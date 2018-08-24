package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        this.numberOfStrings = 4;
        this.name = "BassGuitar";
    }

    public BassGuitar(int string) {
        this.numberOfStrings=string;
        this.name = "BassGuitar";
    }

    public void sound (){
        System.out.println(name + ", a " + numberOfStrings+ "-stringed instrument that goes Duum-duum-duum.");
    }
}
