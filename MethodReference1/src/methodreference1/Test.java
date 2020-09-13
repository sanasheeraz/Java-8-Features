/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference1;

/**
 *
 * @author Dell
 */
public class Test {
    
    //Blank constructor
    public Test()
    {
        System.out.println("Blank Constructor");
    }
    
    //Parametrized constructor 
    public Test(String msg)
    {
        System.out.println("Parametrized Constructor : "+msg);
    }
    
    public int CalculateLength(String str)
    {
        return str.length();
    }
    
    public int CheckNum()
    {
        return 6;
    }
    
}
