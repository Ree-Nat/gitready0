//Nathan Rinon
//CS1400
//Assignment 5
//October 31 2023


public class SudokuSquare {


    private int total; 
    private String error = "NOT A MAGIC SQUARE";
    private String valid = "A MAGIC SQUARE!";
    public String check(int square[][]){
        //row check
        for(int row = 0; row < square.length; row++){
            total = getRowTotal(square, row);
            if(total != 15)
                return error;
            else
                total = 0;

        //column check
        for(int column = 0; column < 3; column++)
            total = getColumnTotal(square, column);
            if(total != 15)
                return error;
            else
                total = 0;
        }

        //diagnol check

        total = getRightdiagnolTotal(square);
            if(total != 15)
                return error;
            else
                total = 0; 
        
        total = getleftdiagnolTotal(square);
            if(total != 15)
                return error;
            else
                total = 0;

        //if all pass return valid
        return valid;
    }

    public int getRowTotal(int array[][], int row){
        int rowTotal = 0;
        for(int column = 0; column < array[row].length; column++)
            rowTotal += array[row][column];
        return rowTotal;
    }

    public int getColumnTotal(int array[][], int column){
        int columnTotal = 0;
        for(int row = 0; row < array.length; row++)
            columnTotal += array[row][column];
        return columnTotal; 
     }

    public int getRightdiagnolTotal(int array[][]){
        int diagnoalTotal = 0; 
        int columnIndex = 0; 
        for(int row = 0; row < array.length; row++){
            diagnoalTotal += array[row][columnIndex];
            columnIndex++;
        }
        return diagnoalTotal;
    }

      public int getleftdiagnolTotal(int array[][]){
        int diagnoalTotal = 0; 
        int columnIndex = 2; 
        for(int row = 0; row < array.length; row++){
            diagnoalTotal += array[row][columnIndex];
            columnIndex--;
        }
        return diagnoalTotal;
    }

}