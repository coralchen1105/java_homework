package Vararg

import java.util.*; 
public class Vararg 
{ 
    public static void main(String args[])  
    { 
        List<String> list = new ArrayList<String>();  
        list.add( new String("genericexample") ); 
        list.add( new String("second") ); 
        System.out.println(list.get(0));
        System.out.println(list.size());
        
        byte by = (byte) 128;
        System.out.print(by);

        		
        
        Iterator<String> itr = list.iterator(); 
        
//        String str = (String)itr.next(); 
//        System.out.println(str);
        while( itr.hasNext() ) 
        { 
            String str = (String)itr.next(); 
            
            System.out.println( str ); 
        } 
       
        int[]arr=new int[]{1,2,3,4};
        String str= Arrays.toString(arr);
        System.out.println(str);
    } 
}