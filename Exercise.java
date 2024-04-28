public class Exercise {
    public static void main(String[] args) {
    
        // Multi-dimensional array in java
//         int[][] 
         
        int size = 20;
        
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = input.nextInt();
        }
       
        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
