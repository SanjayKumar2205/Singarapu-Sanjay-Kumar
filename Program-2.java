// Project Name:Singarapu Sanjay Kumar

import java.util.*;
public class Program2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print((2*i-1));
            if(i<n)
            {
                System.out.print(", ");
            }
        }
    }
}
    
    
