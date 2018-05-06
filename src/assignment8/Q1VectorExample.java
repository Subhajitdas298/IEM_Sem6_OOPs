package assignment8;

import java.util.ArrayList;
import java.util.Vector;

public class Q1VectorExample {

    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(45);
        arr.add("so");
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add("kk");
        System.out.println("Vector is " + v);
        v.add("alba");
        v.add(1, 5);
        System.out.println("Vector is " + v);
        v.addAll(arr);
        System.out.println("Vector is " + v);
        Vector v_clone = new Vector();
        v_clone = (Vector) v.clone();
        if (v.isEmpty()) {
            System.out.println("Vector is clear");
        }
        v.clear();
        System.out.println("after clearing: " + v);
        if (v.isEmpty()) {
            System.out.println("Vector is clear");
        }
        System.out.println("Clone of v: " + v_clone);
        v = (Vector) v_clone.clone();
        if (v.contains("alba")) {
            System.out.println("alba exists");
        }
        System.out.println("element at index 2 is: " + v.get(2));
        System.out.println("index of alba is: " + v.indexOf("alba"));
        System.out.println("last occurance of alba is: " + v.lastIndexOf("alba"));
        v.remove("alba");
        System.out.println("after removal: " + v);
        System.out.println("first element of vector is: " + v.firstElement());
        System.out.println("Size of vector: " + v.size());
        System.out.println("Initial capacity: " + v.capacity());
        v.trimToSize();
        System.out.println("capacity after triming: " + v.capacity());
    }

}
