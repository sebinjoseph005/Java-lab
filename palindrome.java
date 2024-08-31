import java.util.Scanner;

public class palindrome
{
    public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the word");
    String str=sc.nextLine();
    int len = str.length();
    int i;
    int flag=0;
    for(i=0;i<len/2;i++)
    {
    if(str.charAt(i)!=str.charAt(len-i-1))
    {
    flag=1;
    break;
    }
    }
    
    if(flag==1)
    {
    System.out.println("the string is not palindrome");
    }
    else{
    System.out.println("the string is palindrome");
    }
    }
    }
    
    
