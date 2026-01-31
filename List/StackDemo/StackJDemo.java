
import java.util.Stack;

public class StackJDemo{
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> list = new Stack<>();
        // Adding elements to the numbers Stack
        numbers.push(10);
        numbers.push(20);
        numbers.push(30);
        numbers.push(40);
        numbers.push(5);
        System.out.println("Numbers Stack: " + numbers);

        // Accessing an element
        int number = numbers.peek();
        System.out.println("Top element: " + number);

        // Removing an element
        numbers.pop();
        System.out.println("Numbers Stack after pop: " + numbers);

        // Iterating through the numbers Stack
        System.out.println("Iterating through the Numbers Stack:");
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.print("--------------------------------------------------");
        // Adding elements to the list Stack
        list.push("Apple");
        list.push("Banana");
        list.push("Cherry");
        list.push("Amit");
        // create new line
        System.out.println();

        // Displaying the list Stack
        System.out.println("List Stack: " + list);

        // Accessing an element
        String fruit = list.peek();
        System.out.println("Top element: " + fruit);

        // Removing an element
        list.pop();
        System.out.println("List Stack after pop: " + list);

     }
}