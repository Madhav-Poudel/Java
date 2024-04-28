import java.util.Scanner;
public class DayThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get 10 numbers from user
        // print the following
        // max value
        // min value
        // average value
        // sum of all values
        int n = input.nextInt();
        int sum = n;
        int min = n;
        int max = n;
        
        for(int i = 1; i <= 9; i ++) {
            n = input.nextInt();
            sum = sum + n;
            if(<condition>) {
            }
            // check if n is greater than max; if so max = n
            // check if n is smaller than min; if so min = n
        }
        
        float avg = sum / 10;
        
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + avg);
        
        //int m = input.nextInt();
        //double d = input.nextDouble();
        //String s = input.next();        // a single word
        //String k = input.nextLine();    // entire line (sentence)
        
        System.out.printf("You have entered %d and %d\n", n, m);
        //System.out.print("")
        //System.out.println("\n")
    }
}
