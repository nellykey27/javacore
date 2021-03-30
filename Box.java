package homework3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruitsList = new ArrayList<>();

    public Box(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public ArrayList<T> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }
   // public boolean sortFruit(Box<T> box) {

   // }
    public boolean compareTo(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }
    public float getWeight() {

        return (fruitsList.size() * fruitsList.get(0).getWeight());
    }
}
