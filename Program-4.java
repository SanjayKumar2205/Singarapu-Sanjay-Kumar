//Project Name : Singarapu Sanjay Kumar

import java.util.*;
public class Program4
{
    public static void main(String args[])
    {
        Integer[] a = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<=9;i++)
        {
            int c=0;
            for(int x:a)
            {
                if(x%i==0)
                {
                    c++;
                }
            }
            hm.put(i,c);
        }
        System.out.println(hm);
    }
}
    
    
