/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethoddemo;

/**
 *
 * @author Dell
 */
public interface TestInterface {
    public void show();
    public default void Display()
    {
        System.out.println("Added in Java 8");
    }
    public static void Count()
    {
        System.out.println("Static Method in Interface");
    }
    
}
