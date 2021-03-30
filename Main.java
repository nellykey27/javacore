package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Написать метод, который меняет два элемента массива местами.
//        String[] arr = {"asd", "ds", "ret", "123"};
//        System.out.println(Arrays.toString(arr));
//        swapElements(arr, 1, 3);
//        System.out.println(Arrays.toString(arr));

        Orange orange = new Orange();
        Apple apple = new Apple();
        Orange orange2 = new Orange();
        Box<Orange> orangeBox = new Box<Orange>(new ArrayList<>(Arrays.asList(orange,orange2)) );
        Box<Apple> appleBox = new Box<Apple>(new ArrayList<>(Arrays.asList(apple)));
        float weightOrangeBox = orangeBox.getWeight();
        float weightAppleBox = appleBox.getWeight();
        boolean compareBoxes = appleBox.compareTo(orangeBox);
        System.out.println(compareBoxes);
    }

    private static<T> void swapElements(String[] arr, int index1, int index2) {
        T temp = (T) arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = (String) temp;
    }





}
