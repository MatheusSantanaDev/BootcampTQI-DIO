package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleTwo {
    public static void main(String[] args) {
       
        List<Cat> myCats = new ArrayList<>();
        myCats.add(new Cat("Kitty", 3, "Black"));
        myCats.add(new Cat("Leona", 72, "White"));
        myCats.add(new Cat("Kitty", 12, "Brindle"));
        
            
        System.out.println("--\tInsertion order\t--");
        System.out.println(myCats);
        
        System.out.println("--\tRandom order\t--");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("--\tNatural order(Name)\t--");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("--\tAge order\t--");
        Collections.sort(myCats, new ComparatorYear());
        //myCats.sort(new ComparetorYear());
        System.out.println(myCats);

        System.out.println("--\tCollor order\t--");
        myCats.sort(new ComparatorCollor());
        System.out.println(myCats);
    }
}

class Cat implements Comparable<Cat>{
    private String name;
    private Integer year;
    private String collor;

    public Cat(String name, Integer year, String collor) {
        this.name = name;
        this.year = year;
        this.collor = collor;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getCollor() {
        return collor;
    }

    public String toString(){
        return "{" + "name='" + name + "'" + ", year=" + year +", collor='" + collor + "'}";
    }

    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());        
    }
}

class ComparatorYear implements Comparator<Cat>{
    public int compare(Cat c1, Cat c2) {
        return Integer.compare(c1.getYear(), c2.getYear());
    }
}

class ComparatorCollor implements Comparator<Cat>{
    public int compare(Cat c1, Cat c2) {
        return c1.getCollor().compareToIgnoreCase(c2.getCollor()); 
    } 
}