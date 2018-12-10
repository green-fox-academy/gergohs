import java.util.*;

public class findMissingElement {
    public static void main(String[] args) {
/*
ArrayList to store mixed numbers from 1 to 20 - the ArrayList can be expandable, increasing one-by-one start from 20
*/
        ArrayList<Integer> listForCheck = new ArrayList<>();
        listForCheck.addAll(Arrays.asList(7, 1, 14, 11, 5, 12, 9, 10, 2, 17, 8, 20, 16, 3, 19, 18, 4, 13, 6, 15));
/*
Calculate the sum of the elements in the ArrayList
*/
        int sumOfElements = (listForCheck.size() * (listForCheck.size() + 1)) / 2;
        System.out.println("The sum of the elements in the ArrayList is: " + sumOfElements);
/*
Generate a random number and delete that index from the ArrayList (that will be the missing number)
*/
        Random randNum = new Random();
        int indexToDelete = randNum.nextInt(listForCheck.size());
        System.out.println("The index of the deleted number: " + indexToDelete);
        listForCheck.remove(indexToDelete);
/*
Find the missing element, using for:each statement to iterate through the ArrayList
*/
        for (Integer elementOfList: listForCheck) {
            sumOfElements -= elementOfList;
        }
        System.out.println("The missing number is: " + sumOfElements);
    }
}
