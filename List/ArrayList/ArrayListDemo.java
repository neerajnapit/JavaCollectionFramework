import java.util.ArrayList;
class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Amit");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + list);

        // Accessing an element
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Removing an element
        list.remove("Banana");
        System.out.println("ArrayList after removal: " + list);

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }

    }
}