/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareflectiondemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Sana
 */
public class JavaReflectionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Test test=new Test();
        
        Class cls=test.getClass();
        System.out.println("Name of the class : "+cls.getName());
        
        Method[] methods=cls.getMethods();
        for(Method method:methods)
        {
            System.out.println("Method Name : "+method);
        }
        try{
            Method m1=cls.getDeclaredMethod("method1",null);
            m1.invoke(test, null);
            
            Method m2=cls.getDeclaredMethod("method2",int.class);
            m2.invoke(test, 5);
            
            Method m3=cls.getDeclaredMethod("method3",null);
            System.out.println("Value of method 3 : "+m3.invoke(test,null));
            
            Method m4=cls.getDeclaredMethod("method4", null);
            m4.setAccessible(true);
            m4.invoke(test,null);
           
        }catch(Exception ex)
        {
            System.out.println("Exception : "+ex.getMessage());
        }
       
    }
    
}

class Test{
    public int abc;
    private int xyz;
    public void method1(){
        System.out.println("Calling Method 1");
    }
    public void method2(int num){
        System.out.println("Calling Method 2 wiht paarmeter : "+num);
    }
    public int method3(){
        return 5; 
    }
    private void method4()
    {
        System.out.println("Private method invoked");
    }
}
