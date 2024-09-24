   import java.util.Scanner;

public class Rect
{
    public static void main(String[]args) {
    	
        Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the length and breadth: ");
        int a,b,area;
        a=sc.nextInt();
        b=sc.nextInt();
        area=a*b;
        System.out.println("area="+area);
     
    }
}

