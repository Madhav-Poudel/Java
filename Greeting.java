import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        String name = input.next();
                        
        //              input.nextInt();            %d
        //              input.nextDouble();         %f
        //              input.next();               %s
        //              input.nextLine();           %s
        
        System.out.printf("Hello %s!\n", name);
        
    }
}
