package utils;

import model.Student;

import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();


        studentNames.add("Tom");
        studentNames.add("Jack");
        studentNames.add("Chris");
        studentNames.add("Steven");
        studentNames.add("Jerry");

        System.out.println(studentNames);

        studentNames.remove("Jerry");
        System.out.println("After removing a name, the updated list " + studentNames);
        Collections.sort(studentNames);
        System.out.println("after sort the list alphabetically");
        System.out.println("print the sorted list " + studentNames);




    }

}
