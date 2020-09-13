/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionaldemo;

import java.util.function.Function;

/**
 *
 * @author Dell
 */
public class FunctionalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add      = (value) -> value + 3;
        
        //first call the add and then multiply Function. The resulting calculation will be (2 + 3) * 2 = 10
        Function<Integer, Integer> addThenMultiply = multiply.compose(add);

        Integer result1 = addThenMultiply.apply(2);
        System.out.println(result1);
        
        //first call the multiply and then add Function. The resulting calculation will be (2 * 2) + 3 = 7
        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);

        Integer result2 = multiplyThenAdd.apply(2);
        System.out.println(result2);
    }
    
}
