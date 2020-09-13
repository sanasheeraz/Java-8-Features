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
public class Test implements Function<String,Integer>{

    @Override
    public Integer apply(String t) {
        return t.length();
    }
//
//    @Override
//    public <V> Function<V, Integer> compose(Function<? super V, ? extends String> fnctn) {
//        return Function.super.compose(fnctn); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public <V> Function<String, V> andThen(Function<? super Integer, ? extends V> fnctn) {
//        return Function.super.andThen(fnctn); //To change body of generated methods, choose Tools | Templates.
//    }
//    
}
