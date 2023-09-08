/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;
import java.util.function.IntBinaryOperator;

/**
 *
 * @author ASUS
 */
public class SearchPrograming extends Menu<String> {

    Validtion vl = new Validtion();

    static String[] mc = {"Linear Search", "Binary Sort", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchPrograming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();

    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1: {
                linearSearch();
                break;
            }
            case 2: {
                binarySearch();
                break;
            }
            case 3: {
                System.exit(0);

            }
        }
    }

    public void linearSearch() {
        System.out.println("The array ");
        library.display(array);
        int x = vl.getValueInt("Enter search value:");
        if (algorithm.linearSearch(array, x) != -1) {
            System.out.println("Found " + x + " at index:" + (algorithm.linearSearch(array, x)));
        } else {
            System.out.println("No have number " + x + " in array");
        }
        System.out.println("");
    }

    public void binarySearch() {
        System.out.print("Sorted array: ");
        algorithm.quickSort(array, 0, size_array - 1);
        library.display(array);
        int x = vl.getValueInt("Enter search value:");

        if (algorithm.binarySearch(array, 0, array.length - 1, x) != -1) {
            System.out.println("Found " + x + " at index:" + (algorithm.binarySearch(array, 0, array.length - 1, x)));
        } else {
            System.out.println("No have number " + x + " in array");
        }
        System.out.println("");
    }

}
