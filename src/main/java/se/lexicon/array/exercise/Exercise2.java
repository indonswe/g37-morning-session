package se.lexicon.array.exercise;

import java.util.Arrays;

public class Exercise2 {

    public static void main( String[] args )
    {
        int[] numbers = {43,346,237,2348,567,345};

        int indexToFind = 43;

        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, indexToFind);

        if(index >= 0) {
            System.out.println("Index Found!");
            System.out.println("Element: " + indexToFind +" was located at index: " + index);

        }else {
            System.out.println("Could not find element: " + indexToFind);
        }

    }
}
