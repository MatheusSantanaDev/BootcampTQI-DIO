package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class ExampleOne {
   public static void main(String[] args) {
    
    System.out.println("Create a list and add the seven notes: ");
    ArrayList<Double> notes = new ArrayList<>(); 
    notes.add(7.0);
    notes.add(3.2);
    notes.add(7.9);
    notes.add(1.1);
    notes.add(4.6);
    notes.add(5d);
    notes.add(3.6);
    
    System.out.println(notes.toString());

    System.out.println("\nDisplay the position of note 5.0: " + notes.indexOf(5d));
    notes.add(4, 8d);
    System.out.println(notes);

    System.out.println("\nChange the note 5.0 for note 6.0: ");
    notes.set(notes.indexOf(5d), 6.0);
    System.out.println(notes);

    System.out.println("\nCheck if the note 5.0 are on the list: " + notes.contains(5d));

    /*System.out.println("Display all notes in the order they were entered: ");
    for (Double note: notes)
        System.out.println(note);
    */ 

    System.out.println("\nDisplay the third added note: " + notes.get(2));
    System.out.println(notes.toString());

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

    System.out.println("\nRemove the note of position 0: ");
    notes.remove(0);
    System.out.println(notes);

    System.out.println("\nRemove the notes lowet that 7 and display the list: ");
    Iterator<Double> iterator1 = notes.iterator();
    while(iterator1.hasNext()){
        Double next = iterator1.next();
        if(next < 7)
            iterator1.remove();
    }
    System.out.println(notes);
    }
}
