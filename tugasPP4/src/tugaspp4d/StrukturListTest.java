package tugaspp4d;

import java.util.LinkedList;
import java.util.List;

public class StrukturListTest {

    public static void main(String[] args) {
        // Create a new LinkedList
        List<Integer> list = new LinkedList<>();

        // Add elements to the list
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);

        // Display the elements of the list
        System.out.println("Initial list: " + list);

        // Remove the last element of the list
        list.remove(list.size() - 1);

        // Display the elements of the list
        System.out.println("List after removing the last element: " + list);

        // Remove the first element of the list
        list.remove(0);

        // Display the elements of the list
        System.out.println("List after removing the first element: " + list);

        // Add more instructions here to remove elements from the end of the list
        // For example, to remove the last element:
        list.remove(list.size() - 1);

        // Display the elements of the list
        System.out.println("List after removing the last element again: " + list);
    }
}