import java.util.*;
public class Checktwostring
{
	public static void main(String[] args) 
	{
	    Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
            {
                count++;    
            }
        }
        if(count==1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
	}
}
        
