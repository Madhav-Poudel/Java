import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
System.out.print(Enter a number of coordinates: ");
int sizeX = input.nextInt();
int[] x = new int[sizeX];
int[] y = new int[sizeY];




for(int i=0; i<sizeX;i++){
x[i] =input.nextInt();
}
for (int i=0; i<sizeX;i++){
y[i] = line(2,x[i],5);
}


System.out.print("\nX|");
for(int i=0; i<sizeX;i++){
System.out.printf("%d\t| \t",i);
}

System.out.println(" ");

System.out.println("Y| ");

for(int i=0; i<sizeX;i++){
System.out.printf("%d \t \t",y[i]);
}

}

public static int yvalue(int m,int x,int c){
return m*x+c;
}
}