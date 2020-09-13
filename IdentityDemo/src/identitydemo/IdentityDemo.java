/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identitydemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author Dell
 */
public class IdentityDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Function<Integer,Integer> fun1=Function.identity();
        Function <Integer,Integer> fun2= e->e;
        Function<Integer,Integer> fun11=Function.identity();
        Function <Integer,Integer> fun21= e->e;
        
//        System.out.println("Identity Function : "+fun1.apply(10)); // 10 
//        System.out.println("Lambda Function : "+fun2.apply(10));
//        
//        List<String> names = Arrays.asList("Komal","Abdullah","Iqra","Fariha");
//        
//        System.out.println("**********Function.Identity***********");
//        names.stream().map(Function.identity()).forEach(System.out::println);
//        
//        System.out.println("**********Lambda Expression***********");
//        names.stream().map(e->e).forEach(System.out::println);

          System.out.println("Function 1 : "+fun1);
          System.out.println("Function 11 : "+fun11);
          System.out.println("Function 2 : "+fun2);
          System.out.println("Function 21 : "+fun21);
          
          
    }
    
}
