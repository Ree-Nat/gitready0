//Nathan Rinon
//CS1400
//Assignment 5
//October 31 2023

public class SudokuSquareDemo {

    public static void main(String[] args){
    int[][] square = {{4, 10, 2}, {3, 5, 7}, {8, 1, 6}};
    SudokuSquare calculate = new SudokuSquare();

    //calculate each components of sudoku square
    int rightDiagnoalTotal = calculate.getRightdiagnolTotal(square);
    int leftDiagnolTotal = calculate.getleftdiagnolTotal(square);

    System.out.println("Right diagnol total: " + rightDiagnoalTotal);
    System.out.println("Left diagnol total: " + leftDiagnolTotal);
    for(int row = 0; row < square.length; row++)
        System.out.println("Row " + row + " total: " + calculate.getRowTotal(square, row));
    for(int column = 0; column < 3; column++)
        System.out.println("Column " + column + " total: " + calculate.getColumnTotal(square, column));

    //Prints out the retrun string that states whether its a sudoku square.
    System.out.println(calculate.check(square));


}
}