import java.util.Scanner;

public class palindrome
{
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    System.out.println("enter a charcter");
    char ch=sc.nextLine().charAt(0);
    int len=str.length();
    int count=0;
    int i;
    for(i=0;i<len;i++)
    {
    if(str.charAt(i)==ch)
    {
    count++;
    }
    }
    System.out.println("the frequency is"+count);
    }
    }
