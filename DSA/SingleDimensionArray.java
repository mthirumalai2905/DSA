import java.util.Arrays;

public class SingleDimensionArray{
    int arr[];


    public SingleDimensionArray(int sizeofArray){
        arr = new int[sizeofArray];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //INSERTING ELEMENT IN ARRAYS

    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Successfully Inserted");
            }else{
                System.out.println("This cell is already occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array! ");
        }
    }


    //TRAVERSAL IN ARRAY
    public void traversalArray(){
        try{for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); 
        }
    } catch (Exception e) {
            System.out.println("Array no onger exist");
        }
        

    }


    //SEARCHING IN ARRAY
    public void searchArray(int valueToSearch){
        for(int i =0; i< arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value is found at the index of "+ i);
                return;
            }
            else{
                System.out.println("Element doesnt exist");
            }

        }
    }
}
