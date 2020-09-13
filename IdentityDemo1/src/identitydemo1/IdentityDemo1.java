/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identitydemo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Dell
 */
public class IdentityDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //List<String> names=Arrays.asList("Marium","Komal","Kamran","Iqra","Javeria");
        List<String> names=Arrays.asList("Marium","Kamran","Komal","Kamran","Marium","Iqra","Javeria","Marium");
        //Set : A collection that contains no duplicate elements
        Set<String> namesSet=new HashSet(names);
        boolean hasDuplicate= names.size() != namesSet.size();
        //Collector : which collects all the input elements into a Set.
        names.stream().map(getDuplicateFunction(names,hasDuplicate)).collect(Collectors.toSet()).forEach(System.out::println);
    }
    
    public static Function<String,String> getDuplicateFunction(List<String> names,boolean hasDuplicate)
    {
        // Collections.frequency(names, name) => to get duplicate count
        return hasDuplicate ? x -> x +"("+ Collections.frequency(names, x)+")" : Function.identity();
    }
}
