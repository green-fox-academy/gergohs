package SharpiePackage;

import java.util.ArrayList;

public class SharpieSet {

    ArrayList<Sharpie> sharpieList;

    public SharpieSet() {
        this.sharpieList = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {

        sharpieList.add(sharpie);

    }

    @Override
    public String toString() {

        StringBuilder tempList = new StringBuilder();

        for (Sharpie sharpieName : sharpieList) {
            tempList.append(sharpieName.toString());
            tempList.append("\n");
        }

        return tempList.toString();
    }

    public int countable() {

        int counter = 0;

        for (Sharpie sharpie : sharpieList) {
            if (sharpie.inkAmount != 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {

        for (int i = 0; i < sharpieList.size(); i++) {

            if (sharpieList.get(i).inkAmount == 0) {
                sharpieList.remove(i);
            }
        }
    }

}

