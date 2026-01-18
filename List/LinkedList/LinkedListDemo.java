import java.util.LinkedList;
class LinkedListJava    {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();
        // Adding elements to the numbers LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Numbers LinkedList: " + numbers);

        // Accessing an element
        int number = numbers.get(1);
        System.out.println("Element at index 1: " + number);

        // Removing an element
        numbers.remove(Integer.valueOf(20));
        System.out.println("Numbers LinkedList after removal: " + numbers);

        // Updating an element
        numbers.set(1, 40);
        System.out.println("Numbers LinkedList after update: " + numbers);

        // Iterating through the numbers LinkedList
        System.out.println("Iterating through the Numbers LinkedList:");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.print("--------------------------------------------------");
        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Amit");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + list);

        // Accessing an element
        String fruit = list.get(1);
        System.out.println("Element at index 1: " + fruit);

        // Removing an element
        list.remove("Banana");
        System.out.println("LinkedList after removal: " + list);

        // Updating an element
        list.set(1, "Date");
        System.out.println("LinkedList after update: " + list);

        // Iterating through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String item : list) {
            System.out.println(item);
        }

    }
}