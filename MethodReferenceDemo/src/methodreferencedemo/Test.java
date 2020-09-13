/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreferencedemo;

/**
 *
 * @author Dell
 */
public class Test {
    
    //Supplier (returns any type , receives nothing
    public int Hello()
    {
        System.out.println("Hello from instance method");
        return 7;
    }
    public static String Helo(int num)
    {
        String result;
        switch(num)
        {
            case 1:
                result="One";
                break;
            case 2:
                result="Two";
                break;
            case 3:
                result="Three";
                break;
            case 4:
                result="Four";
                break;
            default:
                result="Not found please use 1-4";
        }
        return result;
    }
    
    //Predicate (returns boolean , receive any type)
    public static boolean Check(int num)
    {
        return num>0;
    }
    
    public static int CalculateLength(String str)
    {
        return str.length();
    }
    
    //Consumer (returns nothing, receive any type)
    public void Demo(String str)
    {
        System.out.println(str);
    }
    
    //BiFunction Receives 2 values and return any type
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
    
    public int MergeAndCal(String str1,String str2)
    {
        return str1.length()+str2.length();
    } 
    
    public int Info(String name,int Id )
    {
        return Id;
    }
    
    public void MergeAndCal1(String str1,String str2)
    {
        System.out.println("bi Concumer : "+ (str1.length()+str2.length()));
    } 
}