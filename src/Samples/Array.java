package Samples;// Java program to demonstrate the
// working of ArrayList in Java
import java.util.*;
class Array {
    public static void main(String[] args){
        // Size of the // ArrayList
        int n = 5;
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);//n=5
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)//n=5
            arrli.add(i);
        //1,2,3,4,5
        // Printing elements
        System.out.println(arrli);
        // Remove element at index 3
        arrli.remove(3);
        // Displaying the ArrayList
        // after deletion
        System.out.println(arrli);
        // Printing elements one by one
        for (int i = 0; i < arrli.size(); i++)
            System.out.print(arrli.get(i) + " ");

    }
}
