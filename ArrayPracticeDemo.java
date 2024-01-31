//Nathan Rinon
//CS1400
//Assignment 5
//October 31 2023

public class ArrayPracticeDemo {

    private int total;
    private int average;
    private int rowTotal;
    private int columnTotal;
    private int highestInRow;
    private int lowestinRow;

    public int getTotal(int array[][])
    {
        total = 0;
        for(int row = 0; row < array.length; row++)
            for(int column = 0; column < array[row].length; column++)
            {
                total += array[row][column]; 
            }
        return total;
    }

    public int getAverage(int array[][]){
        total = 0;
        total = getTotal(array);
        int cells = 0;

        for(int row = 0; row < array.length; row++)
            for(int column = 0; column < array[row].length; column++){
                cells++;
            }
        average = total/cells;
        return average;
    }
    public int getRowTotal(int array[][], int row){
        rowTotal = 0;
        for(int column = 0; column < array[row].length; column++)
            rowTotal += array[row][column];
        return rowTotal;
    }

    public int getColumnTotal(int array[][], int column){
        columnTotal = 0;
        for(int row = 0; row < array.length; row++)
            columnTotal += array[row][column];
        return columnTotal; 
    }

    public int getHighestInRow(int array[][], int row){
        highestInRow = array[row][0];

        for(int column = 0; column < array[row].length; column++){
            if(highestInRow < array[row][column])
                highestInRow = array[row][column];
        }
        return highestInRow;
    }

    public int getLowestInRow(int array[][], int row){
        lowestinRow = array[row][0];

        for(int column = 0; column < array[row].length; column++)
            if(lowestinRow > array[row][column])
                lowestinRow = array[row][column];

        return lowestinRow;
    }

}
