/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreferencedemo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author Dell
 */
public class MethodReferenceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test =new Test();
        //Test.Hello();
        
        //Function<ReturnType , InputType>
        Function<Integer,String> funA=x -> Integer.toBinaryString(x);
        System.out.println("Value : "+funA.apply(10));
        
        Function<Integer,String> funB = Integer::toBinaryString;
        System.out.println("Value : "+funB.apply(11));
        
        Function<Integer,String> funC = Test::Helo;
        System.out.println("Value : "+funC.apply(2));
        
        Function<Integer,Boolean> funD = Test::Check;
        System.out.println("Number is positive : "+funD.apply(4));
        
        Function<String,Integer> funF = x-> Test.CalculateLength(x);
        System.out.println("Length is : "+funF.apply("Aptech Computer"));
        
        Function<String, Integer> funG = Test::CalculateLength;
        System.out.println("Length is : "+ funG.apply("Aptech"));
        
        
        //Supplier (returns any type , receives nothing
        Supplier<Integer> supA = () -> "Aptech".length();
        System.out.println("Length using Instance : "+supA.get());
        
        Supplier<Integer> supB = "Aptech"::length;
        System.out.println("Length using Instance : "+supB.get());
        
        Supplier<Integer> s=test::Hello;
        System.out.println(s.get());
        
        
        //Consumer (returns nothing, receive any type)
        Consumer<String> con= x -> System.out.println(x);
        con.accept("Demo Consumer");
        
        Consumer<String> con1 = test::Demo;
        con1.accept("Consumer Calling Demo");
        
        
        //Predicate (returns boolean , receive any type)
        Predicate<Integer> predicate=Test::Check;
        System.out.println("Predicate : "+predicate.test(-6));
        
        //BiFunction Receives 2 values and return any type <FirstArgument,SecondArgument,ReturnType>
        BiFunction<Integer,Integer,Integer> biFun=test::add;
        System.out.println("Add : "+biFun.apply(5, 7));
        
        BiFunction<String,String,Integer> biFun1=test::MergeAndCal;
        System.out.println("String length after merge : "+biFun1.apply("Komal","Saleem"));
        
        BiFunction<String,Integer,Integer> biFun2=test::Info;
        System.out.println("Return Integer : "+ biFun2.apply("Ali Khan",3));
        
        BiConsumer<String,String> biCon=test::MergeAndCal1;
        biCon.accept("Hello", "Students");
    }
    
}
