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
public interface TestInterface2 {
        public void square();
        public default void Display()
        {
            System.out.println("Test Interface 2");
        }
}
