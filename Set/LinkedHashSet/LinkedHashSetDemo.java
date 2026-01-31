package Set.LinkedHashSet;

import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Your code for LinkedHashSetDemo goes here
        // create LinkedList which accepts numbers

        Set<Integer> numbers = new java.util.LinkedHashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        // adding duplicate values
        numbers.add(3); 

        System.out.println("Numbers LinkedHashSet: " + numbers);

        // Remove an element
        numbers.remove(2);  
        System.out.println("After removing 2: " + numbers);
        // Re adding removed element
        numbers.add(2);     
        System.out.println("After re-adding 2: " + numbers);

        // Check if an element exists
        boolean containsThree = numbers.contains(3);    
        System.out.println("Contains 3: " + containsThree);

        // Size of the LinkedHashSet
        int size = numbers.size();  
        System.out.println("Size of LinkedHashSet: " + size);

        // Iterate through the LinkedHashSet
        System.out.print("Iterating through LinkedHashSet: ");  
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
    
}
