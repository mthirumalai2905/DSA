public class TwoDimensionalArray {
    int[][] arr = null;

    // CONSTRUCTOR
    public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    // INSERTING VALUE IN THE ARRAY
    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("Value has been inserted!");
            } else {
                System.out.println("The cell is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("We cannot insert the element due to an out-of-bound exception.");
        }
    }

    // ACCESING CELL VALUE FROM GIVEN ARRAY 
    public void accessCell(int row, int col){
        System.out.println("\nAccessing row " +row+ "\nAccessing column," +col);
        try{
            System.out.println("Cell value is: "+ arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index for 2D array");
        }
    }


    // TRAVERSING IN 2D ARRAY
    public void traversal() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // Print a new line after each row
        }
    }

    //SEARCHING CELL VALUES 
    public void search(int value){
        try {
            for(int row=0; row<arr.length; row++){
                for(int col=0; col<arr[row].length; col++){
                    if(arr[row][col] == value){
                        System.out.println("The Value found at row: " +row+"col" + col);
                        return;
                    }
                    else{
                        System.out.println("The Value u r searching for isnt found");
                    }

                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot enter the value due to array index out of bounds exception");
        }
    }



    //DELETING CELL VALUES FROM THE 2D ARRAY
    public void delete(int row, int col){
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("The cell value has been remived succesfully");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can not delete the value from array because of exception");
            
        }
    }
    
}
