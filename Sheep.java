/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christina
 */

//Sheep class implements Countable and Cloneable interfaces
public class Sheep implements Countable, Cloneable {
    
    //instance variables that store the count 
    //and the name of the sheep
    private int countSheep = 0;
    private String sheepName;
    
    //method to set sheep name
    public void setSheepName(String sheep)
    {
        sheepName = sheep;
    }
    
    //method to get sheep name
    public String getSheepNames()
    {
        return sheepName;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException
    {
  
            return super.clone();
       
    }
    
    //overrides the Countable interface method
    //method increments count of sheep +1
    @Override 
    public void incrementCount() 
    {
        countSheep = countSheep + 1;
    }
    
    //overrides the Countable interface method
    //method resets the count to 0
    @Override
    public void resetCount()
    {
        countSheep = 0;
    }
    
    @Override
    public int getCount()
    {
        return countSheep;    
    }
    
    @Override
    public String getCountString()
    {
        return getCount() + "" + getSheepNames();    
    }
    
}
