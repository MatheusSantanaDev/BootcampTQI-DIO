package CollectionsFramework.Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleOne {
    public static void main(String[] args) {
        System.out.println("Create a set and add notes: ");
        Set<Double> notes = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0.0, 3.6));

        System.out.println(notes.toString());

        System.out.println("\nCheck if the 5.0 note is in the set: " + notes.contains(5d));

        System.out.println("\nDisplay the lowest note: " + Collections.min(notes));
        System.out.println("Display the highest note: " + Collections.max(notes));

        
        Iterator<Double> iterator = notes.iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }
        System.out.println("\nDisplay the sum of values: " + sum);
        System.out.println("Display the average of notes: " + (sum/notes.size()));

        System.out.println("\nRemove the note 0: ");
        notes.remove(0d);
        System.out.println(notes);

        System.out.println("\nRemove all notes lowest than 7 and display the list: ");
        Iterator<Double> iterator1 = notes.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notes);

        System.out.println("\nDisplay all notes in the order they were entered: ");
        Set<Double> notes2 = new LinkedHashSet<>();
        notes2.add(7d);
        notes2.add(8.5);
        notes2.add(9.3);
        notes2.add(5d);
        notes2.add(7d);
        notes2.add(0d);
        notes2.add(3.6);
        System.out.println(notes2);

        System.out.println("\nDisplay all notes in ascending order: ");
        Set<Double> notes3 = new TreeSet<>(notes2);
        System.out.println(notes3);

        System.out.println("\nDelete a set");
        notes.clear();

        System.out.println("Check if the set is empty: " + notes.isEmpty());
        System.out.println("Check if the set 2 is empty: " + notes2.isEmpty());
        System.out.println("Check if the set 3 is empty: " + notes3.isEmpty());
    }
}
