package tugaspp4b;



import java.util.LinkedList;
import java.util.List;



public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list with keyword new
        List<Integer> list = new LinkedList<>();

        // 2. Add elements so that the list contains (2, 6, 3, 5, 1)
        list.add(2);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(1);

        // 2635
        System.out.println(list);

        // 3. Display the elements of the list: 6 3 5
        System.out.println(list.subList(1, 4));

        // 4. Remove the last element from the list
        list.remove(list.size() - 1);

        // 5. Display the elements of the list
        System.out.println(list);

        // 6. Remove the first element from the list
        list.remove(0);

        // 7. Display the elements of the list
        System.out.println(list);

        // Add more instructions to remove the last element from the list
        list.remove(list.size() - 1);

        // Output: 6 3
        System.out.println(list);
    }

}