/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationreflection;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import java.util.List;
/**
 *
 * @author Sana
 */
public class AnnotationReflection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchMethodException {
        // TODO code application logic here
        Method sampMeth = AnnotationReflection.class.getMethod("sampMeth", List.class);//here Method defined as sampMeth
        
        ParameterizedType sampleLiTy = (ParameterizedType)sampMeth. getGenericParameterTypes()[0];//here List Type
        System.out.println("Parameter Type : "+sampleLiTy);
        
        ParameterizedType sampleClTy = (ParameterizedType)sampleLiTy. getActualTypeArguments()[0];//here Class Type
        System.out.println("Arguments : "+sampleClTy);
        
        WildcardType sampleGenTy = (WildcardType)sampleClTy. getActualTypeArguments()[0];//here generic Type
        System.out.println("Generic Type : "+sampleGenTy);
        
        Class<?> SampleGenCl = (Class<?>)sampleGenTy.getUpperBounds()[0];// here generic Class defined as sampleGenCl
        System.out.println("Generic Class : "+SampleGenCl);
        
        boolean isException = Exception.class. isAssignableFrom(SampleGenCl);
        System.out.println("This Class extends RuntimeException: " + isException);
        
        boolean isRuntimeException = RuntimeException.class. isAssignableFrom(SampleGenCl);
        System.out.println("This Class extends RuntimeException: " + isRuntimeException);
            
    }
    public void sampMeth(List<Class<? extends Exception>> exceptionClasses) 
    {

    }   
    
}






