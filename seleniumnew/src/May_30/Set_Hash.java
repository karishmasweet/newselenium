package May_30;

import java.util.HashSet;
import java.util.Scanner;

public class Set_Hash 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> obj=new HashSet<Integer> ();
		
        obj.add(13);//one object
        obj.add(200);//2nd object
        obj.add(111);//3rd object
        obj.add(112);
        obj.add(12);
        obj.add(13);
        
        //for each loop and : means each
        for(Integer i:obj)//i will pick values one by one from obj
        	              // : means each
        {
        	System.out.println(i);
        }
        	
	}
}

