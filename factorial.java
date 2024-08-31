import java.util.Scanner;

public class factorial
{
    public static void main(String[]args) {
    	
    	int a,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        
        for(i=1;i<=a;i++)
        {
        fact=fact*i;
        }
        System.out.println("factorial="+fact);
}
}        
        
        
