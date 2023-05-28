package CollectionsFramework.Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class ExampleOne {
    public static void main(String[] args) {
        System.out.println(" ");
        Map<String, Double> car = new HashMap<>();
        car.put("Gol", 14.4);
        car.put("Uno", 15.6);
        car.put("Celta", 16.1);
        car.put("HB20", 14.5);
        car.put("Kwid", 15.6);
        System.out.println(car.toString());

        System.out.println("\nReplace Gol consumption with 15.2km/L: ");
        car.put("Gol", 15.2);
        System.out.println(car);

        System.out.println("\nCheck if the Tucson model is on the map: " + car.containsKey("Tucson"));

        System.out.println("\nDisplay the consumption of Uno: " + car.get("Uno"));

        System.out.println("\nDisplay the models: ");
        Set<String> models = car.keySet();
        System.out.println(models);

        System.out.println("\nDisplay the consumptions of the cars: ");
        Collection<Double> consumptions = car.values();
        System.out.println(consumptions);

        System.out.println("\nDisplay the model highest economic and the consumption: ");
        Double efficientConsumption = Collections.max(car.values());
        Set<Map.Entry<String, Double>> entries = car.entrySet();
        String efficientModel = "";
        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(efficientConsumption)){
                efficientModel = entry.getKey();
                System.out.println("More efficient model: " + efficientModel +  " - " + efficientConsumption);
            }
        }
        
        System.out.println("\nDisplay the model lowest economic and your consumption: ");
        Double inefficientConsumption = Collections.min(car.values());
        String inefficientModel = "";
        for(Map.Entry<String, Double> entry: car.entrySet()){
            if(entry.getValue().equals(inefficientConsumption)){
                System.out.println("Less efficient model: "+ inefficientModel + " - " + inefficientConsumption);
            }
        }

        System.out.println("");
        Iterator<Double> iterator = car.values().iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("\nDisplay the sum of consumptions: " + sum);

        System.out.println("\nDisplay the average of consumptions of this car map: " + (sum/car.size()));

        System.out.println("\nRemove the models with the equal consumption 15.6km/L: ");
        Iterator<Double> iterator1 = car.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(car);
        
        System.out.println("\nDisplay all cars in the order they were reported: ");
        Map<String, Double> car1 = new LinkedHashMap<>();
        car1.put("Gol", 14.4);
        car1.put("Uno", 15.6);
        car1.put("Celta", 16.1);
        car1.put("HB20", 14.5);
        car1.put("Kwid", 15.6);
        System.out.println(car1.toString());

        System.out.println("Display map sorted by model: ");
        Map<String, Double> car2 = new TreeMap<>(car1);
        System.out.println(car2.toString());

        System.out.println("Delete the car map: ");
        car.clear();

        System.out.println("Check if the map is empty: " + car.isEmpty());
    }
}
