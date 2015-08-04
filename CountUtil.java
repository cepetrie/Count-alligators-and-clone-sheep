/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christina
 */
public class CountUtil {
    
    //static method that lets you count any Countable object
    //a specified number of times
    public static void count (Countable c, int maxCount)
    {
        for (int i=0; i<maxCount;i++)
        {
            c.incrementCount();
            c.getCount();
            
            System.out.println(c.getCountString());
        }
    }
    
}
