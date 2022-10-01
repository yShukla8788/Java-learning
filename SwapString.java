import java.util.Scanner;

public class SwapString
{
    public static void main(String[] args)
    {
       
        Scanner scan = new Scanner(System.in);
        String str1, str2, temp; 
         
        System.out.print("First String : ");
        str1 = scan.nextLine();
        System.out.print("Second String : ");
        str2 = scan.nextLine();
        
        System.out.println("\nBefore Swapping :");
        System.out.print("Str1 = " +str1+ "\n");
        System.out.print("Str2 = " +str2+ "\n");
        
        temp = str1;
        str1 = str2;
        str2 = temp;
        
        System.out.println("\nAfter Swapping :");
        System.out.print("Str1 = " +str1+ "\n");
        System.out.print("Str2 = " +str2+ "\n");
    }
}