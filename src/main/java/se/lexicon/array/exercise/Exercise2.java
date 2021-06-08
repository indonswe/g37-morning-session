package se.lexicon.array.exercise;

import java.util.Arrays;

public class Exercise2 {

    public static void main( String[] args )
    {
        int[] numbers = {43,346,237,2348,567,345};

        int indexToFind = 43;

        int returnValue = indexOf(numbers, indexToFind);

        System.out.println("returnValue = " + returnValue);

    }

    private static int indexOf(int[] source, int indexToFind) {
        Arrays.sort(source);
        int index = Arrays.binarySearch(source, indexToFind);

        if(index >= 0) {
            System.out.println("Index Found!");
            System.out.println("Element: " + indexToFind +" was located at index: " + index);
            return index;
        }else {
            System.out.println("Could not find element: " + indexToFind);
            return -1;
        }
    }
}
