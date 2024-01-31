//Nathan Rinon
//CS1400
//Assignment 5
//October 31 2023

public class ArrayPractice{

    public static void main(String[] args){

        int[][] array = { {2, 3, 4, 1}, {1, 2, 7, 3, 5}};

        ArrayPracticeDemo calculator = new ArrayPracticeDemo();

        System.out.println("Array Analysis:\n");

        System.out.println("Total: " + calculator.getTotal(array));
        System.out.println("Average: " + calculator.getAverage(array));
        for(int row = 0; row < array.length; row++)
            System.out.println("Row " + row + " total: " + calculator.getRowTotal(array, row));
        for(int column = 0; column < 3; column++)
            System.out.println("Column " + column + " total: " + calculator.getColumnTotal(array, column));
        for(int row = 0; row < array.length; row++)
            System.out.println("Highest in Row " + row + " total: " + calculator.getHighestInRow(array, row));
         for(int row = 0; row < array.length; row++)
            System.out.println("lowest in Row " + row + " total: " + calculator.getLowestInRow(array, row));
   
   

    }
}