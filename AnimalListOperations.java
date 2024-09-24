// WAP to create an ArrayList "animals1". Perform the following operations:
// Add following elements:
// Car
// Dog
// Cow
// Lion
// Print the list
// Add Tiger at index 0 Add Zebra at index 3
// Print the list
// Create a now ArrayList "animals2". Add the elements: Kangaroo, Donkey, Cow in it
// Add animals2 to animall.
// Print the element at index 2
// Print the index of first occurrence of Cow
// Print the index of last occurrence of Cow
// heck and print whether Dog is present in the list or not Check and print whether Rat is present in the list or not
// Check whether list is empty or not
// Print number of elements in list
// Remove Cow
// Remove the element at index 2
// Add "Ant" at index 2
// Update element at index 2 to Antelope
// Iterate all the elements using
// for loop
// • Ennerred for loop
// Iterator
// List Iterator

import java.util.*;

public class AnimalListOperations {
    public static void main(String[] args) {
        ArrayList<String> animals1 = new ArrayList<>();
        animals1.add("Car");
        animals1.add("Dog");
        animals1.add("Cow");
        animals1.add("Lion");
        
        System.out.println("Initial animals1 list: " + animals1);
        
        animals1.add(0, "Tiger");
        animals1.add(3, "Zebra");
        
        System.out.println("Animals1 after adding Tiger and Zebra: " + animals1);

        ArrayList<String> animals2 = new ArrayList<>();
        animals2.add("Kangaroo");
        animals2.add("Donkey");
        animals2.add("Cow");
        
        animals1.addAll(animals2);
        
        System.out.println("Element at index 2: " + animals1.get(2));
        
        System.out.println("First occurrence of Cow at index: " + animals1.indexOf("Cow"));
        
        System.out.println("Last occurrence of Cow at index: " + animals1.lastIndexOf("Cow"));

        System.out.println("Check for Dog? :" + animals1.contains("Dog"));

        System.out.println("Check for Rat? :" + animals1.contains("Rat"));

        System.out.println("List is Empty? :" + animals1.isEmpty());

        System.out.println("Print Number of Elements in  list?" + animals1.size());

        animals1.remove("Cow");
        
        animals1.remove(2);
        
        animals1.add(2, "Ant");
        
        animals1.set(2, "Antelope");
        
        System.out.println("Final animals1 list: " + animals1);

        System.out.println("For loop:");
        for (int i = 0; i < animals1.size(); i++) {
            System.out.println(animals1.get(i));
        }

    }
}
