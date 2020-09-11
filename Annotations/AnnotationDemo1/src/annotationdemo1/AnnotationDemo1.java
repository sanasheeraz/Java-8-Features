/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotationdemo1;
import java.io.Serializable;

/**
 *
 * @author Sana
 */
public class AnnotationDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        myClass myclass=new myClass("Hello");
        myclass.getAbc();
        myclass.alertMethod();
       
        String input = null;
        String unused; // DID NOT report unused variable

        System.out.println("Input "+input); // Reported usage of null
    }
    
}
@Deprecated
class myClass{
   private String abc;
   myClass(String value)
   {
       abc=value;
   }
   @Deprecated
   String getAbc()
   {
       return abc;
   }
   @SuppressWarnings("unmarked")
    public void alertMethod() {
        System.out.println("Supress Demo");
    }
    //@SuppressWarnings("unmarked")
    
}
