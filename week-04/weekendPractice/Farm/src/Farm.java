//          Farm
//          Reuse your Animal class
//          Create a Farm class
//          it has list of Animals
//          it has slots which defines the number of free places for animals
//          breed() -> creates a new animal if there's place for it
//          slaughter() -> removes the least hungry animal

import com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    ArrayList<Animal> animalList = new ArrayList<>();
    int slot;

    public void breed() {
        if (this.slot >= 0) {
            Animal newAnimal = new Animal(20, 20);
        }
    }

    public void slaughter() {
        int temp = 0;
        int index = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).hunger > temp) {
            }
            temp = animalList.get(i).hunger;
            index = i;
        }
        animalList.remove(index);
    }

}

