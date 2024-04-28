public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr = new int[SIZE];
        float[] arr = new float[SIZE];
        
Syntax: <datatype>[] <var-name> = new <datatype>[<size>];
    
        int[] myArray = new int[10];
        
        //int myArray[10];  in C

        for(int i = 0; i < myArray.length; i ++) {
            // take input from keyboard
            myArray[i] = input.nextInt();
        }
        
        for(int i = 9; i >= 0; i --) {
            //print the element at current index
            
        }
        
        
        arr[0] = 10;
        arr[9] = 20;
        
        int a = arr[0];
        
        // TASK: get 10 numbers from user and print the array
        // in reverse order.
    }
}
