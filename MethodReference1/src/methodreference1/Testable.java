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
@FunctionalInterface
public interface Testable {
    //blank Constructor 
//    public Test getTest();
    //Parametrized Constructor
    public Test getTest(String msg);
}
