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
public class Test implements TestInterface,TestInterface2{

    @Override
    public void show() {
        System.out.println("Abstract method");
    }
//    @Override
//    public void Display()
//    {
//        System.out.println("New Implementation");
//    }

    @Override
    public void Display()
    {
        //TestInterface.super.Display();
        TestInterface2.super.Display();
    }
    @Override
    public void square() {
        System.out.println("Squarre");
    }
    
}
