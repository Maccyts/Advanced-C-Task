import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args) 
    {

    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
        for(int j=s.length()-1;j>=0;j--)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                System.out.print(j+" ");
                break;
            }
        }
    }
    }
}
