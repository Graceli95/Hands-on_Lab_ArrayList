package utils;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    //      Create the ArrayList: Declare an ArrayList of type String to store names.
    ArrayList<String> studentNames = new ArrayList<>();

    public void arrayStudent() {
        studentNames.add("Tom");
        studentNames.add("Jack");
        studentNames.add("Chris");
        studentNames.add("Steven");
        studentNames.add("Jerry");

        System.out.println(studentNames);

//       Use the remove() method to delete a name. You can remove by either index or name
        studentNames.remove(4);
        System.out.println("After removing a name, the updated list " + studentNames);
        Collections.sort(studentNames);
        System.out.println("after sort the list alphabetically");
        System.out.println("print the sorted list " + studentNames);




    }

}
