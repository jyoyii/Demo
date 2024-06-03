import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");

        // Display the ArrayList before removal
        System.out.println("ArrayList before removal: " + list);

        // Remove the first occurrence of "Apple" from the ArrayList
        boolean removed = list.remove("Apple");

        // Check if "Apple" was removed successfully
        if (removed) {
            System.out.println("First occurrence of 'Apple' removed successfully.");
        } else {
            System.out.println("Element 'Apple' not found in the ArrayList.");
        }

        // Display the ArrayList after removal
        System.out.println("ArrayList after removal: " + list);
    }
}
