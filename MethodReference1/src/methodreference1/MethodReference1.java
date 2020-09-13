/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author Dell
 */
public class MethodReference1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //With blank Constructor
//        Test test=new Test();
//        Testable t1=Test::new;
//        t1.getTest();
        //With Parametrized Constructor
        Test test=new Test("With Message");
        Testable t1=Test::new;
        t1.getTest("With Some Text");
        
        Function<String,Integer> fun = test::CalculateLength;
        System.out.println("Length : "+fun.apply("Eductaion"));
        
        Supplier<Integer> sup = test::CheckNum;
        System.out.println("Num : "+sup.get());
        
    }
    
}
