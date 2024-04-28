public class Reverse {
    public static void main(String[] args) {
        
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i ++) {
            numbers[i] = input.nextInt();
        }
       
        for(int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
