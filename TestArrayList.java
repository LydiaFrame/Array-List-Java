/*
 * Program: TestArrayList.java
 * Student: Lydia Frame 
 * Purpose: Demonstrates the usage of Java's ArrayList to manage and manipulate a list of employee positions 
 *          in a grocery store. This example focuses on creating, adding, moving, and printing elements 
 *          in an ArrayList, with positions ordered by importance.
*/

import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; // Import ArrayList class
import java.util.Arrays;

public class TestArrayList {

    public static void main(String[] args) {
    
        // Step 1: Create an ArrayList to hold positions
        ArrayList<String> position = new ArrayList<>(Arrays.asList("Bagger"));

        // Step 2: Populate the ArrayList with starting positions
        position.add("Cashier");
        position.add("Manager"); 

        System.out.println("Initial Array List: " + position);

        // Step 3: Add "Customer Service" to position[2]
        position.add(2, "Customer Service");
        System.out.println();
        System.out.println("After adding 'Customer Service' at index 2: " + position);

        // Remove Manager from Array 
        position.remove("Manager");
        System.out.println();
        System.out.println("After Removing 'Manager' from Array: " + position);
        
        // Step 4: Move "Manager" to position[3]
        position.add(3, "Manager"); // Insert "Manager" at index 3
        System.out.println();
        System.out.println("After moving 'Manager' to index 3: " + position);

        // Step 5: Print the starting position (positon[0])
        System.out.println("\nStarting position: " + position.get(0));

        // Step 6: Print the whole array in order of positions (least to most important)
        System.out.println("\nPositions from least to most important:");
        for (String positions : position) {
            System.out.println(positions);
        }

        // Step 7: Print the size of the ArrayList
        System.out.println("\nSize of Array: " + position.size());

        
        
        
        
    }
}