package Set.HashSet;

import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a HashSet
        Set<Character> Letters = new java.util.HashSet<>();
        // check if set is empty
        System.out.println("Is Letters set empty? " + Letters.isEmpty());
        // add elements if not present
        if (Letters.isEmpty()) {
            Letters.add('A');
            Letters.add('B');
            Letters.add('C');
        }

        // add duplicate element
        Letters.add('A'); // This will not be added again
        // insertion order is not preserved
        // add 2 more elements
        Letters.add('D');
        Letters.add('E');
        System.out.println("Letters HashSet: " + Letters);

        // Remove an element
        Letters.remove('C');
        System.out.println("After removing 'C': " + Letters);

        // Check if an element exists
        boolean hasB = Letters.contains('B');
        System.out.println("Contains 'B': " + hasB);
        // Get size of the set
        System.out.println("Size of Letters set: " + Letters.size());

        // update an element - not applicable for HashSet
        // HashSet does not support updating elements directly. You would need to remove and re-add the element.
        Letters.remove('B');
        Letters.add('B');
        System.out.println("After updating 'B': " + Letters);
        

    }

}